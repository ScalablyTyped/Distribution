package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ContextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMixinMod {
  
  @JSImport("@ant-design/react-native/lib/picker/PickerMixin", JSImport.Default)
  @js.native
  def default(ComposedComponent: js.Any): ContextType = js.native
  
  @js.native
  trait ItemProps extends StObject {
    
    var value: js.Any = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(value: js.Any): ItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
