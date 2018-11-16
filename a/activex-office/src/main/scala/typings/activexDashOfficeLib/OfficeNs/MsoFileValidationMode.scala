package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileValidationMode extends js.Object

@JSGlobal("Office.MsoFileValidationMode")
@js.native
object MsoFileValidationMode extends js.Object {
  @js.native
  sealed trait msoFileValidationDefault
    extends activexDashOfficeLib.OfficeNs.MsoFileValidationMode
  
  @js.native
  sealed trait msoFileValidationSkip
    extends activexDashOfficeLib.OfficeNs.MsoFileValidationMode
  
  /* 0 */ val msoFileValidationDefault: msoFileValidationDefault with scala.Double = js.native
  /* 1 */ val msoFileValidationSkip: msoFileValidationSkip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileValidationMode with scala.Double] = js.native
}

