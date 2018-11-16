package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoHyperlinkType extends js.Object

@JSGlobal("Office.MsoHyperlinkType")
@js.native
object MsoHyperlinkType extends js.Object {
  @js.native
  sealed trait msoHyperlinkInlineShape
    extends activexDashOfficeLib.OfficeNs.MsoHyperlinkType
  
  @js.native
  sealed trait msoHyperlinkRange
    extends activexDashOfficeLib.OfficeNs.MsoHyperlinkType
  
  @js.native
  sealed trait msoHyperlinkShape
    extends activexDashOfficeLib.OfficeNs.MsoHyperlinkType
  
  /* 2 */ val msoHyperlinkInlineShape: msoHyperlinkInlineShape with scala.Double = js.native
  /* 0 */ val msoHyperlinkRange: msoHyperlinkRange with scala.Double = js.native
  /* 1 */ val msoHyperlinkShape: msoHyperlinkShape with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoHyperlinkType with scala.Double] = js.native
}

