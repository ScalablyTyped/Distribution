package typings.antd.selectMod

import typings.antd.antdStrings.SECRET_COMBOBOX_MODE_DO_NOT_USE
import typings.antd.antdStrings.combobox
import typings.antd.antdStrings.multiple
import typings.antd.antdStrings.tags
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[ValueType /* <: SelectValue */]
  extends Component[SelectProps[ValueType], js.Object, js.Any] {
  var selectRef: RefObject[typings.rcSelect.mod.default[ValueType]] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getMode(): js.UndefOr[multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE | combobox] = js.native
  def renderSelect(
    hasGetPopupContainerGetPrefixClsRenderEmptyDirectionVirtualDropdownMatchSelectWidth: ConfigConsumerProps
  ): Element = js.native
}

