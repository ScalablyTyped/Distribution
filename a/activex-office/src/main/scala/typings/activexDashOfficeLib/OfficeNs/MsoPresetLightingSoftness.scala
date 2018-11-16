package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoPresetLightingSoftness extends js.Object

@JSGlobal("Office.MsoPresetLightingSoftness")
@js.native
object MsoPresetLightingSoftness extends js.Object {
  @js.native
  sealed trait msoLightingBright
    extends activexDashOfficeLib.OfficeNs.MsoPresetLightingSoftness
  
  @js.native
  sealed trait msoLightingDim
    extends activexDashOfficeLib.OfficeNs.MsoPresetLightingSoftness
  
  @js.native
  sealed trait msoLightingNormal
    extends activexDashOfficeLib.OfficeNs.MsoPresetLightingSoftness
  
  @js.native
  sealed trait msoPresetLightingSoftnessMixed
    extends activexDashOfficeLib.OfficeNs.MsoPresetLightingSoftness
  
  /* 3 */ val msoLightingBright: msoLightingBright with scala.Double = js.native
  /* 1 */ val msoLightingDim: msoLightingDim with scala.Double = js.native
  /* 2 */ val msoLightingNormal: msoLightingNormal with scala.Double = js.native
  /* -2 */ val msoPresetLightingSoftnessMixed: msoPresetLightingSoftnessMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoPresetLightingSoftness with scala.Double] = js.native
}

