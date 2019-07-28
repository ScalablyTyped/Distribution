package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

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
    val __obj = js.Dynamic.literal(Url = Url, UserList = UserList)
  
    __obj.asInstanceOf[UrlRecord]
  }
}

