package typings
package activexDashDiskquotaLib.DiskQuotaTypeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccountStatusConstants extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("DiskQuotaTypeLibrary.AccountStatusConstants")
@js.native
object AccountStatusConstants extends js.Object {
  @js.native
  sealed trait dqAcctDeleted
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants
  
  @js.native
  sealed trait dqAcctInvalid
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants
  
  @js.native
  sealed trait dqAcctResolved
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants
  
  @js.native
  sealed trait dqAcctUnavailable
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants
  
  @js.native
  sealed trait dqAcctUnknown
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants
  
  @js.native
  sealed trait dqAcctUnresolved
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants
  
  /* 2 */ val dqAcctDeleted: dqAcctDeleted with scala.Double = js.native
  /* 3 */ val dqAcctInvalid: dqAcctInvalid with scala.Double = js.native
  /* 0 */ val dqAcctResolved: dqAcctResolved with scala.Double = js.native
  /* 1 */ val dqAcctUnavailable: dqAcctUnavailable with scala.Double = js.native
  /* 4 */ val dqAcctUnknown: dqAcctUnknown with scala.Double = js.native
  /* 5 */ val dqAcctUnresolved: dqAcctUnresolved with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.AccountStatusConstants with scala.Double
  ] = js.native
}

