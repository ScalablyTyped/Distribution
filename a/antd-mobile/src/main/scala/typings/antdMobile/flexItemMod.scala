package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.flexPropsTypeMod.FlexItemPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexItemMod {
  
  @JSImport("antd-mobile/lib/flex/FlexItem", JSImport.Default)
  @js.native
  class default () extends FlexItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/flex/FlexItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/flex/FlexItem", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    @scala.inline
    def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FlexItem
    extends Component[FlexItemProps, js.Any, js.Any]
  
  @js.native
  trait FlexItemProps extends FlexItemPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object FlexItemProps {
    
    @scala.inline
    def apply(): FlexItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemProps]
    }
    
    @scala.inline
    implicit class FlexItemPropsMutableBuilder[Self <: FlexItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
