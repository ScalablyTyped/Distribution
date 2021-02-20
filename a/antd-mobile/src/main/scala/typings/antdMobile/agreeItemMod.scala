package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.checkboxPropsTypeMod.CheckboxPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AgreeItem
    extends Component[AgreeItemPropsType, js.Any, js.Any]
  
  @js.native
  trait AgreeItemPropsType extends CheckboxPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var wrapLabel: js.UndefOr[Boolean] = js.native
  }
  object AgreeItemPropsType {
    
    @scala.inline
    def apply(): AgreeItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgreeItemPropsType]
    }
    
    @scala.inline
    implicit class AgreeItemPropsTypeMutableBuilder[Self <: AgreeItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrapLabel(value: Boolean): Self = StObject.set(x, "wrapLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapLabelUndefined: Self = StObject.set(x, "wrapLabel", js.undefined)
    }
  }
}
