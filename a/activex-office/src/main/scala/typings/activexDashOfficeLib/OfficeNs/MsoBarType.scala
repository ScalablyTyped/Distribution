package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBarType extends js.Object

@JSGlobal("Office.MsoBarType")
@js.native
object MsoBarType extends js.Object {
  @js.native
  sealed trait msoBarTypeMenuBar
    extends activexDashOfficeLib.OfficeNs.MsoBarType
  
  @js.native
  sealed trait msoBarTypeNormal
    extends activexDashOfficeLib.OfficeNs.MsoBarType
  
  @js.native
  sealed trait msoBarTypePopup
    extends activexDashOfficeLib.OfficeNs.MsoBarType
  
  /* 1 */ val msoBarTypeMenuBar: msoBarTypeMenuBar with scala.Double = js.native
  /* 0 */ val msoBarTypeNormal: msoBarTypeNormal with scala.Double = js.native
  /* 2 */ val msoBarTypePopup: msoBarTypePopup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBarType with scala.Double] = js.native
}

