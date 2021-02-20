package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.listMod.ListGridType
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("antd/lib/list/Item", JSImport.Default)
  @js.native
  val default: ListItemTypeProps = js.native
  
  @JSImport("antd/lib/list/Item", "Meta")
  @js.native
  val Meta: FC[ListItemMetaProps] = js.native
  
  @js.native
  trait ListItemMetaProps extends StObject {
    
    var avatar: js.UndefOr[ReactNode] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactNode] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object ListItemMetaProps {
    
    @scala.inline
    def apply(): ListItemMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemMetaProps]
    }
    
    @scala.inline
    implicit class ListItemMetaPropsMutableBuilder[Self <: ListItemMetaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ListItemProps extends HTMLAttributes[HTMLDivElement] {
    
    var actions: js.UndefOr[js.Array[ReactNode]] = js.native
    
    var colStyle: js.UndefOr[CSSProperties] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var grid: js.UndefOr[ListGridType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ReactNode]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: ReactNode*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setColStyle(value: CSSProperties): Self = StObject.set(x, "colStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColStyleUndefined: Self = StObject.set(x, "colStyle", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  @js.native
  trait ListItemTypeProps extends FunctionComponent[ListItemProps] {
    
    var Meta: FC[ListItemMetaProps] = js.native
  }
  
  type _To = ListItemTypeProps
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: ListItemTypeProps = default
}
