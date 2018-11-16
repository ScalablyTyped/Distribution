package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarInclude extends js.Object

@JSGlobal("PowerPoint.XlErrorBarInclude")
@js.native
object XlErrorBarInclude extends js.Object {
  @js.native
  sealed trait xlErrorBarIncludeBoth
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludeMinusValues
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludeNone
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludePlusValues
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarInclude
  
  /* 1 */ val xlErrorBarIncludeBoth: xlErrorBarIncludeBoth with scala.Double = js.native
  /* 3 */ val xlErrorBarIncludeMinusValues: xlErrorBarIncludeMinusValues with scala.Double = js.native
  /* -4142 */ val xlErrorBarIncludeNone: xlErrorBarIncludeNone with scala.Double = js.native
  /* 2 */ val xlErrorBarIncludePlusValues: xlErrorBarIncludePlusValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlErrorBarInclude with scala.Double] = js.native
}

