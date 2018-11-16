package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpTextStyleType extends js.Object

@JSGlobal("PowerPoint.PpTextStyleType")
@js.native
object PpTextStyleType extends js.Object {
  @js.native
  sealed trait ppBodyStyle
    extends activexDashPowerpointLib.PowerPointNs.PpTextStyleType
  
  @js.native
  sealed trait ppDefaultStyle
    extends activexDashPowerpointLib.PowerPointNs.PpTextStyleType
  
  @js.native
  sealed trait ppTitleStyle
    extends activexDashPowerpointLib.PowerPointNs.PpTextStyleType
  
  /* 3 */ val ppBodyStyle: ppBodyStyle with scala.Double = js.native
  /* 1 */ val ppDefaultStyle: ppDefaultStyle with scala.Double = js.native
  /* 2 */ val ppTitleStyle: ppTitleStyle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpTextStyleType with scala.Double] = js.native
}

