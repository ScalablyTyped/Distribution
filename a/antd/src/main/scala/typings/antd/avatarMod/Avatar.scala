package typings.antd.avatarMod

import typings.antd.anon.IsImgExist
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar
  extends Component[AvatarProps, AvatarState, js.Any] {
  var avatarChildren: js.Any = js.native
  var avatarNode: js.Any = js.native
  var lastChildrenWidth: js.Any = js.native
  var lastNodeWidth: js.Any = js.native
  @JSName("state")
  var state_Avatar: IsImgExist = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAvatar(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAvatar(prevProps: AvatarProps): Unit = js.native
  def handleImgLoadError(): Unit = js.native
  def renderAvatar(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setScale(): Unit = js.native
}

