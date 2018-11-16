package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFillType extends js.Object

@JSGlobal("Office.MsoFillType")
@js.native
object MsoFillType extends js.Object {
  @js.native
  sealed trait msoFillBackground
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  @js.native
  sealed trait msoFillGradient
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  @js.native
  sealed trait msoFillMixed
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  @js.native
  sealed trait msoFillPatterned
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  @js.native
  sealed trait msoFillPicture
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  @js.native
  sealed trait msoFillSolid
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  @js.native
  sealed trait msoFillTextured
    extends activexDashOfficeLib.OfficeNs.MsoFillType
  
  /* 5 */ val msoFillBackground: msoFillBackground with scala.Double = js.native
  /* 3 */ val msoFillGradient: msoFillGradient with scala.Double = js.native
  /* -2 */ val msoFillMixed: msoFillMixed with scala.Double = js.native
  /* 2 */ val msoFillPatterned: msoFillPatterned with scala.Double = js.native
  /* 6 */ val msoFillPicture: msoFillPicture with scala.Double = js.native
  /* 1 */ val msoFillSolid: msoFillSolid with scala.Double = js.native
  /* 4 */ val msoFillTextured: msoFillTextured with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFillType with scala.Double] = js.native
}

