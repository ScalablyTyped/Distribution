package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalValueWhenUnsetConfiguration extends StObject {
  
  /**
    * A custom value that's used when the value of a parameter isn't set.
    */
  var CustomValue: js.UndefOr[SensitiveDouble] = js.undefined
  
  /**
    * The built-in options for default values. The value can be one of the following:    RECOMMENDED: The recommended value.    NULL: The NULL value.  
    */
  var ValueWhenUnsetOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ValueWhenUnsetOption] = js.undefined
}
object DecimalValueWhenUnsetConfiguration {
  
  inline def apply(): DecimalValueWhenUnsetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalValueWhenUnsetConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalValueWhenUnsetConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomValue(value: SensitiveDouble): Self = StObject.set(x, "CustomValue", value.asInstanceOf[js.Any])
    
    inline def setCustomValueUndefined: Self = StObject.set(x, "CustomValue", js.undefined)
    
    inline def setValueWhenUnsetOption(value: ValueWhenUnsetOption): Self = StObject.set(x, "ValueWhenUnsetOption", value.asInstanceOf[js.Any])
    
    inline def setValueWhenUnsetOptionUndefined: Self = StObject.set(x, "ValueWhenUnsetOption", js.undefined)
  }
}
