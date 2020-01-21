package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBearer extends js.Object {
  var bearer: String
}

object AnonBearer {
  @scala.inline
  def apply(bearer: String): AnonBearer = {
    val __obj = js.Dynamic.literal(bearer = bearer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBearer]
  }
}

