package typings.antd.commentMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends Component[CommentProps, js.Object, js.Any] {
  def renderComment(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderNested(prefixCls: String, children: js.Any): Element = js.native
}

