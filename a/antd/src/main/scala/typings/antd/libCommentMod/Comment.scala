package typings.antd.libCommentMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends Component[CommentProps, js.Object, js.Any] {
  def renderComment(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderNested(prefixCls: String, children: js.Any): Element = js.native
}

