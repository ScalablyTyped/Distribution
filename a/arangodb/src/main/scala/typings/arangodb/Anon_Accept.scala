package typings.arangodb

import typings.arangodb.arangodbStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: applicationSlashjson
  var authorization: String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: applicationSlashjson, authorization: String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Accept]
  }
}

