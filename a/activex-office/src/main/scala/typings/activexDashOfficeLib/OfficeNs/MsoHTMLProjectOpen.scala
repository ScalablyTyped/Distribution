package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoHTMLProjectOpen extends js.Object

@JSGlobal("Office.MsoHTMLProjectOpen")
@js.native
object MsoHTMLProjectOpen extends js.Object {
  @js.native
  sealed trait msoHTMLProjectOpenSourceView
    extends activexDashOfficeLib.OfficeNs.MsoHTMLProjectOpen
  
  @js.native
  sealed trait msoHTMLProjectOpenTextView
    extends activexDashOfficeLib.OfficeNs.MsoHTMLProjectOpen
  
  /* 1 */ val msoHTMLProjectOpenSourceView: msoHTMLProjectOpenSourceView with scala.Double = js.native
  /* 2 */ val msoHTMLProjectOpenTextView: msoHTMLProjectOpenTextView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoHTMLProjectOpen with scala.Double] = js.native
}

