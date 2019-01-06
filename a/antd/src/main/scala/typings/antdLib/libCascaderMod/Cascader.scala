package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends reactLib.reactMod.Component[CascaderProps, CascaderState, js.Any] {
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  var input: js.Any = js.native
  def blur(): scala.Unit = js.native
  def clearSelection(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.MouseEvent]): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def generateFilteredOptions(
    prefixCls: java.lang.String,
    renderEmpty: antdLib.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler
  ): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(
    prefixCls: js.UndefOr[scala.Nothing],
    renderEmpty: antdLib.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler
  ): js.Array[CascaderOptionType] = js.native
  def getLabel(): js.Any = js.native
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): scala.Unit = js.native
  def handleInputBlur(): scala.Unit = js.native
  def handleInputChange(e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handleInputClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.MouseEvent]): scala.Unit = js.native
  def handleKeyDown(e: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handlePopupVisibleChange(popupVisible: scala.Boolean): scala.Unit = js.native
  def renderCascader(
    hasGetPopupContainerGetPrefixClsRenderEmpty: antdLib.libConfigDashProviderMod.ConfigConsumerProps,
    locale: CascaderLocale
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveInput(node: antdLib.libInputMod.default): scala.Unit = js.native
  def setValue(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setValue(value: js.Array[java.lang.String], selectedOptions: js.Array[CascaderOptionType]): scala.Unit = js.native
}

