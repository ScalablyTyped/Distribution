package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextEffectAlignment extends js.Object

@JSGlobal("Office.MsoTextEffectAlignment")
@js.native
object MsoTextEffectAlignment extends js.Object {
  @js.native
  sealed trait msoTextEffectAlignmentCentered
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  @js.native
  sealed trait msoTextEffectAlignmentLeft
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  @js.native
  sealed trait msoTextEffectAlignmentLetterJustify
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  @js.native
  sealed trait msoTextEffectAlignmentMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  @js.native
  sealed trait msoTextEffectAlignmentRight
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  @js.native
  sealed trait msoTextEffectAlignmentStretchJustify
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  @js.native
  sealed trait msoTextEffectAlignmentWordJustify
    extends activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment
  
  /* 2 */ val msoTextEffectAlignmentCentered: msoTextEffectAlignmentCentered with scala.Double = js.native
  /* 1 */ val msoTextEffectAlignmentLeft: msoTextEffectAlignmentLeft with scala.Double = js.native
  /* 4 */ val msoTextEffectAlignmentLetterJustify: msoTextEffectAlignmentLetterJustify with scala.Double = js.native
  /* -2 */ val msoTextEffectAlignmentMixed: msoTextEffectAlignmentMixed with scala.Double = js.native
  /* 3 */ val msoTextEffectAlignmentRight: msoTextEffectAlignmentRight with scala.Double = js.native
  /* 6 */ val msoTextEffectAlignmentStretchJustify: msoTextEffectAlignmentStretchJustify with scala.Double = js.native
  /* 5 */ val msoTextEffectAlignmentWordJustify: msoTextEffectAlignmentWordJustify with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextEffectAlignment with scala.Double] = js.native
}

