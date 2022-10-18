package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsagePlanKey extends StObject {
  
  /**
    * The Id of a usage plan key.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a usage plan key.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of a usage plan key. Currently, the valid key type is API_KEY.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value of a usage plan key.
    */
  var value: js.UndefOr[String] = js.undefined
}
object UsagePlanKey {
  
  inline def apply(): UsagePlanKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKey]
  }
  
  extension [Self <: UsagePlanKey](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
