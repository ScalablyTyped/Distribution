package typings
package antdLib.esCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends reactLib.reactMod.Component[CascaderProps, CascaderState, js.Any] {
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  var input: js.Any = js.native
  def blur(): scala.Unit = js.native
  def clearSelection(e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def generateFilteredOptions(
    prefixCls: js.UndefOr[scala.Nothing],
    renderEmpty: antdLib.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
  ): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(
    prefixCls: java.lang.String,
    renderEmpty: antdLib.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
  ): js.Array[CascaderOptionType] = js.native
  def getLabel(): js.Any = js.native
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): scala.Unit = js.native
  def handleInputBlur(): scala.Unit = js.native
  def handleInputChange(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleInputClick(e: reactLib.reactMod.MouseEvent[stdLib.HTMLInputElement, stdLib.MouseEvent]): scala.Unit = js.native
  def handleKeyDown(e: reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handlePopupVisibleChange(popupVisible: scala.Boolean): scala.Unit = js.native
  def renderCascader(
    hasGetPopupContainerGetPrefixClsRenderEmpty: antdLib.esConfigDashProviderMod.ConfigConsumerProps,
    locale: CascaderLocale
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveInput(node: antdLib.esInputMod.default): scala.Unit = js.native
  def setValue(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setValue(value: js.Array[java.lang.String], selectedOptions: js.Array[CascaderOptionType]): scala.Unit = js.native
}

