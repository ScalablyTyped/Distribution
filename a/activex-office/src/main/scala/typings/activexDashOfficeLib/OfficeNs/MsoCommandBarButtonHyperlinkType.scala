package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCommandBarButtonHyperlinkType extends js.Object

@JSGlobal("Office.MsoCommandBarButtonHyperlinkType")
@js.native
object MsoCommandBarButtonHyperlinkType extends js.Object {
  @js.native
  sealed trait msoCommandBarButtonHyperlinkInsertPicture
    extends activexDashOfficeLib.OfficeNs.MsoCommandBarButtonHyperlinkType
  
  @js.native
  sealed trait msoCommandBarButtonHyperlinkNone
    extends activexDashOfficeLib.OfficeNs.MsoCommandBarButtonHyperlinkType
  
  @js.native
  sealed trait msoCommandBarButtonHyperlinkOpen
    extends activexDashOfficeLib.OfficeNs.MsoCommandBarButtonHyperlinkType
  
  /* 2 */ val msoCommandBarButtonHyperlinkInsertPicture: msoCommandBarButtonHyperlinkInsertPicture with scala.Double = js.native
  /* 0 */ val msoCommandBarButtonHyperlinkNone: msoCommandBarButtonHyperlinkNone with scala.Double = js.native
  /* 1 */ val msoCommandBarButtonHyperlinkOpen: msoCommandBarButtonHyperlinkOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCommandBarButtonHyperlinkType with scala.Double] = js.native
}

