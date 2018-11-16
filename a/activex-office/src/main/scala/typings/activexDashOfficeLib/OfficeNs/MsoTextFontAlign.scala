package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextFontAlign extends js.Object

@JSGlobal("Office.MsoTextFontAlign")
@js.native
object MsoTextFontAlign extends js.Object {
  @js.native
  sealed trait msoFontAlignAuto
    extends activexDashOfficeLib.OfficeNs.MsoTextFontAlign
  
  @js.native
  sealed trait msoFontAlignBaseline
    extends activexDashOfficeLib.OfficeNs.MsoTextFontAlign
  
  @js.native
  sealed trait msoFontAlignBottom
    extends activexDashOfficeLib.OfficeNs.MsoTextFontAlign
  
  @js.native
  sealed trait msoFontAlignCenter
    extends activexDashOfficeLib.OfficeNs.MsoTextFontAlign
  
  @js.native
  sealed trait msoFontAlignMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextFontAlign
  
  @js.native
  sealed trait msoFontAlignTop
    extends activexDashOfficeLib.OfficeNs.MsoTextFontAlign
  
  /* 0 */ val msoFontAlignAuto: msoFontAlignAuto with scala.Double = js.native
  /* 3 */ val msoFontAlignBaseline: msoFontAlignBaseline with scala.Double = js.native
  /* 4 */ val msoFontAlignBottom: msoFontAlignBottom with scala.Double = js.native
  /* 2 */ val msoFontAlignCenter: msoFontAlignCenter with scala.Double = js.native
  /* -2 */ val msoFontAlignMixed: msoFontAlignMixed with scala.Double = js.native
  /* 1 */ val msoFontAlignTop: msoFontAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextFontAlign with scala.Double] = js.native
}

