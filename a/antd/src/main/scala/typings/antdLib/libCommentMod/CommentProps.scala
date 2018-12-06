package typings
package antdLib.libCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommentProps extends js.Object {
  /** List of action items rendered below the comment content */
  var actions: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /** The element to display as the comment author. */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /** The element to display as the comment avatar - generally an antd Avatar */
  var avatar: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Nested comments should be provided as children of the Comment */
  var children: js.UndefOr[js.Any] = js.undefined
  /** className of comment */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** The main content of the comment */
  var content: reactLib.reactMod.ReactNs.ReactNode
  /** A datetime element containing the time to be displayed */
  var datetime: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Comment prefix defaults to '.ant-comment' */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** Additional style for the comment */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

