package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ContextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMixinMod {
  
  @JSImport("@ant-design/react-native/lib/picker/PickerMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(ComposedComponent: js.Any): ContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ContextType]
  
  trait ItemProps extends StObject {
    
    var value: js.Any
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
