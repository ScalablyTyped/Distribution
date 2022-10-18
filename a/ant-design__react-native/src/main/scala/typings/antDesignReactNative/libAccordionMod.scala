package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PartialAccordionStyle
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.libAccordionStyleMod.AccordionStyle
import typings.antDesignReactNative.libStyleMod.Theme
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.mod.EasingMode
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAccordionMod {
  
  @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
  @js.native
  open class default[T /* <: AccordionHeader */] () extends Accordion[T]
  object default {
    
    /* was `typeof AccordionPanel` */
    @JSImport("@ant-design/react-native/lib/accordion", "default.Panel")
    @js.native
    open class Panel () extends AccordionPanel
  }
  
  @js.native
  trait Accordion[T /* <: AccordionHeader */] extends Component[AccordionNativeProps[T], Any, Any] {
    
    def renderContent(styles: ReturnType[js.Function1[/* theme */ Theme, AccordionStyle]]): js.Function1[/* section */ T, Element] = js.native
    
    def renderHeader(styles: ReturnType[js.Function1[/* theme */ Theme, AccordionStyle]]): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, Element] = js.native
  }
  object Accordion {
    
    /* was `typeof AccordionPanel` */
    type Panel = AccordionPanel
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
  
  /* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
  /* Inlined parent std.Partial<react-native-collapsible.react-native-collapsible/Accordion.AccordionProps<T>> */
  trait AccordionNativeProps[T] extends StObject {
    
    var activeSections: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    var children: ReactElement | js.Array[ReactElement]
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingMode | Any] = js.undefined
    
    var expandFromBottom: js.UndefOr[Boolean] = js.undefined
    
    var expandMultiple: js.UndefOr[Boolean] = js.undefined
    
    var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, Double | String]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* indexes */ js.Array[Double], Unit]] = js.undefined
    
    var renderAsFlatList: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply[T](children: ReactElement | js.Array[ReactElement]): AccordionNativeProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionNativeProps[T]]
    }
    
    extension [Self <: AccordionNativeProps[?], T](x: Self & AccordionNativeProps[T]) {
      
      inline def setActiveSections(value: js.Array[Double | String]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
      
      inline def setActiveSectionsUndefined: Self = StObject.set(x, "activeSections", js.undefined)
      
      inline def setActiveSectionsVarargs(value: (Double | String)*): Self = StObject.set(x, "activeSections", js.Array(value*))
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: EasingMode | Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setExpandFromBottom(value: Boolean): Self = StObject.set(x, "expandFromBottom", value.asInstanceOf[js.Any])
      
      inline def setExpandFromBottomUndefined: Self = StObject.set(x, "expandFromBottom", js.undefined)
      
      inline def setExpandMultiple(value: Boolean): Self = StObject.set(x, "expandMultiple", value.asInstanceOf[js.Any])
      
      inline def setExpandMultipleUndefined: Self = StObject.set(x, "expandMultiple", js.undefined)
      
      inline def setKeyExtractor(value: (/* item */ T, /* index */ Double) => Double | String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      inline def setOnChange(value: /* indexes */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderAsFlatList(value: Boolean): Self = StObject.set(x, "renderAsFlatList", value.asInstanceOf[js.Any])
      
      inline def setRenderAsFlatListUndefined: Self = StObject.set(x, "renderAsFlatList", js.undefined)
      
      inline def setRenderContent(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderContent", js.Any.fromFunction4(value))
      
      inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      inline def setRenderFooter(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderFooter", js.Any.fromFunction4(value))
      
      inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      inline def setRenderHeader(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderHeader", js.Any.fromFunction4(value))
      
      inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      inline def setRenderSectionTitle(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction4(value))
      
      inline def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
      
      inline def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sectionContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setSectionContainerStyleNull: Self = StObject.set(x, "sectionContainerStyle", null)
      
      inline def setSectionContainerStyleUndefined: Self = StObject.set(x, "sectionContainerStyle", js.undefined)
      
      inline def setSections(value: js.Array[T]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      inline def setSectionsVarargs(value: T*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: PartialAccordionStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
      
      inline def setTouchableProps(value: js.Object): Self = StObject.set(x, "touchableProps", value.asInstanceOf[js.Any])
      
      inline def setTouchablePropsUndefined: Self = StObject.set(x, "touchableProps", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait AccordionPanel extends Component[AccordionPanelProps, Any, Any]
  
  trait AccordionPanelProps extends StObject {
    
    var children: ReactNode
    
    var header: Any
    
    var key: js.UndefOr[String] = js.undefined
  }
  object AccordionPanelProps {
    
    inline def apply(header: Any): AccordionPanelProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    extension [Self <: AccordionPanelProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
