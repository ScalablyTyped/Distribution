package typings
package activexDashDiskquotaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.DiskQuotaControl,
    event: activexDashDiskquotaLib.activexDashDiskquotaLibStrings.OnUserNameChanged,
    argNames: js.Array[activexDashDiskquotaLib.activexDashDiskquotaLibStrings.pUser],
    handler: js.ThisFunction1[
      /* this */ activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.DiskQuotaControl, 
      /* parameter */ Anon_PUser, 
      scala.Unit
    ]
  ): scala.Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.DiskQuotaControl, activexDashDiskquotaLib.activexDashDiskquotaLibStrings.OnUserNameChanged, js.Array[activexDashDiskquotaLib.activexDashDiskquotaLibStrings.pUser], js.ThisFunction1[
      /* this */ activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.DiskQuotaControl, 
      /* parameter */ Anon_PUser, 
      scala.Unit
    ]) => scala.Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
  
    __obj.asInstanceOf[ActiveXObject]
  }
}

