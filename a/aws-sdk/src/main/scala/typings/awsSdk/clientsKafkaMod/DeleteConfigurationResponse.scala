package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration.
    
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The state of the configuration. The possible states are ACTIVE, DELETING, and DELETE_FAILED. 
    
    */
  var State: js.UndefOr[ConfigurationState] = js.undefined
}
object DeleteConfigurationResponse {
  
  inline def apply(): DeleteConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConfigurationResponse]
  }
  
  extension [Self <: DeleteConfigurationResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setState(value: ConfigurationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
