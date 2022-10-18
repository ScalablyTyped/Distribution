package typings.antDesignProUtils

import typings.antDesignProUtils.antDesignProUtilsStrings.default
import typings.antDesignProUtils.antDesignProUtilsStrings.popover
import typings.antd.libFormFormItemMod.FormItemProps
import typings.antd.libPopoverMod.PopoverProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsInlineErrorFormItemMod {
  
  @JSImport("@ant-design/pro-utils/es/components/InlineErrorFormItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InlineErrorFormItem(props: InlineErrorFormItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InlineErrorFormItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait InlineErrorFormItemProps
    extends StObject
       with FormItemProps[Any] {
    
    var errorType: js.UndefOr[popover | default] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverProps] = js.undefined
  }
  object InlineErrorFormItemProps {
    
    inline def apply(): InlineErrorFormItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineErrorFormItemProps]
    }
    
    extension [Self <: InlineErrorFormItemProps](x: Self) {
      
      inline def setErrorType(value: popover | default): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      inline def setPopoverProps(value: PopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
    }
  }
}
