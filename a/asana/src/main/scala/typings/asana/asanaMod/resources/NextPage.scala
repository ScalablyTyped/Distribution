package typings.asana.asanaMod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPage extends js.Object {
  var offset: String
  var path: String
  var uri: String
}

object NextPage {
  @scala.inline
  def apply(offset: String, path: String, uri: String): NextPage = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NextPage]
  }
}

