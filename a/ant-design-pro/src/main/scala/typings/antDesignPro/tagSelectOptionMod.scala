package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagSelectOptionMod {
  
  @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
  @js.native
  class default ()
    extends Component[TagSelectOptionProps, js.Any, js.Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", "default.isTagSelectOption")
    @js.native
    def isTagSelectOption: js.UndefOr[Boolean] = js.native
    @scala.inline
    def isTagSelectOption_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTagSelectOption")(x.asInstanceOf[js.Any])
  }
  
  type TagSelectOption = Component[TagSelectOptionProps, js.Any, js.Any]
  
  trait TagSelectOptionProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ String | Double, /* state */ Boolean, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object TagSelectOptionProps {
    
    @scala.inline
    def apply(): TagSelectOptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSelectOptionProps]
    }
    
    @scala.inline
    implicit class TagSelectOptionPropsMutableBuilder[Self <: TagSelectOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String | Double, /* state */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
