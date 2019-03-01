package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlRecord extends js.Object {
  var Url: java.lang.String
  var UserList: activexDashInteropLib.SafeArray[UserRecord]
}

object UrlRecord {
  @scala.inline
  def apply(Url: java.lang.String, UserList: activexDashInteropLib.SafeArray[UserRecord]): UrlRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Url")(Url)
    __obj.updateDynamic("UserList")(UserList)
    __obj.asInstanceOf[UrlRecord]
  }
}

