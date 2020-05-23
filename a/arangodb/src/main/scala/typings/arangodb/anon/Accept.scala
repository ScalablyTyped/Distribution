package typings.arangodb.anon

import typings.arangodb.arangodbStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  var accept: applicationSlashjson
  var authorization: String
}

object Accept {
  @scala.inline
  def apply(accept: applicationSlashjson, authorization: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}

