package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoGradientColorType extends js.Object

@JSGlobal("Office.MsoGradientColorType")
@js.native
object MsoGradientColorType extends js.Object {
  @js.native
  sealed trait msoGradientColorMixed
    extends activexDashOfficeLib.OfficeNs.MsoGradientColorType
  
  @js.native
  sealed trait msoGradientMultiColor
    extends activexDashOfficeLib.OfficeNs.MsoGradientColorType
  
  @js.native
  sealed trait msoGradientOneColor
    extends activexDashOfficeLib.OfficeNs.MsoGradientColorType
  
  @js.native
  sealed trait msoGradientPresetColors
    extends activexDashOfficeLib.OfficeNs.MsoGradientColorType
  
  @js.native
  sealed trait msoGradientTwoColors
    extends activexDashOfficeLib.OfficeNs.MsoGradientColorType
  
  /* -2 */ val msoGradientColorMixed: msoGradientColorMixed with scala.Double = js.native
  /* 4 */ val msoGradientMultiColor: msoGradientMultiColor with scala.Double = js.native
  /* 1 */ val msoGradientOneColor: msoGradientOneColor with scala.Double = js.native
  /* 3 */ val msoGradientPresetColors: msoGradientPresetColors with scala.Double = js.native
  /* 2 */ val msoGradientTwoColors: msoGradientTwoColors with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoGradientColorType with scala.Double] = js.native
}

