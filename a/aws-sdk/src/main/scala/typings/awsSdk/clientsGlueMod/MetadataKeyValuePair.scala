package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataKeyValuePair extends StObject {
  
  /**
    * A metadata key.
    */
  var MetadataKey: js.UndefOr[MetadataKeyString] = js.undefined
  
  /**
    * A metadata key’s corresponding value.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.undefined
}
object MetadataKeyValuePair {
  
  inline def apply(): MetadataKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataKeyValuePair]
  }
  
  extension [Self <: MetadataKeyValuePair](x: Self) {
    
    inline def setMetadataKey(value: MetadataKeyString): Self = StObject.set(x, "MetadataKey", value.asInstanceOf[js.Any])
    
    inline def setMetadataKeyUndefined: Self = StObject.set(x, "MetadataKey", js.undefined)
    
    inline def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    inline def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
  }
}
