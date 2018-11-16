package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPictureAppearance extends js.Object

@JSGlobal("Word.XlPictureAppearance")
@js.native
object XlPictureAppearance extends js.Object {
  @js.native
  sealed trait xlPrinter
    extends activexDashWordLib.WordNs.XlPictureAppearance
  
  @js.native
  sealed trait xlScreen
    extends activexDashWordLib.WordNs.XlPictureAppearance
  
  /* 2 */ val xlPrinter: xlPrinter with scala.Double = js.native
  /* 1 */ val xlScreen: xlScreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlPictureAppearance with scala.Double] = js.native
}

