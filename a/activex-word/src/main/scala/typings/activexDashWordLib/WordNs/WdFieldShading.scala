package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFieldShading extends js.Object

@JSGlobal("Word.WdFieldShading")
@js.native
object WdFieldShading extends js.Object {
  @js.native
  sealed trait wdFieldShadingAlways
    extends activexDashWordLib.WordNs.WdFieldShading
  
  @js.native
  sealed trait wdFieldShadingNever
    extends activexDashWordLib.WordNs.WdFieldShading
  
  @js.native
  sealed trait wdFieldShadingWhenSelected
    extends activexDashWordLib.WordNs.WdFieldShading
  
  /* 1 */ val wdFieldShadingAlways: wdFieldShadingAlways with scala.Double = js.native
  /* 0 */ val wdFieldShadingNever: wdFieldShadingNever with scala.Double = js.native
  /* 2 */ val wdFieldShadingWhenSelected: wdFieldShadingWhenSelected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFieldShading with scala.Double] = js.native
}

