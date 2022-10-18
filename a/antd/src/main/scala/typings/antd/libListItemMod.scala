package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListItemMod extends Shortcut {
  
  @JSImport("antd/lib/list/Item", JSImport.Default)
  @js.native
  val default: ListItemTypeProps = js.native
  
  @JSImport("antd/lib/list/Item", "Meta")
  @js.native
  val Meta: FC[ListItemMetaProps] = js.native
  
  trait ListItemMetaProps extends StObject {
    
    var avatar: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ListItemMetaProps {
    
    inline def apply(): ListItemMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemMetaProps]
    }
    
    extension [Self <: ListItemMetaProps](x: Self) {
      
      inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ListItemProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var actions: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var colStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setActions(value: js.Array[ReactNode]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: ReactNode*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setColStyle(value: CSSProperties): Self = StObject.set(x, "colStyle", value.asInstanceOf[js.Any])
      
      inline def setColStyleUndefined: Self = StObject.set(x, "colStyle", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  @js.native
  trait ListItemTypeProps
    extends StObject
       with ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLElement]] {
    
    var Meta: FC[ListItemMetaProps] = js.native
  }
  
  type _To = ListItemTypeProps
  
  /* This means you don't have to write `default`, but can instead just say `libListItemMod.foo` */
  override def _to: ListItemTypeProps = default
}
