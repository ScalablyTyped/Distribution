package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextureType extends js.Object

@JSGlobal("Office.MsoTextureType")
@js.native
object MsoTextureType extends js.Object {
  @js.native
  sealed trait msoTexturePreset
    extends activexDashOfficeLib.OfficeNs.MsoTextureType
  
  @js.native
  sealed trait msoTextureTypeMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextureType
  
  @js.native
  sealed trait msoTextureUserDefined
    extends activexDashOfficeLib.OfficeNs.MsoTextureType
  
  /* 1 */ val msoTexturePreset: msoTexturePreset with scala.Double = js.native
  /* -2 */ val msoTextureTypeMixed: msoTextureTypeMixed with scala.Double = js.native
  /* 2 */ val msoTextureUserDefined: msoTextureUserDefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextureType with scala.Double] = js.native
}

