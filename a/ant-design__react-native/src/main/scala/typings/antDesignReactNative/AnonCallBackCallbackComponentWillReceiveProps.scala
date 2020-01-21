package typings.antDesignReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallBackCallbackComponentWillReceiveProps extends js.Object {
  var context: js.Any = js.native
  var picker: js.Any = js.native
  val props: ReadonlychildrenReactNodeReadonlyPopupPickerProps = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def componentWillReceiveProps(nextProps: AnonValueVisible): Unit = js.native
  def fireVisibleChange(visible: Boolean): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def getContent(): js.UndefOr[String | ReactElement] = js.native
  def getRender(): Element = js.native
  def hide(): Unit = js.native
  def onDismiss(): Unit = js.native
  def onOk(): Unit = js.native
  def onPickerChange(pickerValue: js.Any): Unit = js.native
  def onTriggerClick(e: js.Any): Unit = js.native
  def render(): Element = js.native
  def saveRef(picker: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def setVisibleState(visible: js.Any): Unit = js.native
}

