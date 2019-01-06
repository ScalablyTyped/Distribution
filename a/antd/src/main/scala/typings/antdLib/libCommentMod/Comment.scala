package typings
package antdLib.libCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends reactLib.reactMod.Component[CommentProps, js.Object, js.Any] {
  def getAction(actions: js.Array[reactLib.reactMod.ReactNs.ReactNode]): js.Array[reactLib.reactMod.Global.JSXNs.Element] | scala.Null = js.native
  def renderComment(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderNested(prefixCls: java.lang.String, children: js.Any): reactLib.reactMod.Global.JSXNs.Element = js.native
}

