package typings.antd.treeSelectMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[T]
  extends Component[TreeSelectProps[T], js.Object, js.Any] {
  var selectRef: RefObject[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelect<imported_interface.DefaultValueType> */ _
  ] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderTreeSelect(hasGetPopupContainerGetPrefixClsRenderEmptyDirection: ConfigConsumerProps): Element = js.native
}

