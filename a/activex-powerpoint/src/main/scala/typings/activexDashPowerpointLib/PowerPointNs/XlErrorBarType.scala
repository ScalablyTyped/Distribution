package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarType extends js.Object

@JSGlobal("PowerPoint.XlErrorBarType")
@js.native
object XlErrorBarType extends js.Object {
  @js.native
  sealed trait xlErrorBarTypeCustom
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeFixedValue
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypePercent
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStDev
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStError
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarType
  
  /* -4114 */ val xlErrorBarTypeCustom: xlErrorBarTypeCustom with scala.Double = js.native
  /* 1 */ val xlErrorBarTypeFixedValue: xlErrorBarTypeFixedValue with scala.Double = js.native
  /* 2 */ val xlErrorBarTypePercent: xlErrorBarTypePercent with scala.Double = js.native
  /* -4155 */ val xlErrorBarTypeStDev: xlErrorBarTypeStDev with scala.Double = js.native
  /* 4 */ val xlErrorBarTypeStError: xlErrorBarTypeStError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlErrorBarType with scala.Double] = js.native
}

