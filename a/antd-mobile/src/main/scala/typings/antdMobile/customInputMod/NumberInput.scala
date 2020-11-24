package typings.antdMobile.customInputMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberInput
  extends Component[NumberInputProps, js.Any, js.Any] {
  
  def addBlurListener(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MNumberInput(nextProps: NumberInputProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNumberInput(): Unit = js.native
  
  var container: HTMLDivElement = js.native
  
  def doBlur(ev: MouseEvent): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getComponent(): Element = js.native
  
  def getContainer(): HTMLDivElement = js.native
  
  var inputRef: HTMLDivElement | Null = js.native
  
  var keyBoard: ReactNode | Null = js.native
  
  def onChange(value: js.Any): Unit = js.native
  
  def onConfirm(value: js.Any): Unit = js.native
  
  def onFakeInputClick(): Unit = js.native
  
  def onInputBlur(value: String): Unit = js.native
  
  def onInputFocus(): Unit = js.native
  
  def onKeyboardClick(KeyboardItemValue: String): Unit = js.native
  
  def removeBlurListener(): Unit = js.native
  
  def renderCustomKeyboard(): Unit = js.native
  
  def renderPortal(): js.UndefOr[js.Object | Null] = js.native
  
  def saveRef(): Unit = js.native
  def saveRef(el: typings.antdMobile.customKeyboardMod.default): Unit = js.native
  
  def unLinkInput(): Unit = js.native
}
