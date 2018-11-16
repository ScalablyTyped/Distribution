package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoExtrusionColorType extends js.Object

@JSGlobal("Office.MsoExtrusionColorType")
@js.native
object MsoExtrusionColorType extends js.Object {
  @js.native
  sealed trait msoExtrusionColorAutomatic
    extends activexDashOfficeLib.OfficeNs.MsoExtrusionColorType
  
  @js.native
  sealed trait msoExtrusionColorCustom
    extends activexDashOfficeLib.OfficeNs.MsoExtrusionColorType
  
  @js.native
  sealed trait msoExtrusionColorTypeMixed
    extends activexDashOfficeLib.OfficeNs.MsoExtrusionColorType
  
  /* 1 */ val msoExtrusionColorAutomatic: msoExtrusionColorAutomatic with scala.Double = js.native
  /* 2 */ val msoExtrusionColorCustom: msoExtrusionColorCustom with scala.Double = js.native
  /* -2 */ val msoExtrusionColorTypeMixed: msoExtrusionColorTypeMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoExtrusionColorType with scala.Double] = js.native
}

