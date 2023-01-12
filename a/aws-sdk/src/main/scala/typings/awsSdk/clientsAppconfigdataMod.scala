package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsAppconfigdataMod {
  
  @JSImport("aws-sdk/clients/appconfigdata", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends AppConfigData {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait AppConfigData extends Service {
    
    @JSName("config")
    var config_AppConfigData: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Retrieves the latest deployed configuration. This API may return empty configuration data if the client already has the latest version. For more information about this API action and to view example CLI commands that show how to use it with the StartConfigurationSession API action, see Receiving the configuration in the AppConfig User Guide.   Note the following important information.   Each configuration token is only valid for one call to GetLatestConfiguration. The GetLatestConfiguration response includes a NextPollConfigurationToken that should always replace the token used for the just-completed call in preparation for the next one.     GetLatestConfiguration is a priced call. For more information, see Pricing.   
      */
    def getLatestConfiguration(): Request[GetLatestConfigurationResponse, AWSError] = js.native
    def getLatestConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetLatestConfigurationResponse, Unit]): Request[GetLatestConfigurationResponse, AWSError] = js.native
    /**
      * Retrieves the latest deployed configuration. This API may return empty configuration data if the client already has the latest version. For more information about this API action and to view example CLI commands that show how to use it with the StartConfigurationSession API action, see Receiving the configuration in the AppConfig User Guide.   Note the following important information.   Each configuration token is only valid for one call to GetLatestConfiguration. The GetLatestConfiguration response includes a NextPollConfigurationToken that should always replace the token used for the just-completed call in preparation for the next one.     GetLatestConfiguration is a priced call. For more information, see Pricing.   
      */
    def getLatestConfiguration(params: GetLatestConfigurationRequest): Request[GetLatestConfigurationResponse, AWSError] = js.native
    def getLatestConfiguration(
      params: GetLatestConfigurationRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetLatestConfigurationResponse, Unit]
    ): Request[GetLatestConfigurationResponse, AWSError] = js.native
    
    /**
      * Starts a configuration session used to retrieve a deployed configuration. For more information about this API action and to view example CLI commands that show how to use it with the GetLatestConfiguration API action, see Receiving the configuration in the AppConfig User Guide. 
      */
    def startConfigurationSession(): Request[StartConfigurationSessionResponse, AWSError] = js.native
    def startConfigurationSession(callback: js.Function2[/* err */ AWSError, /* data */ StartConfigurationSessionResponse, Unit]): Request[StartConfigurationSessionResponse, AWSError] = js.native
    /**
      * Starts a configuration session used to retrieve a deployed configuration. For more information about this API action and to view example CLI commands that show how to use it with the GetLatestConfiguration API action, see Receiving the configuration in the AppConfig User Guide. 
      */
    def startConfigurationSession(params: StartConfigurationSessionRequest): Request[StartConfigurationSessionResponse, AWSError] = js.native
    def startConfigurationSession(
      params: StartConfigurationSessionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ StartConfigurationSessionResponse, Unit]
    ): Request[StartConfigurationSessionResponse, AWSError] = js.native
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsAppconfigdataMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  trait GetLatestConfigurationRequest extends StObject {
    
    /**
      * Token describing the current state of the configuration session. To obtain a token, first call the StartConfigurationSession API. Note that every call to GetLatestConfiguration will return a new ConfigurationToken (NextPollConfigurationToken in the response) and MUST be provided to subsequent GetLatestConfiguration API calls.
      */
    var ConfigurationToken: Token
  }
  object GetLatestConfigurationRequest {
    
    inline def apply(ConfigurationToken: Token): GetLatestConfigurationRequest = {
      val __obj = js.Dynamic.literal(ConfigurationToken = ConfigurationToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLatestConfigurationRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetLatestConfigurationRequest] (val x: Self) extends AnyVal {
      
      inline def setConfigurationToken(value: Token): Self = StObject.set(x, "ConfigurationToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLatestConfigurationResponse extends StObject {
    
    /**
      * The data of the configuration. This may be empty if the client already has the latest version of configuration.
      */
    var Configuration: js.UndefOr[SyntheticGetLatestConfigurationResponseBlob] = js.undefined
    
    /**
      * A standard MIME type describing the format of the configuration content.
      */
    var ContentType: js.UndefOr[String] = js.undefined
    
    /**
      * The latest token describing the current state of the configuration session. This MUST be provided to the next call to GetLatestConfiguration. 
      */
    var NextPollConfigurationToken: js.UndefOr[Token] = js.undefined
    
    /**
      * The amount of time the client should wait before polling for configuration updates again. Use RequiredMinimumPollIntervalInSeconds to set the desired poll interval.
      */
    var NextPollIntervalInSeconds: js.UndefOr[Integer] = js.undefined
  }
  object GetLatestConfigurationResponse {
    
    inline def apply(): GetLatestConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLatestConfigurationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetLatestConfigurationResponse] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: SyntheticGetLatestConfigurationResponseBlob): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setNextPollConfigurationToken(value: Token): Self = StObject.set(x, "NextPollConfigurationToken", value.asInstanceOf[js.Any])
      
      inline def setNextPollConfigurationTokenUndefined: Self = StObject.set(x, "NextPollConfigurationToken", js.undefined)
      
      inline def setNextPollIntervalInSeconds(value: Integer): Self = StObject.set(x, "NextPollIntervalInSeconds", value.asInstanceOf[js.Any])
      
      inline def setNextPollIntervalInSecondsUndefined: Self = StObject.set(x, "NextPollIntervalInSeconds", js.undefined)
    }
  }
  
  type Identifier = java.lang.String
  
  type Integer = Double
  
  type OptionalPollSeconds = Double
  
  trait StartConfigurationSessionRequest extends StObject {
    
    /**
      * The application ID or the application name.
      */
    var ApplicationIdentifier: Identifier
    
    /**
      * The configuration profile ID or the configuration profile name.
      */
    var ConfigurationProfileIdentifier: Identifier
    
    /**
      * The environment ID or the environment name.
      */
    var EnvironmentIdentifier: Identifier
    
    /**
      * Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that established the session can't call GetLatestConfiguration more frequently then every 60 seconds.
      */
    var RequiredMinimumPollIntervalInSeconds: js.UndefOr[OptionalPollSeconds] = js.undefined
  }
  object StartConfigurationSessionRequest {
    
    inline def apply(
      ApplicationIdentifier: Identifier,
      ConfigurationProfileIdentifier: Identifier,
      EnvironmentIdentifier: Identifier
    ): StartConfigurationSessionRequest = {
      val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], ConfigurationProfileIdentifier = ConfigurationProfileIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartConfigurationSessionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartConfigurationSessionRequest] (val x: Self) extends AnyVal {
      
      inline def setApplicationIdentifier(value: Identifier): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
      
      inline def setConfigurationProfileIdentifier(value: Identifier): Self = StObject.set(x, "ConfigurationProfileIdentifier", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentIdentifier(value: Identifier): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setRequiredMinimumPollIntervalInSeconds(value: OptionalPollSeconds): Self = StObject.set(x, "RequiredMinimumPollIntervalInSeconds", value.asInstanceOf[js.Any])
      
      inline def setRequiredMinimumPollIntervalInSecondsUndefined: Self = StObject.set(x, "RequiredMinimumPollIntervalInSeconds", js.undefined)
    }
  }
  
  trait StartConfigurationSessionResponse extends StObject {
    
    /**
      * Token encapsulating state about the configuration session. Provide this token to the GetLatestConfiguration API to retrieve configuration data.  This token should only be used once in your first call to GetLatestConfiguration. You MUST use the new token in the GetLatestConfiguration response (NextPollConfigurationToken) in each subsequent call to GetLatestConfiguration. 
      */
    var InitialConfigurationToken: js.UndefOr[Token] = js.undefined
  }
  object StartConfigurationSessionResponse {
    
    inline def apply(): StartConfigurationSessionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartConfigurationSessionResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartConfigurationSessionResponse] (val x: Self) extends AnyVal {
      
      inline def setInitialConfigurationToken(value: Token): Self = StObject.set(x, "InitialConfigurationToken", value.asInstanceOf[js.Any])
      
      inline def setInitialConfigurationTokenUndefined: Self = StObject.set(x, "InitialConfigurationToken", js.undefined)
    }
  }
  
  type String = java.lang.String
  
  type SyntheticGetLatestConfigurationResponseBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String
  
  type Token = java.lang.String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2021-11-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
