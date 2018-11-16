package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAppLanguageID extends js.Object

@JSGlobal("Office.MsoAppLanguageID")
@js.native
object MsoAppLanguageID extends js.Object {
  @js.native
  sealed trait msoLanguageIDExeMode
    extends activexDashOfficeLib.OfficeNs.MsoAppLanguageID
  
  @js.native
  sealed trait msoLanguageIDHelp
    extends activexDashOfficeLib.OfficeNs.MsoAppLanguageID
  
  @js.native
  sealed trait msoLanguageIDInstall
    extends activexDashOfficeLib.OfficeNs.MsoAppLanguageID
  
  @js.native
  sealed trait msoLanguageIDUI
    extends activexDashOfficeLib.OfficeNs.MsoAppLanguageID
  
  @js.native
  sealed trait msoLanguageIDUIPrevious
    extends activexDashOfficeLib.OfficeNs.MsoAppLanguageID
  
  /* 4 */ val msoLanguageIDExeMode: msoLanguageIDExeMode with scala.Double = js.native
  /* 3 */ val msoLanguageIDHelp: msoLanguageIDHelp with scala.Double = js.native
  /* 1 */ val msoLanguageIDInstall: msoLanguageIDInstall with scala.Double = js.native
  /* 2 */ val msoLanguageIDUI: msoLanguageIDUI with scala.Double = js.native
  /* 5 */ val msoLanguageIDUIPrevious: msoLanguageIDUIPrevious with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAppLanguageID with scala.Double] = js.native
}

