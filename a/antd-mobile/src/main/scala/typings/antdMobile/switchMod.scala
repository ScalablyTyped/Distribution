package typings.antdMobile

import typings.antdMobile.anon.Name
import typings.antdMobile.switchPropsTypeMod.SwitchPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  @JSImport("antd-mobile/lib/switch", JSImport.Default)
  @js.native
  class default () extends Switch
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/switch", "default.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    @scala.inline
    def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Switch
    extends Component[SwitchProps, js.Any, js.Any] {
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onClick(e: js.Any): Unit = js.native
  }
  
  trait SwitchProps
    extends StObject
       with SwitchPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SwitchProps {
    
    @scala.inline
    def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
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
