package typings.antd.libCascaderMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends Component[CascaderProps, CascaderState, js.Any] {
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  var input: js.Any = js.native
  def blur(): Unit = js.native
  def clearSelection(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def focus(): Unit = js.native
  def generateFilteredOptions(prefixCls: js.UndefOr[scala.Nothing], renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(prefixCls: String, renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def getLabel(): js.Any = js.native
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
  def handleInputBlur(): Unit = js.native
  def handleInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleInputClick(e: MouseEvent[HTMLInputElement, typings.std.MouseEvent]): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
  def renderCascader(hasGetPopupContainerGetPrefixClsRenderEmpty: ConfigConsumerProps, locale: CascaderLocale): Element = js.native
  def saveInput(node: typings.antd.libInputMod.default): Unit = js.native
  def setValue(value: js.Array[String]): Unit = js.native
  def setValue(value: js.Array[String], selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
}

