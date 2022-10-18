package typings.antdMobileRn

import typings.antdMobileRn.libAccordionPropsTypeMod.AccordionPropsTypes
import typings.antdMobileRn.libAccordionStyleIndexDotnativeMod.AccordionStyle
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAccordionIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/accordion/index.native", JSImport.Default)
  @js.native
  open class default () extends Accordion
  object default {
    
    @JSImport("antd-mobile-rn/lib/accordion/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/accordion/index.native", "default.Panel")
    @js.native
    def Panel: Any = js.native
    inline def Panel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/accordion/index.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/accordion/index.native", "default.defaultProps.styles")
      @js.native
      def styles: Any = js.native
      inline def styles_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Accordion extends Component[AccordionNativeProps, Any, Any] {
    
    def onChange(idx: Double): Unit = js.native
    
    def renderContent(section: AccordionHeader): Element = js.native
    
    def renderHeader(section: AccordionHeader, _underscore: Double, isActive: Boolean): Element = js.native
  }
  
  trait AccordionHeader extends StObject {
    
    var content: ReactElement
    
    var style: StyleProp[ViewStyle]
    
    var title: String
  }
  object AccordionHeader {
    
    inline def apply(content: ReactElement, title: String): AccordionHeader = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionHeader]
    }
    
    extension [Self <: AccordionHeader](x: Self) {
      
      inline def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccordionNativeProps
    extends StObject
       with AccordionPropsTypes {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[AccordionStyle] = js.undefined
  }
  object AccordionNativeProps {
    
    inline def apply(): AccordionNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionNativeProps]
    }
    
    extension [Self <: AccordionNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: AccordionStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait AccordionPanelProps extends StObject {
    
    var header: Any
    
    var key: js.UndefOr[String] = js.undefined
  }
  object AccordionPanelProps {
    
    inline def apply(header: Any): AccordionPanelProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    extension [Self <: AccordionPanelProps](x: Self) {
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
