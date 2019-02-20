package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaResultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.FormulaResult.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaResultNs.Constants
  
  @js.native
  sealed trait STRING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaResultNs.Constants
  
  @js.native
  sealed trait VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaResultNs.Constants
  
  /* 4 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val STRING: STRING with scala.Double = js.native
  /* 1 */ val VALUE: VALUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaResultNs.Constants with scala.Double
  ] = js.native
}

