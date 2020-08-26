package typings.antDesignReactNative.accordionMod

import typings.antDesignReactNative.anon.PartialAccordionStyle
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.mod.EasingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
/* Inlined parent std.Partial<react-native-collapsible.react-native-collapsible/Accordion.AccordionProps<T>> */
@js.native
trait AccordionNativeProps[T] extends js.Object {
  var activeSections: js.UndefOr[js.Array[Double]] = js.native
  var align: js.UndefOr[top | center | bottom] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[EasingMode | js.Any] = js.native
  var expandFromBottom: js.UndefOr[Boolean] = js.native
  var expandMultiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* indexes */ js.Array[Double], Unit]] = js.native
  var renderContent: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var renderFooter: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var renderHeader: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var renderSectionTitle: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var sections: js.UndefOr[js.Array[T]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[PartialAccordionStyle] = js.native
  var touchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  var touchableProps: js.UndefOr[js.Object] = js.native
  var underlayColor: js.UndefOr[String] = js.native
}

object AccordionNativeProps {
  @scala.inline
  def apply[T](): AccordionNativeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionNativeProps[T]]
  }
  @scala.inline
  implicit class AccordionNativePropsOps[Self <: AccordionNativeProps[_], T] (val x: Self with AccordionNativeProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveSectionsVarargs(value: Double*): Self = this.set("activeSections", js.Array(value :_*))
    @scala.inline
    def setActiveSections(value: js.Array[Double]): Self = this.set("activeSections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveSections: Self = this.set("activeSections", js.undefined)
    @scala.inline
    def setAlign(value: top | center | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: EasingMode | js.Any): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setExpandFromBottom(value: Boolean): Self = this.set("expandFromBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandFromBottom: Self = this.set("expandFromBottom", js.undefined)
    @scala.inline
    def setExpandMultiple(value: Boolean): Self = this.set("expandMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandMultiple: Self = this.set("expandMultiple", js.undefined)
    @scala.inline
    def setOnChange(value: /* indexes */ js.Array[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRenderContent(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self = this.set("renderContent", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderContent: Self = this.set("renderContent", js.undefined)
    @scala.inline
    def setRenderFooter(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self = this.set("renderFooter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    @scala.inline
    def setRenderHeader(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self = this.set("renderHeader", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    @scala.inline
    def setRenderSectionTitle(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self = this.set("renderSectionTitle", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderSectionTitle: Self = this.set("renderSectionTitle", js.undefined)
    @scala.inline
    def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("sectionContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionContainerStyle: Self = this.set("sectionContainerStyle", js.undefined)
    @scala.inline
    def setSectionContainerStyleNull: Self = this.set("sectionContainerStyle", null)
    @scala.inline
    def setSectionsVarargs(value: T*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[T]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: PartialAccordionStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("touchableComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchableComponent: Self = this.set("touchableComponent", js.undefined)
    @scala.inline
    def setTouchableProps(value: js.Object): Self = this.set("touchableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchableProps: Self = this.set("touchableProps", js.undefined)
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

