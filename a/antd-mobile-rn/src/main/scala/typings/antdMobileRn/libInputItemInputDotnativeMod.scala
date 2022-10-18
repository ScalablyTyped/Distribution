package typings.antdMobileRn

import typings.react.mod.Component
import typings.reactNative.mod.TextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputItemInputDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/input-item/Input.native", JSImport.Default)
  @js.native
  open class default protected () extends Input {
    def this(props: TextInputProps) = this()
  }
  
  @js.native
  trait Input extends Component[TextInputProps, Any, Any] {
    
    def clear(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInput(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInput(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MInput(nextProps: TextInputProps): Unit = js.native
    
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
    
    extension [Self <: TextInputProps](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    }
  }
}
