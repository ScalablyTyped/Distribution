package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCredentialsMethod extends js.Object

@JSGlobal("Excel.XlCredentialsMethod")
@js.native
object XlCredentialsMethod extends js.Object {
  @js.native
  sealed trait xlCredentialsMethodIntegrated
    extends activexDashExcelLib.ExcelNs.XlCredentialsMethod
  
  @js.native
  sealed trait xlCredentialsMethodNone
    extends activexDashExcelLib.ExcelNs.XlCredentialsMethod
  
  @js.native
  sealed trait xlCredentialsMethodStored
    extends activexDashExcelLib.ExcelNs.XlCredentialsMethod
  
  /* 0 */ val xlCredentialsMethodIntegrated: xlCredentialsMethodIntegrated with scala.Double = js.native
  /* 1 */ val xlCredentialsMethodNone: xlCredentialsMethodNone with scala.Double = js.native
  /* 2 */ val xlCredentialsMethodStored: xlCredentialsMethodStored with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCredentialsMethod with scala.Double] = js.native
}

