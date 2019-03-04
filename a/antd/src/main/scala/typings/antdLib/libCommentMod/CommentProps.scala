package typings
package antdLib.libCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentProps extends js.Object {
  /** List of action items rendered below the comment content */
  var actions: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /** The element to display as the comment author. */
  var author: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
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

object CommentProps {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactNode,
    actions: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    author: reactLib.reactMod.ReactNs.ReactNode = null,
    avatar: reactLib.reactMod.ReactNs.ReactNode = null,
    children: js.Any = null,
    className: java.lang.String = null,
    datetime: reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CommentProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CommentProps]
  }
}

