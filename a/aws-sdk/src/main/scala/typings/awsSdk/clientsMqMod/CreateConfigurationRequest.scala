package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationRequest extends StObject {
  
  /**
    * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.clientsMqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: typings.awsSdk.clientsMqMod.EngineType
  
  /**
    * Required. The broker engine's version. For a list of supported engine versions, see Supported engines.
    */
  var EngineVersion: string
  
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: string
  
  /**
    * Create tags when creating the configuration.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateConfigurationRequest {
  
  inline def apply(EngineType: EngineType, EngineVersion: string, Name: string): CreateConfigurationRequest = {
    val __obj = js.Dynamic.literal(EngineType = EngineType.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
