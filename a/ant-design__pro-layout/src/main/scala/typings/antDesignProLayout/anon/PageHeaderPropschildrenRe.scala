package typings.antDesignProLayout.anon

import typings.antd.avatarAvatarMod.AvatarProps
import typings.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/page-header.PageHeaderProps & {  children :react.react.ReactNode | undefined} */
@js.native
trait PageHeaderPropschildrenRe extends StObject {
  
  var avatar: js.UndefOr[AvatarProps] = js.native
  
  var backIcon: js.UndefOr[ReactNode] = js.native
  
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var extra: js.UndefOr[ReactNode] = js.native
  
  var footer: js.UndefOr[ReactNode] = js.native
  
  var ghost: js.UndefOr[Boolean] = js.native
  
  var onBack: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subTitle: js.UndefOr[ReactNode] = js.native
  
  var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  
  var title: ReactNode = js.native
}
object PageHeaderPropschildrenRe {
  
  @scala.inline
  def apply(): PageHeaderPropschildrenRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderPropschildrenRe]
  }
  
  @scala.inline
  implicit class PageHeaderPropschildrenReMutableBuilder[Self <: PageHeaderPropschildrenRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setBackIcon(value: ReactNode): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
    
    @scala.inline
    def setBreadcrumb(value: BreadcrumbProps): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    @scala.inline
    def setOnBack(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTags(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
