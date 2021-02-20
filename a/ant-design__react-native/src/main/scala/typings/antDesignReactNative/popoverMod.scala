package typings.antDesignReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignReactNative.anon.OnSelect
import typings.antDesignReactNative.anon.TypeofPopoverItem
import typings.antDesignReactNative.antDesignReactNativeStrings.auto
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.popoverStyleMod.PopoverStyle
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalPopover.popoverGeometryMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
  @js.native
  class default () extends Popover
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/popover", "default.Item")
    @js.native
    def Item: TypeofPopoverItem = js.native
    @scala.inline
    def Item_=(x: TypeofPopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/popover", "default.defaultProps")
    @js.native
    def defaultProps: OnSelect = js.native
    @scala.inline
    def defaultProps_=(x: OnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
  @js.native
  class PopoverItem protected ()
    extends PureComponent[PopoverItemProps, js.Object, js.Any] {
    def this(props: PopoverItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopoverItemProps, context: js.Any) = this()
  }
  /* static members */
  object PopoverItem {
    
    @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/popover", "PopoverItem.displayName")
    @js.native
    def displayName: typings.antDesignReactNative.antDesignReactNativeStrings.PopoverItem = js.native
    @scala.inline
    def displayName_=(x: typings.antDesignReactNative.antDesignReactNativeStrings.PopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Popover
    extends PureComponent[PopoverProps, js.Any, js.Any] {
    
    def onSelect(value: js.Any, closePopover: js.Any): Unit = js.native
    
    def renderOverlay(closePopover: js.Any): js.UndefOr[js.Object | Null] = js.native
  }
  
  @js.native
  trait PopoverItemProps
    extends /* key */ StringDictionary[js.Any] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var value: js.Any = js.native
  }
  object PopoverItemProps {
    
    @scala.inline
    def apply(value: js.Any): PopoverItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverItemProps]
    }
    
    @scala.inline
    implicit class PopoverItemPropsMutableBuilder[Self <: PopoverItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopoverProps extends WithThemeStyles[PopoverStyle] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.native
    
    var overlay: ReactNode = js.native
    
    var placement: js.UndefOr[Placement | auto] = js.native
    
    var renderOverlayComponent: js.UndefOr[
        js.Function2[/* node */ ReactNode, /* closePopover */ js.Function0[Unit], ReactNode]
      ] = js.native
    
    var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRenderOverlayComponent(value: (/* node */ ReactNode, /* closePopover */ js.Function0[Unit]) => ReactNode): Self = StObject.set(x, "renderOverlayComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderOverlayComponentUndefined: Self = StObject.set(x, "renderOverlayComponent", js.undefined)
      
      @scala.inline
      def setTriggerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      @scala.inline
      def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
