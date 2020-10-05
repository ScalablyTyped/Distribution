package typings.antd.treeSelectMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.rcTreeSelect.interfaceMod.DefaultValueType
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeSelect[T]
  extends Component[TreeSelectProps[T], js.Object, js.Any] {
  var selectRef: RefObject[typings.rcTreeSelect.treeSelectMod.default[DefaultValueType]] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderTreeSelect(
    hasGetPopupContainerGetPrefixClsRenderEmptyDirectionVirtualDropdownMatchSelectWidth: ConfigConsumerProps
  ): Element = js.native
}

