package typings
package activexDashDiskquotaLib.DiskQuotaTypeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserNameResolutionConstants extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("DiskQuotaTypeLibrary.UserNameResolutionConstants")
@js.native
object UserNameResolutionConstants extends js.Object {
  @js.native
  sealed trait dqResolveAsync
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.UserNameResolutionConstants
  
  @js.native
  sealed trait dqResolveNone
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.UserNameResolutionConstants
  
  @js.native
  sealed trait dqResolveSync
    extends activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.UserNameResolutionConstants
  
  /* 2 */ val dqResolveAsync: dqResolveAsync with scala.Double = js.native
  /* 0 */ val dqResolveNone: dqResolveNone with scala.Double = js.native
  /* 1 */ val dqResolveSync: dqResolveSync with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashDiskquotaLib.DiskQuotaTypeLibraryNs.UserNameResolutionConstants with scala.Double
  ] = js.native
}

