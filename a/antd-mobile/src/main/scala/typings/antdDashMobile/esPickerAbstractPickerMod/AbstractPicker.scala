package typings.antdDashMobile.esPickerAbstractPickerMod

import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPicker
  extends Component[AbstractPickerProps, js.Any, js.Any] {
  var scrollValue: js.Any = js.native
  def fixOnOk(cascader: js.Any): Unit = js.native
  def getPickerCol(): js.Array[Element] = js.native
  def getSel(): js.UndefOr[String | js.Array[ReactNode]] = js.native
  def onOk(v: js.Any): Unit = js.native
  def onPickerChange(v: js.Any): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def setCasecadeScrollValue(v: js.Any): Unit = js.native
  def setScrollValue(v: js.Any): Unit = js.native
}

