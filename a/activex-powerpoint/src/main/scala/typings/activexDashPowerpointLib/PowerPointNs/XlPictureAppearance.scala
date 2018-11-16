package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPictureAppearance extends js.Object

@JSGlobal("PowerPoint.XlPictureAppearance")
@js.native
object XlPictureAppearance extends js.Object {
  @js.native
  sealed trait xlPrinter
    extends activexDashPowerpointLib.PowerPointNs.XlPictureAppearance
  
  @js.native
  sealed trait xlScreen
    extends activexDashPowerpointLib.PowerPointNs.XlPictureAppearance
  
  /* 2 */ val xlPrinter: xlPrinter with scala.Double = js.native
  /* 1 */ val xlScreen: xlScreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlPictureAppearance with scala.Double] = js.native
}

