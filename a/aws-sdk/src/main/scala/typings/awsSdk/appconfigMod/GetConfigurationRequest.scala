package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationRequest extends StObject {
  
  /**
    * The application to get. Specify either the application name or the application ID.
    */
  var Application: StringWithLengthBetween1And64
  
  /**
    * The configuration version returned in the most recent GetConfiguration response.  AppConfig uses the value of the ClientConfigurationVersion parameter to identify the configuration version on your clients. If you don’t send ClientConfigurationVersion with each call to GetConfiguration, your clients receive the current configuration. You are charged each time your clients receive a configuration. To avoid excess charges, we recommend that you include the ClientConfigurationVersion value with every call to GetConfiguration. This value must be saved on your client. Subsequent calls to GetConfiguration must pass this value by using the ClientConfigurationVersion parameter.   For more information about working with configurations, see Retrieving the Configuration in the AppConfig User Guide.
    */
  var ClientConfigurationVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The clientId parameter in the following command is a unique, user-specified ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration in intervals, as defined in the deployment strategy. 
    */
  var ClientId: StringWithLengthBetween1And64
  
  /**
    * The configuration to get. Specify either the configuration name or the configuration ID.
    */
  var Configuration: StringWithLengthBetween1And64
  
  /**
    * The environment to get. Specify either the environment name or the environment ID.
    */
  var Environment: StringWithLengthBetween1And64
}
object GetConfigurationRequest {
  
  inline def apply(
    Application: StringWithLengthBetween1And64,
    ClientId: StringWithLengthBetween1And64,
    Configuration: StringWithLengthBetween1And64,
    Environment: StringWithLengthBetween1And64
  ): GetConfigurationRequest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationRequest]
  }
  
  extension [Self <: GetConfigurationRequest](x: Self) {
    
    inline def setApplication(value: StringWithLengthBetween1And64): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClientConfigurationVersion(value: Version): Self = StObject.set(x, "ClientConfigurationVersion", value.asInstanceOf[js.Any])
    
    inline def setClientConfigurationVersionUndefined: Self = StObject.set(x, "ClientConfigurationVersion", js.undefined)
    
    inline def setClientId(value: StringWithLengthBetween1And64): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: StringWithLengthBetween1And64): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: StringWithLengthBetween1And64): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
  }
}
