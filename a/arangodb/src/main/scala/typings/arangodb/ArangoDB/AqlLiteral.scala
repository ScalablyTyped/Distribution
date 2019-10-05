package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AqlLiteral extends js.Object {
  def toAQL(): String
}

object AqlLiteral {
  @scala.inline
  def apply(toAQL: () => String): AqlLiteral = {
    val __obj = js.Dynamic.literal(toAQL = js.Any.fromFunction0(toAQL))
  
    __obj.asInstanceOf[AqlLiteral]
  }
}

