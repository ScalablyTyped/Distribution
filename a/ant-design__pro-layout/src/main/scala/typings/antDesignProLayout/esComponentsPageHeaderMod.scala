package typings.antDesignProLayout

import typings.antd.libAvatarAvatarMod.AvatarProps
import typings.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPageHeaderMod {
  
  @JSImport("@ant-design/pro-layout/es/components/PageHeader", "PageHeader")
  @js.native
  val PageHeader: FC[PageHeaderProps] = js.native
  
  trait PageHeaderProps extends StObject {
    
    var avatar: js.UndefOr[AvatarProps] = js.undefined
    
    var backIcon: js.UndefOr[ReactNode] = js.undefined
    
    var breadcrumb: js.UndefOr[BreadcrumbProps | ReactElement] = js.undefined
    
    var breadcrumbRender: js.UndefOr[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var ghost: js.UndefOr[Boolean] = js.undefined
    
    var onBack: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBackIcon(value: ReactNode): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
      
      inline def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
      
      inline def setBreadcrumb(value: BreadcrumbProps | ReactElement): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbRender(value: (PageHeaderProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction2(value))
      
      inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
      
      inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setOnBack(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
      
      inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTags(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
