package typings.atAntDashDesignReactDashNative.libAccordionMod

import typings.atAntDashDesignReactDashNative.PartialAccordionStyle
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleMod.EasingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
/* Inlined parent std.Partial<react-native-collapsible.react-native-collapsible/Accordion.AccordionProps<T>> */
trait AccordionNativeProps[T] extends js.Object {
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
  def apply[T](
    activeSections: js.Array[Double] = null,
    align: top | center | bottom = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    onChange: /* indexes */ js.Array[Double] => Unit = null,
    renderContent: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderFooter: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderHeader: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderSectionTitle: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    sectionContainerStyle: StyleProp[ViewStyle] = null,
    sections: js.Array[T] = null,
    style: StyleProp[ViewStyle] = null,
    styles: PartialAccordionStyle = null,
    touchableComponent: ComponentClass[js.Object, ComponentState] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null
  ): AccordionNativeProps[T] = {
    val __obj = js.Dynamic.literal()
    if (activeSections != null) __obj.updateDynamic("activeSections")(activeSections.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFromBottom)) __obj.updateDynamic("expandFromBottom")(expandFromBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(expandMultiple)) __obj.updateDynamic("expandMultiple")(expandMultiple.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction4(renderContent))
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction4(renderHeader))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4(renderSectionTitle))
    if (sectionContainerStyle != null) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionNativeProps[T]]
  }
}

