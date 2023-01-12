package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommentMod extends Shortcut {
  
  @JSImport("antd/lib/comment", JSImport.Default)
  @js.native
  val default: FC[CommentProps] = js.native
  
  trait CommentProps extends StObject {
    
    /** List of action items rendered below the comment content */
    var actions: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /** The element to display as the comment author. */
    var author: js.UndefOr[ReactNode] = js.undefined
    
    /** The element to display as the comment avatar - generally an antd Avatar */
    var avatar: js.UndefOr[ReactNode] = js.undefined
    
    /** Nested comments should be provided as children of the Comment */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** ClassName of comment */
    var className: js.UndefOr[String] = js.undefined
    
    /** The main content of the comment */
    var content: ReactNode
    
    /** A datetime element containing the time to be displayed */
    var datetime: js.UndefOr[ReactNode] = js.undefined
    
    /** Comment prefix defaults to '.ant-comment' */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** Additional style for the comment */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CommentProps {
    
    inline def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ReactNode]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: ReactNode*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAuthor(value: ReactNode): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDatetime(value: ReactNode): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[CommentProps]
  
  /* This means you don't have to write `default`, but can instead just say `libCommentMod.foo` */
  override def _to: FC[CommentProps] = default
}
