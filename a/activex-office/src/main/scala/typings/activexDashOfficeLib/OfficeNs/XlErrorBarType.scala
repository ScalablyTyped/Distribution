package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarType extends js.Object

@JSGlobal("Office.XlErrorBarType")
@js.native
object XlErrorBarType extends js.Object {
  @js.native
  sealed trait xlErrorBarTypeCustom
    extends activexDashOfficeLib.OfficeNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeFixedValue
    extends activexDashOfficeLib.OfficeNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypePercent
    extends activexDashOfficeLib.OfficeNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStDev
    extends activexDashOfficeLib.OfficeNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStError
    extends activexDashOfficeLib.OfficeNs.XlErrorBarType
  
  /* -4114 */ val xlErrorBarTypeCustom: xlErrorBarTypeCustom with scala.Double = js.native
  /* 1 */ val xlErrorBarTypeFixedValue: xlErrorBarTypeFixedValue with scala.Double = js.native
  /* 2 */ val xlErrorBarTypePercent: xlErrorBarTypePercent with scala.Double = js.native
  /* -4155 */ val xlErrorBarTypeStDev: xlErrorBarTypeStDev with scala.Double = js.native
  /* 4 */ val xlErrorBarTypeStError: xlErrorBarTypeStError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlErrorBarType with scala.Double] = js.native
}

