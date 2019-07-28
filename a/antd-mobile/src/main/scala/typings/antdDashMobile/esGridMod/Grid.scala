package typings.antdDashMobile.esGridMod

import typings.antdDashMobile.Anon_InitialSlideWidth
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid
  extends Component[GridProps, js.Any, js.Any] {
  @JSName("state")
  var state_Grid: Anon_InitialSlideWidth = js.native
  @JSName("componentDidMount")
  def componentDidMount_MGrid(): Unit = js.native
  def getRows(rowCount: Double, dataLength: Double): js.Array[_] = js.native
  def renderCarousel(rowsArr: js.Array[_], pageCount: Double, rowCount: Double): js.Array[_] = js.native
  def renderItem(dataItem: js.Any, index: Double, columnNum: Double, renderItem: js.Any): Element = js.native
}

