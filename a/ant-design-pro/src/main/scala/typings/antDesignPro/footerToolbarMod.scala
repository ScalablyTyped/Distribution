package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerToolbarMod {
  
  @JSImport("ant-design-pro/lib/FooterToolbar", JSImport.Default)
  @js.native
  class default ()
    extends Component[FooterToolbarProps, js.Any, js.Any]
  
  type FooterToolbar = Component[FooterToolbarProps, js.Any, js.Any]
  
  @js.native
  trait FooterToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extra: ReactNode = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
