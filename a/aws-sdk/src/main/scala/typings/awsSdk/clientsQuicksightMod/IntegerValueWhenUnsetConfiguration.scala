package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerValueWhenUnsetConfiguration extends StObject {
  
  /**
    * A custom value that's used when the value of a parameter isn't set.
    */
  var CustomValue: js.UndefOr[SensitiveLong] = js.undefined
  
  /**
    * The built-in options for default values. The value can be one of the following:    RECOMMENDED: The recommended value.    NULL: The NULL value.  
    */
  var ValueWhenUnsetOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ValueWhenUnsetOption] = js.undefined
}
object IntegerValueWhenUnsetConfiguration {
  
  inline def apply(): IntegerValueWhenUnsetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerValueWhenUnsetConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerValueWhenUnsetConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomValue(value: SensitiveLong): Self = StObject.set(x, "CustomValue", value.asInstanceOf[js.Any])
    
    inline def setCustomValueUndefined: Self = StObject.set(x, "CustomValue", js.undefined)
    
    inline def setValueWhenUnsetOption(value: ValueWhenUnsetOption): Self = StObject.set(x, "ValueWhenUnsetOption", value.asInstanceOf[js.Any])
    
    inline def setValueWhenUnsetOptionUndefined: Self = StObject.set(x, "ValueWhenUnsetOption", js.undefined)
  }
}
