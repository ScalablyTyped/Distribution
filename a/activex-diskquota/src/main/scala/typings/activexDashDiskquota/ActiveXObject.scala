package typings.activexDashDiskquota

import typings.activexDashDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import typings.activexDashDiskquota.activexDashDiskquotaStrings.OnUserNameChanged
import typings.activexDashDiskquota.activexDashDiskquotaStrings.pUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DiskQuotaControl,
    event: OnUserNameChanged,
    argNames: js.Array[pUser],
    handler: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ Anon_PUser, Unit]
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ Anon_PUser, Unit]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
  
    __obj.asInstanceOf[ActiveXObject]
  }
}

