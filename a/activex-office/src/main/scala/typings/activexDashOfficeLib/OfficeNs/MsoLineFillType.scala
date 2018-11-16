package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoLineFillType extends js.Object

@JSGlobal("Office.MsoLineFillType")
@js.native
object MsoLineFillType extends js.Object {
  @js.native
  sealed trait msoLineFillBackground
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillGradient
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillMixed
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillNone
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillPatterned
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillPicture
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillSolid
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  @js.native
  sealed trait msoLineFillTextured
    extends activexDashOfficeLib.OfficeNs.MsoLineFillType
  
  /* 5 */ val msoLineFillBackground: msoLineFillBackground with scala.Double = js.native
  /* 3 */ val msoLineFillGradient: msoLineFillGradient with scala.Double = js.native
  /* -2 */ val msoLineFillMixed: msoLineFillMixed with scala.Double = js.native
  /* 0 */ val msoLineFillNone: msoLineFillNone with scala.Double = js.native
  /* 2 */ val msoLineFillPatterned: msoLineFillPatterned with scala.Double = js.native
  /* 6 */ val msoLineFillPicture: msoLineFillPicture with scala.Double = js.native
  /* 1 */ val msoLineFillSolid: msoLineFillSolid with scala.Double = js.native
  /* 4 */ val msoLineFillTextured: msoLineFillTextured with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoLineFillType with scala.Double] = js.native
}

