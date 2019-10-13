package typings.antd.esCascaderMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends Component[CascaderProps, CascaderState, js.Any] {
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  var input: js.Any = js.native
  def blur(): Unit = js.native
  def clearSelection(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def focus(): Unit = js.native
  def generateFilteredOptions(prefixCls: js.UndefOr[scala.Nothing], renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(prefixCls: String, renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def getLabel(): js.Any = js.native
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
  def handleInputBlur(): Unit = js.native
  def handleInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleInputClick(e: typings.react.reactMod.MouseEvent[HTMLInputElement, MouseEvent]): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
  def renderCascader(hasGetPopupContainerGetPrefixClsRenderEmpty: ConfigConsumerProps, locale: CascaderLocale): Element = js.native
  def saveInput(node: typings.antd.esInputMod.default): Unit = js.native
  def setValue(value: js.Array[String]): Unit = js.native
  def setValue(value: js.Array[String], selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
}

