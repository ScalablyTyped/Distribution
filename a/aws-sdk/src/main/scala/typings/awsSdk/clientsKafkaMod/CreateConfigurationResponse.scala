package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    Latest revision of the configuration.
    
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  
  /**
    * 
    The name of the configuration.
    
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The state of the configuration. The possible states are ACTIVE, DELETING, and DELETE_FAILED. 
    
    */
  var State: js.UndefOr[ConfigurationState] = js.undefined
}
object CreateConfigurationResponse {
  
  inline def apply(): CreateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigurationResponse]
  }
  
  extension [Self <: CreateConfigurationResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLatestRevision(value: ConfigurationRevision): Self = StObject.set(x, "LatestRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestRevisionUndefined: Self = StObject.set(x, "LatestRevision", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ConfigurationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
