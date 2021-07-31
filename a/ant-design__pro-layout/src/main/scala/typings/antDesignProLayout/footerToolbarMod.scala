package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.FooterToolbarPropsRouteCo
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerToolbarMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/FooterToolbar", JSImport.Default)
  @js.native
  val default: FC[FooterToolbarProps] = js.native
  
  trait FooterToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderContent: js.UndefOr[
        js.Function2[/* props */ FooterToolbarPropsRouteCo, /* dom */ Element, ReactNode]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FooterToolbarProps {
    
    @scala.inline
    def apply(): FooterToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterToolbarProps]
    }
    
    @scala.inline
    implicit class FooterToolbarPropsMutableBuilder[Self <: FooterToolbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderContent(value: (/* props */ FooterToolbarPropsRouteCo, /* dom */ Element) => ReactNode): Self = StObject.set(x, "renderContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[FooterToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `footerToolbarMod.foo` */
  override def _to: FC[FooterToolbarProps] = default
}
