package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("IWshRuntimeLibrary.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait AuditFailure
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType
  
  @js.native
  sealed trait AuditSuccess
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType
  
  @js.native
  sealed trait Error
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType
  
  @js.native
  sealed trait Information
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType
  
  @js.native
  sealed trait Success
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType
  
  @js.native
  sealed trait Warning
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType
  
  /* 5 */ val AuditFailure: AuditFailure with scala.Double = js.native
  /* 4 */ val AuditSuccess: AuditSuccess with scala.Double = js.native
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 3 */ val Information: Information with scala.Double = js.native
  /* 0 */ val Success: Success with scala.Double = js.native
  /* 2 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.EventType with scala.Double
  ] = js.native
}

