package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStringKeyValuePair extends StObject {
  
  /**
    * The key. You can omit the key.
    */
  var Key: js.UndefOr[StringValue] = js.undefined
  
  /**
    * The value.
    */
  var Value: js.UndefOr[StringValue] = js.undefined
}
object QueryStringKeyValuePair {
  
  inline def apply(): QueryStringKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringKeyValuePair]
  }
  
  extension [Self <: QueryStringKeyValuePair](x: Self) {
    
    inline def setKey(value: StringValue): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: StringValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
