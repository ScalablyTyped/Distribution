package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ContextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerPickerMixinMod {
  
  @JSImport("@ant-design/react-native/lib/picker/PickerMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ComposedComponent: Any): ContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ContextType]
  
  trait ItemProps extends StObject {
    
    var value: Any
  }
  object ItemProps {
    
    inline def apply(value: Any): ItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
