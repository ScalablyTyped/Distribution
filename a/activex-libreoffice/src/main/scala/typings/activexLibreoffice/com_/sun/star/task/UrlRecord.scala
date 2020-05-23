package typings.activexLibreoffice.com_.sun.star.task

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlRecord extends js.Object {
  var Url: String
  var UserList: SafeArray[UserRecord]
}

object UrlRecord {
  @scala.inline
  def apply(Url: String, UserList: SafeArray[UserRecord]): UrlRecord = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any], UserList = UserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlRecord]
  }
}

