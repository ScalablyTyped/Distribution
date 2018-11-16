package typings
package activexDashDiskquotaLib.DiskQuotaTypeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuotaStateConstants extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("DiskQuotaTypeLibrary.QuotaStateConstants")
@js.native
object QuotaStateConstants extends js.Object {
  @js.native
  sealed trait dqStateDisable
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.QuotaStateConstants
  
  @js.native
  sealed trait dqStateEnforce
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.QuotaStateConstants
  
  @js.native
  sealed trait dqStateTrack
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.QuotaStateConstants
  
  /* 0 */ val dqStateDisable: dqStateDisable with scala.Double = js.native
  /* 2 */ val dqStateEnforce: dqStateEnforce with scala.Double = js.native
  /* 1 */ val dqStateTrack: dqStateTrack with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.QuotaStateConstants with scala.Double
  ] = js.native
}

