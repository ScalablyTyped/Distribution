package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileNewSection extends js.Object

@JSGlobal("Office.MsoFileNewSection")
@js.native
object MsoFileNewSection extends js.Object {
  @js.native
  sealed trait msoBottomSection
    extends activexDashOfficeLib.OfficeNs.MsoFileNewSection
  
  @js.native
  sealed trait msoNew
    extends activexDashOfficeLib.OfficeNs.MsoFileNewSection
  
  @js.native
  sealed trait msoNewfromExistingFile
    extends activexDashOfficeLib.OfficeNs.MsoFileNewSection
  
  @js.native
  sealed trait msoNewfromTemplate
    extends activexDashOfficeLib.OfficeNs.MsoFileNewSection
  
  @js.native
  sealed trait msoOpenDocument
    extends activexDashOfficeLib.OfficeNs.MsoFileNewSection
  
  /* 4 */ val msoBottomSection: msoBottomSection with scala.Double = js.native
  /* 1 */ val msoNew: msoNew with scala.Double = js.native
  /* 2 */ val msoNewfromExistingFile: msoNewfromExistingFile with scala.Double = js.native
  /* 3 */ val msoNewfromTemplate: msoNewfromTemplate with scala.Double = js.native
  /* 0 */ val msoOpenDocument: msoOpenDocument with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileNewSection with scala.Double] = js.native
}

