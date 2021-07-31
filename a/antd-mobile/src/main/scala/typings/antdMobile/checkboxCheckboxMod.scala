package typings.antdMobile

import typings.antdMobile.anon.WrapLabel
import typings.antdMobile.checkboxPropsTypeMod.CheckboxPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod {
  
  @JSImport("antd-mobile/lib/checkbox/Checkbox", JSImport.Default)
  @js.native
  class default () extends Checkbox
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/checkbox/Checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/checkbox/Checkbox", "default.AgreeItem")
    @js.native
    def AgreeItem: js.Any = js.native
    @scala.inline
    def AgreeItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgreeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/checkbox/Checkbox", "default.CheckboxItem")
    @js.native
    def CheckboxItem: js.Any = js.native
    @scala.inline
    def CheckboxItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/checkbox/Checkbox", "default.defaultProps")
    @js.native
    def defaultProps: WrapLabel = js.native
    @scala.inline
    def defaultProps_=(x: WrapLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Checkbox
    extends Component[CheckboxProps, js.Any, js.Any]
  
  trait CheckboxProps
    extends StObject
       with CheckboxPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var wrapLabel: js.UndefOr[Boolean] = js.undefined
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
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
