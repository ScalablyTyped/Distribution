package typings.antd.commentMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentProps extends js.Object {
  /** List of action items rendered below the comment content */
  var actions: js.UndefOr[js.Array[ReactNode]] = js.native
  /** The element to display as the comment author. */
  var author: js.UndefOr[ReactNode] = js.native
  /** The element to display as the comment avatar - generally an antd Avatar */
  var avatar: js.UndefOr[ReactNode] = js.native
  /** Nested comments should be provided as children of the Comment */
  var children: js.UndefOr[ReactNode] = js.native
  /** className of comment */
  var className: js.UndefOr[String] = js.native
  /** The main content of the comment */
  var content: ReactNode = js.native
  /** A datetime element containing the time to be displayed */
  var datetime: js.UndefOr[ReactNode] = js.native
  /** Comment prefix defaults to '.ant-comment' */
  var prefixCls: js.UndefOr[String] = js.native
  /** Additional style for the comment */
  var style: js.UndefOr[CSSProperties] = js.native
}

object CommentProps {
  @scala.inline
  def apply(): CommentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentProps]
  }
  @scala.inline
  implicit class CommentPropsOps[Self <: CommentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: ReactNode*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ReactNode]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setAuthor(value: ReactNode): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setAvatar(value: ReactNode): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDatetime(value: ReactNode): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

