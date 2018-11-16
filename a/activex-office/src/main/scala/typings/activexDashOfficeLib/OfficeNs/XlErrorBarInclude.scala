package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarInclude extends js.Object

@JSGlobal("Office.XlErrorBarInclude")
@js.native
object XlErrorBarInclude extends js.Object {
  @js.native
  sealed trait xlErrorBarIncludeBoth
    extends activexDashOfficeLib.OfficeNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludeMinusValues
    extends activexDashOfficeLib.OfficeNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludeNone
    extends activexDashOfficeLib.OfficeNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludePlusValues
    extends activexDashOfficeLib.OfficeNs.XlErrorBarInclude
  
  /* 1 */ val xlErrorBarIncludeBoth: xlErrorBarIncludeBoth with scala.Double = js.native
  /* 3 */ val xlErrorBarIncludeMinusValues: xlErrorBarIncludeMinusValues with scala.Double = js.native
  /* -4142 */ val xlErrorBarIncludeNone: xlErrorBarIncludeNone with scala.Double = js.native
  /* 2 */ val xlErrorBarIncludePlusValues: xlErrorBarIncludePlusValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlErrorBarInclude with scala.Double] = js.native
}

