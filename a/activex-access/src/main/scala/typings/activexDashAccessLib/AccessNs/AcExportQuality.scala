package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcExportQuality extends js.Object

@JSGlobal("Access.AcExportQuality")
@js.native
object AcExportQuality extends js.Object {
  @js.native
  sealed trait acExportQualityPrint
    extends activexDashAccessLib.AccessNs.AcExportQuality
  
  @js.native
  sealed trait acExportQualityScreen
    extends activexDashAccessLib.AccessNs.AcExportQuality
  
  /* 0 */ val acExportQualityPrint: acExportQualityPrint with scala.Double = js.native
  /* 1 */ val acExportQualityScreen: acExportQualityScreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcExportQuality with scala.Double] = js.native
}

