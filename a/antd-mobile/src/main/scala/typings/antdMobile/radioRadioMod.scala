package typings.antdMobile

import typings.antdMobile.anon.WrapLabel
import typings.antdMobile.radioPropsTypeMod.RadioPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioMod {
  
  @JSImport("antd-mobile/lib/radio/Radio", JSImport.Default)
  @js.native
  class default () extends Radio
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/radio/Radio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/radio/Radio", "default.RadioItem")
    @js.native
    def RadioItem: js.Any = js.native
    @scala.inline
    def RadioItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadioItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/radio/Radio", "default.defaultProps")
    @js.native
    def defaultProps: WrapLabel = js.native
    @scala.inline
    def defaultProps_=(x: WrapLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Radio
    extends Component[RadioProps, js.Any, js.Any]
  
  @js.native
  trait RadioProps extends RadioPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var listPrefixCls: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object RadioProps {
    
    @scala.inline
    def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPrefixClsUndefined: Self = StObject.set(x, "listPrefixCls", js.undefined)
      
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
