package typings.antDesignReactNative

import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typings.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/Checkbox", JSImport.Default)
  @js.native
  class default protected () extends Checkbox {
    def this(props: CheckboxProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/checkbox/Checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/checkbox/Checkbox", "default.AgreeItem")
    @js.native
    def AgreeItem: js.Any = js.native
    @scala.inline
    def AgreeItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgreeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/checkbox/Checkbox", "default.CheckboxItem")
    @js.native
    def CheckboxItem: js.Any = js.native
    @scala.inline
    def CheckboxItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Checkbox
    extends Component[CheckboxProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCheckbox(nextProps: CheckboxProps): Unit = js.native
    
    def handleClick(): Unit = js.native
  }
  
  @js.native
  trait CheckboxProps
    extends CheckboxPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.native
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
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
