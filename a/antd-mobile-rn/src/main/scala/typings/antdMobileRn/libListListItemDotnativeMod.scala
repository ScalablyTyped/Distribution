package typings.antdMobileRn

import typings.antdMobileRn.anon.Arrow
import typings.antdMobileRn.anon.PartialListItemProps
import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.anon.TypeofBrief
import typings.antdMobileRn.libListPropsTypeMod.ListItemPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListListItemDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
  @js.native
  open class default () extends Item
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "default.Brief")
    @js.native
    def Brief: TypeofBrief = js.native
    inline def Brief_=(x: TypeofBrief): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brief")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "default.defaultProps")
    @js.native
    def defaultProps: PartialListItemProps = js.native
    inline def defaultProps_=(x: PartialListItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
  @js.native
  open class Brief protected () extends Component[BriefProps, Any, Any] {
    def this(props: BriefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BriefProps, context: Any) = this()
  }
  /* static members */
  object Brief {
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait BriefProps
    extends StObject
       with typings.antdMobileRn.libListPropsTypeMod.BriefProps {
    
    var styles: js.UndefOr[typings.antdMobileRn.anon.Brief] = js.undefined
  }
  object BriefProps {
    
    inline def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BriefProps] (val x: Self) extends AnyVal {
      
      inline def setStyles(value: typings.antdMobileRn.anon.Brief): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait Item extends Component[ListItemProps, Any, Any]
  
  trait ListItemProps
    extends StObject
       with ListItemPropsType {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Arrow] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Arrow): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
