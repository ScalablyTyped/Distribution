package typings.antdMobileRn

import typings.antdMobileRn.anon.Arrow
import typings.antdMobileRn.anon.PartialListItemProps
import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.anon.TypeofBrief
import typings.antdMobileRn.listPropsTypeMod.ListItemPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
  @js.native
  class default () extends Item
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "default.Brief")
    @js.native
    def Brief: TypeofBrief = js.native
    @scala.inline
    def Brief_=(x: TypeofBrief): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brief")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "default.defaultProps")
    @js.native
    def defaultProps: PartialListItemProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialListItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
  @js.native
  class Brief protected ()
    extends Component[BriefProps, js.Any, js.Any] {
    def this(props: BriefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BriefProps, context: js.Any) = this()
  }
  /* static members */
  object Brief {
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    @scala.inline
    def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BriefProps
    extends typings.antdMobileRn.listPropsTypeMod.BriefProps {
    
    var styles: js.UndefOr[typings.antdMobileRn.anon.Brief] = js.native
  }
  object BriefProps {
    
    @scala.inline
    def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    @scala.inline
    implicit class BriefPropsMutableBuilder[Self <: BriefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: typings.antdMobileRn.anon.Brief): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait Item
    extends Component[ListItemProps, js.Any, js.Any]
  
  @js.native
  trait ListItemProps extends ListItemPropsType {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[Arrow] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: Arrow): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
