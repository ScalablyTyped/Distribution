package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataValue extends StObject {
  
  /**
    * Metadata value to assign to an Application Manager application.
    */
  var Value: js.UndefOr[MetadataValueString] = js.undefined
}
object MetadataValue {
  
  inline def apply(): MetadataValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: MetadataValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
