package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagSelectTagSelectOptionMod {
  
  @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
  @js.native
  open class default () extends Component[TagSelectOptionProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", "default.isTagSelectOption")
    @js.native
    def isTagSelectOption: js.UndefOr[Boolean] = js.native
    inline def isTagSelectOption_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTagSelectOption")(x.asInstanceOf[js.Any])
  }
  
  type TagSelectOption = Component[TagSelectOptionProps, Any, Any]
  
  trait TagSelectOptionProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ String | Double, /* state */ Boolean, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object TagSelectOptionProps {
    
    inline def apply(): TagSelectOptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSelectOptionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagSelectOptionProps] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setOnChange(value: (/* value */ String | Double, /* state */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
