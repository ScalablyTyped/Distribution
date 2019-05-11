package typings
package antdDashMobileLib.esPickerAbstractPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPicker
  extends reactLib.reactMod.Component[AbstractPickerProps, js.Any, js.Any] {
  var scrollValue: js.Any = js.native
  def fixOnOk(cascader: js.Any): scala.Unit = js.native
  def getPickerCol(): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def getSel(): js.UndefOr[java.lang.String | js.Array[reactLib.reactMod.ReactNode]] = js.native
  def onOk(v: js.Any): scala.Unit = js.native
  def onPickerChange(v: js.Any): scala.Unit = js.native
  def onVisibleChange(visible: scala.Boolean): scala.Unit = js.native
  def setCasecadeScrollValue(v: js.Any): scala.Unit = js.native
  def setScrollValue(v: js.Any): scala.Unit = js.native
}

