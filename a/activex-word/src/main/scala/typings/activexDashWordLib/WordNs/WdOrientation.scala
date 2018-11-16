package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOrientation extends js.Object

@JSGlobal("Word.WdOrientation")
@js.native
object WdOrientation extends js.Object {
  @js.native
  sealed trait wdOrientLandscape
    extends activexDashWordLib.WordNs.WdOrientation
  
  @js.native
  sealed trait wdOrientPortrait
    extends activexDashWordLib.WordNs.WdOrientation
  
  /* 1 */ val wdOrientLandscape: wdOrientLandscape with scala.Double = js.native
  /* 0 */ val wdOrientPortrait: wdOrientPortrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOrientation with scala.Double] = js.native
}

