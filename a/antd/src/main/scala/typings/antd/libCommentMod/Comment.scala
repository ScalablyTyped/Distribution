package typings.antd.libCommentMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends Component[CommentProps, js.Object, js.Any] {
  def getAction(actions: js.Array[ReactNode]): js.Array[Element] | Null = js.native
  def renderComment(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderNested(prefixCls: String, children: js.Any): Element = js.native
}

