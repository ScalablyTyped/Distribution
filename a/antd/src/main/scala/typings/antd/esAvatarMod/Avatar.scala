package typings.antd.esAvatarMod

import typings.antd.Anon_IsImgExist
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
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
  var state_Avatar: Anon_IsImgExist = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAvatar(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAvatar(prevProps: AvatarProps): Unit = js.native
  def handleImgLoadError(): Unit = js.native
  def renderAvatar(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setScale(): Unit = js.native
}

