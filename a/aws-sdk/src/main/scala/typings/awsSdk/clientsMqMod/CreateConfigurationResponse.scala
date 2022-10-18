package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationResponse extends StObject {
  
  /**
    * Required. The Amazon Resource Name (ARN) of the configuration.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.clientsMqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object CreateConfigurationResponse {
  
  inline def apply(): CreateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigurationResponse]
  }
  
  extension [Self <: CreateConfigurationResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLatestRevision(value: ConfigurationRevision): Self = StObject.set(x, "LatestRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestRevisionUndefined: Self = StObject.set(x, "LatestRevision", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
