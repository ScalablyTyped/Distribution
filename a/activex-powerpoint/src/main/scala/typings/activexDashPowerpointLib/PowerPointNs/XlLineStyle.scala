package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLineStyle extends js.Object

@JSGlobal("PowerPoint.XlLineStyle")
@js.native
object XlLineStyle extends js.Object {
  @js.native
  sealed trait xlContinuous
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlDash
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlDashDot
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlDashDotDot
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlDot
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlDouble
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlLineStyleNone
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  @js.native
  sealed trait xlSlantDashDot
    extends activexDashPowerpointLib.PowerPointNs.XlLineStyle
  
  /* 1 */ val xlContinuous: xlContinuous with scala.Double = js.native
  /* -4115 */ val xlDash: xlDash with scala.Double = js.native
  /* 4 */ val xlDashDot: xlDashDot with scala.Double = js.native
  /* 5 */ val xlDashDotDot: xlDashDotDot with scala.Double = js.native
  /* -4118 */ val xlDot: xlDot with scala.Double = js.native
  /* -4119 */ val xlDouble: xlDouble with scala.Double = js.native
  /* -4142 */ val xlLineStyleNone: xlLineStyleNone with scala.Double = js.native
  /* 13 */ val xlSlantDashDot: xlSlantDashDot with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlLineStyle with scala.Double] = js.native
}

