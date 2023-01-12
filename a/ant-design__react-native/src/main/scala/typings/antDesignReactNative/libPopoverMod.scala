package typings.antDesignReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignReactNative.anon.OnSelect
import typings.antDesignReactNative.anon.TypeofPopoverItem
import typings.antDesignReactNative.antDesignReactNativeStrings.auto
import typings.antDesignReactNative.libPopoverStyleMod.PopoverStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalPopover.libPopoverGeometryMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverMod {
  
  @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
  @js.native
  open class default () extends Popover
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/popover", "default.Item")
    @js.native
    def Item: TypeofPopoverItem = js.native
    inline def Item_=(x: TypeofPopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/popover", "default.defaultProps")
    @js.native
    def defaultProps: OnSelect = js.native
    inline def defaultProps_=(x: OnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
  @js.native
  open class PopoverItem protected ()
    extends PureComponent[PopoverItemProps, js.Object, Any] {
    def this(props: PopoverItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopoverItemProps, context: Any) = this()
  }
  /* static members */
  object PopoverItem {
    
    @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/popover", "PopoverItem.displayName")
    @js.native
    def displayName: typings.antDesignReactNative.antDesignReactNativeStrings.PopoverItem = js.native
    inline def displayName_=(x: typings.antDesignReactNative.antDesignReactNativeStrings.PopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Popover extends PureComponent[PopoverProps, Any, Any] {
    
    def onSelect(value: Any, closePopover: Any): Unit = js.native
    
    def renderOverlay(closePopover: Any): ReactNode = js.native
  }
  
  trait PopoverItemProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var value: Any
  }
  object PopoverItemProps {
    
    inline def apply(value: Any): PopoverItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverItemProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverProps
    extends StObject
       with WithThemeStyles[PopoverStyle] {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* node */ Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    var overlay: ReactNode
    
    var placement: js.UndefOr[Placement | auto] = js.undefined
    
    var renderOverlayComponent: js.UndefOr[
        js.Function2[/* node */ ReactNode, /* closePopover */ js.Function0[Unit], ReactNode]
      ] = js.undefined
    
    var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnSelect(value: (/* node */ Any, /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOverlay(value: ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPlacement(value: Placement | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRenderOverlayComponent(value: (/* node */ ReactNode, /* closePopover */ js.Function0[Unit]) => ReactNode): Self = StObject.set(x, "renderOverlayComponent", js.Any.fromFunction2(value))
      
      inline def setRenderOverlayComponentUndefined: Self = StObject.set(x, "renderOverlayComponent", js.undefined)
      
      inline def setTriggerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      inline def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      inline def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
