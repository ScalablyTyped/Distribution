package typings.arangodb

import typings.arangodb.arangodbStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  var accept: applicationSlashjson
  var authorization: String
}

object AnonAccept {
  @scala.inline
  def apply(accept: applicationSlashjson, authorization: String): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccept]
  }
}

