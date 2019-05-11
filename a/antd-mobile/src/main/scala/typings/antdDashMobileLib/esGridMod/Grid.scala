package typings
package antdDashMobileLib.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid
  extends reactLib.reactMod.Component[GridProps, js.Any, js.Any] {
  @JSName("state")
  var state_Grid: antdDashMobileLib.Anon_InitialSlideWidth = js.native
  @JSName("componentDidMount")
  def componentDidMount_MGrid(): scala.Unit = js.native
  def getRows(rowCount: scala.Double, dataLength: scala.Double): js.Array[_] = js.native
  def renderCarousel(rowsArr: js.Array[_], pageCount: scala.Double, rowCount: scala.Double): js.Array[_] = js.native
  def renderItem(dataItem: js.Any, index: scala.Double, columnNum: scala.Double, renderItem: js.Any): reactLib.reactMod.Global.JSXNs.Element = js.native
}

