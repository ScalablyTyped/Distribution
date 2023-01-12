package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigIdResponse extends StObject {
  
  /**
    * ARN of a Config.
    */
  var configArn: js.UndefOr[ConfigArn] = js.undefined
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
}
object ConfigIdResponse {
  
  inline def apply(): ConfigIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigIdResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigArn(value: ConfigArn): Self = StObject.set(x, "configArn", value.asInstanceOf[js.Any])
    
    inline def setConfigArnUndefined: Self = StObject.set(x, "configArn", js.undefined)
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
  }
}
