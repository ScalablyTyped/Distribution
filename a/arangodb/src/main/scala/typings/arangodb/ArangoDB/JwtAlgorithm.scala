package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.HS512
  - typings.arangodb.arangodbStrings.HS384
  - typings.arangodb.arangodbStrings.HS256
*/
trait JwtAlgorithm extends js.Object

object JwtAlgorithm {
  @scala.inline
  def HS256: typings.arangodb.arangodbStrings.HS256 = this.cast("HS256")
  @scala.inline
  def HS384: typings.arangodb.arangodbStrings.HS384 = this.cast("HS384")
  @scala.inline
  def HS512: typings.arangodb.arangodbStrings.HS512 = this.cast("HS512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

