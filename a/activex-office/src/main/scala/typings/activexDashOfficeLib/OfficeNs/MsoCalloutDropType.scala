package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCalloutDropType extends js.Object

@JSGlobal("Office.MsoCalloutDropType")
@js.native
object MsoCalloutDropType extends js.Object {
  @js.native
  sealed trait msoCalloutDropBottom
    extends activexDashOfficeLib.OfficeNs.MsoCalloutDropType
  
  @js.native
  sealed trait msoCalloutDropCenter
    extends activexDashOfficeLib.OfficeNs.MsoCalloutDropType
  
  @js.native
  sealed trait msoCalloutDropCustom
    extends activexDashOfficeLib.OfficeNs.MsoCalloutDropType
  
  @js.native
  sealed trait msoCalloutDropMixed
    extends activexDashOfficeLib.OfficeNs.MsoCalloutDropType
  
  @js.native
  sealed trait msoCalloutDropTop
    extends activexDashOfficeLib.OfficeNs.MsoCalloutDropType
  
  /* 4 */ val msoCalloutDropBottom: msoCalloutDropBottom with scala.Double = js.native
  /* 3 */ val msoCalloutDropCenter: msoCalloutDropCenter with scala.Double = js.native
  /* 1 */ val msoCalloutDropCustom: msoCalloutDropCustom with scala.Double = js.native
  /* -2 */ val msoCalloutDropMixed: msoCalloutDropMixed with scala.Double = js.native
  /* 2 */ val msoCalloutDropTop: msoCalloutDropTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCalloutDropType with scala.Double] = js.native
}

