package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PartialAccordionStyle
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.styleMod.AccordionStyle
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.mod.EasingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
  @js.native
  class default[T /* <: AccordionHeader */] () extends Accordion[T]
  object default {
    
    @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/accordion", "default.Panel")
    @js.native
    def Panel: js.Any = js.native
    @scala.inline
    def Panel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Accordion[T /* <: AccordionHeader */]
    extends Component[AccordionNativeProps[T], js.Any, js.Any] {
    
    def renderContent(styles: AccordionStyle): js.Function1[/* section */ T, Element] = js.native
    
    def renderHeader(styles: AccordionStyle): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, Element] = js.native
  }
  
  trait AccordionHeader extends StObject {
    
    var content: ReactElement
    
    var style: StyleProp[ViewStyle]
    
    var title: String
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
  
  /* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
  /* Inlined parent std.Partial<react-native-collapsible.react-native-collapsible/Accordion.AccordionProps<T>> */
  trait AccordionNativeProps[T] extends StObject {
    
    var activeSections: js.UndefOr[js.Array[Double]] = js.undefined
    
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingMode | js.Any] = js.undefined
    
    var expandFromBottom: js.UndefOr[Boolean] = js.undefined
    
    var expandMultiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* indexes */ js.Array[Double], Unit]] = js.undefined
    
    var renderContent: js.UndefOr[
        js.Function4[
          /* content */ T, 
          /* index */ Double, 
          /* isActive */ Boolean, 
          /* sections */ js.Array[T], 
          ReactElement
        ]
      ] = js.undefined
    
    var renderFooter: js.UndefOr[
        js.Function4[
          /* content */ T, 
          /* index */ Double, 
          /* isActive */ Boolean, 
          /* sections */ js.Array[T], 
          ReactElement
        ]
      ] = js.undefined
    
    var renderHeader: js.UndefOr[
        js.Function4[
          /* content */ T, 
          /* index */ Double, 
          /* isActive */ Boolean, 
          /* sections */ js.Array[T], 
          ReactElement
        ]
      ] = js.undefined
    
    var renderSectionTitle: js.UndefOr[
        js.Function4[
          /* content */ T, 
          /* index */ Double, 
          /* isActive */ Boolean, 
          /* sections */ js.Array[T], 
          ReactElement
        ]
      ] = js.undefined
    
    var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var sections: js.UndefOr[js.Array[T]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[PartialAccordionStyle] = js.undefined
    
    var touchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
    
    var touchableProps: js.UndefOr[js.Object] = js.undefined
    
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object AccordionNativeProps {
    
    @scala.inline
    def apply[T](): AccordionNativeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionNativeProps[T]]
    }
    
    @scala.inline
    implicit class AccordionNativePropsMutableBuilder[Self <: AccordionNativeProps[?], T] (val x: Self & AccordionNativeProps[T]) extends AnyVal {
      
      @scala.inline
      def setActiveSections(value: js.Array[Double]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSectionsUndefined: Self = StObject.set(x, "activeSections", js.undefined)
      
      @scala.inline
      def setActiveSectionsVarargs(value: Double*): Self = StObject.set(x, "activeSections", js.Array(value :_*))
      
      @scala.inline
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: EasingMode | js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setExpandFromBottom(value: Boolean): Self = StObject.set(x, "expandFromBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandFromBottomUndefined: Self = StObject.set(x, "expandFromBottom", js.undefined)
      
      @scala.inline
      def setExpandMultiple(value: Boolean): Self = StObject.set(x, "expandMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandMultipleUndefined: Self = StObject.set(x, "expandMultiple", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* indexes */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRenderContent(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderContent", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      @scala.inline
      def setRenderFooter(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderFooter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      @scala.inline
      def setRenderHeader(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderHeader", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      @scala.inline
      def setRenderSectionTitle(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
      
      @scala.inline
      def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sectionContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionContainerStyleNull: Self = StObject.set(x, "sectionContainerStyle", null)
      
      @scala.inline
      def setSectionContainerStyleUndefined: Self = StObject.set(x, "sectionContainerStyle", js.undefined)
      
      @scala.inline
      def setSections(value: js.Array[T]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      @scala.inline
      def setSectionsVarargs(value: T*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialAccordionStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
      
      @scala.inline
      def setTouchableProps(value: js.Object): Self = StObject.set(x, "touchableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchablePropsUndefined: Self = StObject.set(x, "touchableProps", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  trait AccordionPanelProps extends StObject {
    
    var header: js.Any
    
    var key: js.UndefOr[String] = js.undefined
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
