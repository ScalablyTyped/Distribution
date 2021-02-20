package typings.antdMobileRn

import typings.antdMobileRn.indexDotnativeMod.AccordionStyle
import typings.antdMobileRn.propsTypeMod.AccordionPropsTypes
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/accordion/index.native", JSImport.Default)
  @js.native
  class default () extends Accordion
  object default {
    
    @JSImport("antd-mobile-rn/lib/accordion/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/accordion/index.native", "default.Panel")
    @js.native
    def Panel: js.Any = js.native
    @scala.inline
    def Panel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/accordion/index.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/accordion/index.native", "default.defaultProps.styles")
      @js.native
      def styles: js.Any = js.native
      @scala.inline
      def styles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Accordion
    extends Component[AccordionNativeProps, js.Any, js.Any] {
    
    def onChange(idx: Double): Unit = js.native
    
    def renderContent(section: AccordionHeader): Element = js.native
    
    def renderHeader(section: AccordionHeader, _underscore: Double, isActive: Boolean): Element = js.native
  }
  
  @js.native
  trait AccordionHeader extends StObject {
    
    var content: ReactElement = js.native
    
    var style: StyleProp[ViewStyle] = js.native
    
    var title: String = js.native
  }
  object AccordionHeader {
    
    @scala.inline
    def apply(content: ReactElement, title: String): AccordionHeader = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionHeader]
    }
    
    @scala.inline
    implicit class AccordionHeaderMutableBuilder[Self <: AccordionHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccordionNativeProps extends AccordionPropsTypes {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[AccordionStyle] = js.native
  }
  object AccordionNativeProps {
    
    @scala.inline
    def apply(): AccordionNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionNativeProps]
    }
    
    @scala.inline
    implicit class AccordionNativePropsMutableBuilder[Self <: AccordionNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: AccordionStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait AccordionPanelProps extends StObject {
    
    var header: js.Any = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object AccordionPanelProps {
    
    @scala.inline
    def apply(header: js.Any): AccordionPanelProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    @scala.inline
    implicit class AccordionPanelPropsMutableBuilder[Self <: AccordionPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
