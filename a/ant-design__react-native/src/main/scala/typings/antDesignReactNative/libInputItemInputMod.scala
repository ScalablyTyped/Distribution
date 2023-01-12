package typings.antDesignReactNative

import typings.react.mod.Component
import typings.reactNative.mod.TextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputItemInputMod {
  
  @JSImport("@ant-design/react-native/lib/input-item/Input", JSImport.Default)
  @js.native
  open class default protected () extends Input {
    def this(props: TextInputProps) = this()
  }
  
  @js.native
  trait Input extends Component[TextInputProps, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MInput(nextProps: TextInputProps): Unit = js.native
    
    def clear(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInput(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInput(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var inputRef: TextInput | Null = js.native
  }
  
  trait TextInputProps
    extends StObject
       with typings.reactNative.mod.TextInputProps {
    
    var focused: js.UndefOr[Boolean] = js.undefined
  }
  object TextInputProps {
    
    inline def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    }
  }
}
