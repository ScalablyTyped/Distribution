package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarType extends js.Object

@JSGlobal("Word.XlErrorBarType")
@js.native
object XlErrorBarType extends js.Object {
  @js.native
  sealed trait xlErrorBarTypeCustom
    extends activexDashWordLib.WordNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeFixedValue
    extends activexDashWordLib.WordNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypePercent
    extends activexDashWordLib.WordNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStDev
    extends activexDashWordLib.WordNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStError
    extends activexDashWordLib.WordNs.XlErrorBarType
  
  /* -4114 */ val xlErrorBarTypeCustom: xlErrorBarTypeCustom with scala.Double = js.native
  /* 1 */ val xlErrorBarTypeFixedValue: xlErrorBarTypeFixedValue with scala.Double = js.native
  /* 2 */ val xlErrorBarTypePercent: xlErrorBarTypePercent with scala.Double = js.native
  /* -4155 */ val xlErrorBarTypeStDev: xlErrorBarTypeStDev with scala.Double = js.native
  /* 4 */ val xlErrorBarTypeStError: xlErrorBarTypeStError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlErrorBarType with scala.Double] = js.native
}

