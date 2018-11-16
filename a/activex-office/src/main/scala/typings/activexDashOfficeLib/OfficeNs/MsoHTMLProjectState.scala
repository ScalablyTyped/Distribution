package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoHTMLProjectState extends js.Object

@JSGlobal("Office.MsoHTMLProjectState")
@js.native
object MsoHTMLProjectState extends js.Object {
  @js.native
  sealed trait msoHTMLProjectStateDocumentLocked
    extends activexDashOfficeLib.OfficeNs.MsoHTMLProjectState
  
  @js.native
  sealed trait msoHTMLProjectStateDocumentProjectUnlocked
    extends activexDashOfficeLib.OfficeNs.MsoHTMLProjectState
  
  @js.native
  sealed trait msoHTMLProjectStateProjectLocked
    extends activexDashOfficeLib.OfficeNs.MsoHTMLProjectState
  
  /* 1 */ val msoHTMLProjectStateDocumentLocked: msoHTMLProjectStateDocumentLocked with scala.Double = js.native
  /* 3 */ val msoHTMLProjectStateDocumentProjectUnlocked: msoHTMLProjectStateDocumentProjectUnlocked with scala.Double = js.native
  /* 2 */ val msoHTMLProjectStateProjectLocked: msoHTMLProjectStateProjectLocked with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoHTMLProjectState with scala.Double] = js.native
}

