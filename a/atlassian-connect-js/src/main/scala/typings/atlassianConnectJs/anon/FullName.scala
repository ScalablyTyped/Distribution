package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullName extends js.Object {
  var fullName: String
  var id: String
  var key: String
}

object FullName {
  @scala.inline
  def apply(fullName: String, id: String, key: String): FullName = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullName]
  }
}

