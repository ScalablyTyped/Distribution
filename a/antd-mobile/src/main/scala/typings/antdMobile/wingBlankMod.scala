package typings.antdMobile

import typings.antdMobile.anon.PrefixClsSize
import typings.antdMobile.wingBlankPropsTypeMod.WingBlankPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wingBlankMod {
  
  @JSImport("antd-mobile/lib/wing-blank", JSImport.Default)
  @js.native
  class default () extends WingBlank
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/wing-blank", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/wing-blank", "default.defaultProps")
    @js.native
    def defaultProps: PrefixClsSize = js.native
    @scala.inline
    def defaultProps_=(x: PrefixClsSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait WingBlank
    extends Component[WingBlankProps, js.Any, js.Any]
  
  @js.native
  trait WingBlankProps extends WingBlankPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object WingBlankProps {
    
    @scala.inline
    def apply(): WingBlankProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankProps]
    }
    
    @scala.inline
    implicit class WingBlankPropsMutableBuilder[Self <: WingBlankProps] (val x: Self) extends AnyVal {
      
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
