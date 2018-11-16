package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlUnderlineStyle extends js.Object

@JSGlobal("PowerPoint.XlUnderlineStyle")
@js.native
object XlUnderlineStyle extends js.Object {
  @js.native
  sealed trait xlUnderlineStyleDouble
    extends activexDashPowerpointLib.PowerPointNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleDoubleAccounting
    extends activexDashPowerpointLib.PowerPointNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleNone
    extends activexDashPowerpointLib.PowerPointNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingle
    extends activexDashPowerpointLib.PowerPointNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingleAccounting
    extends activexDashPowerpointLib.PowerPointNs.XlUnderlineStyle
  
  /* -4119 */ val xlUnderlineStyleDouble: xlUnderlineStyleDouble with scala.Double = js.native
  /* 5 */ val xlUnderlineStyleDoubleAccounting: xlUnderlineStyleDoubleAccounting with scala.Double = js.native
  /* -4142 */ val xlUnderlineStyleNone: xlUnderlineStyleNone with scala.Double = js.native
  /* 2 */ val xlUnderlineStyleSingle: xlUnderlineStyleSingle with scala.Double = js.native
  /* 4 */ val xlUnderlineStyleSingleAccounting: xlUnderlineStyleSingleAccounting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlUnderlineStyle with scala.Double] = js.native
}

