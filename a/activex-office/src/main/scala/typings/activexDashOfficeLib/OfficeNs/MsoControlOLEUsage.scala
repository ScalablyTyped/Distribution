package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoControlOLEUsage extends js.Object

@JSGlobal("Office.MsoControlOLEUsage")
@js.native
object MsoControlOLEUsage extends js.Object {
  @js.native
  sealed trait msoControlOLEUsageBoth
    extends activexDashOfficeLib.OfficeNs.MsoControlOLEUsage
  
  @js.native
  sealed trait msoControlOLEUsageClient
    extends activexDashOfficeLib.OfficeNs.MsoControlOLEUsage
  
  @js.native
  sealed trait msoControlOLEUsageNeither
    extends activexDashOfficeLib.OfficeNs.MsoControlOLEUsage
  
  @js.native
  sealed trait msoControlOLEUsageServer
    extends activexDashOfficeLib.OfficeNs.MsoControlOLEUsage
  
  /* 3 */ val msoControlOLEUsageBoth: msoControlOLEUsageBoth with scala.Double = js.native
  /* 2 */ val msoControlOLEUsageClient: msoControlOLEUsageClient with scala.Double = js.native
  /* 0 */ val msoControlOLEUsageNeither: msoControlOLEUsageNeither with scala.Double = js.native
  /* 1 */ val msoControlOLEUsageServer: msoControlOLEUsageServer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoControlOLEUsage with scala.Double] = js.native
}

