package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * Required. The ARN of the configuration.
    */
  var Arn: string
  
  /**
    * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
    */
  var AuthenticationStrategy: typings.awsSdk.clientsMqMod.AuthenticationStrategy
  
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.Date
  
  /**
    * Required. The description of the configuration.
    */
  var Description: string
  
  /**
    * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: typings.awsSdk.clientsMqMod.EngineType
  
  /**
    * Required. The broker engine's version. For a list of supported engine versions, see, Supported engines.
    */
  var EngineVersion: string
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: string
  
  /**
    * Required. The latest revision of the configuration.
    */
  var LatestRevision: ConfigurationRevision
  
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: string
  
  /**
    * The list of all tags associated with this configuration.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object Configuration {
  
  inline def apply(
    Arn: string,
    AuthenticationStrategy: AuthenticationStrategy,
    Created: js.Date,
    Description: string,
    EngineType: EngineType,
    EngineVersion: string,
    Id: string,
    LatestRevision: ConfigurationRevision,
    Name: string
  ): Configuration = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], AuthenticationStrategy = AuthenticationStrategy.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EngineType = EngineType.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LatestRevision = LatestRevision.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLatestRevision(value: ConfigurationRevision): Self = StObject.set(x, "LatestRevision", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
