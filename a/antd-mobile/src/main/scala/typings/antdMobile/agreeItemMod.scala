package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.checkboxPropsTypeMod.CheckboxPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agreeItemMod {
  
  @JSImport("antd-mobile/lib/checkbox/AgreeItem", JSImport.Default)
  @js.native
  class default () extends AgreeItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/checkbox/AgreeItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/checkbox/AgreeItem", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AgreeItem
    extends Component[AgreeItemPropsType, js.Any, js.Any]
  
  trait AgreeItemPropsType
    extends StObject
       with CheckboxPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var wrapLabel: js.UndefOr[Boolean] = js.undefined
  }
  object AgreeItemPropsType {
    
    inline def apply(): AgreeItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgreeItemPropsType]
    }
    
    extension [Self <: AgreeItemPropsType](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrapLabel(value: Boolean): Self = StObject.set(x, "wrapLabel", value.asInstanceOf[js.Any])
      
      inline def setWrapLabelUndefined: Self = StObject.set(x, "wrapLabel", js.undefined)
    }
  }
}
