package typings.antDesignReactNative

import typings.react.mod.Component
import typings.reactNative.mod.TextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@ant-design/react-native/lib/input-item/Input", JSImport.Default)
  @js.native
  class default protected () extends Input {
    def this(props: TextInputProps) = this()
  }
  
  @js.native
  trait Input
    extends Component[TextInputProps, js.Any, js.Any] {
    
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
  
  @js.native
  trait TextInputProps
    extends typings.reactNative.mod.TextInputProps {
    
    var focused: js.UndefOr[Boolean] = js.native
  }
  object TextInputProps {
    
    @scala.inline
    def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit class TextInputPropsMutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    }
  }
}
