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

object clientsApigatewaymanagementapiMod {
  
  @JSImport("aws-sdk/clients/apigatewaymanagementapi", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends ApiGatewayManagementApi {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait ApiGatewayManagementApi extends Service {
    
    @JSName("config")
    var config_ApiGatewayManagementApi: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Delete the connection with the provided id.
      */
    def deleteConnection(): Request[js.Object, AWSError] = js.native
    def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Delete the connection with the provided id.
      */
    def deleteConnection(params: DeleteConnectionRequest): Request[js.Object, AWSError] = js.native
    def deleteConnection(
      params: DeleteConnectionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
    
    /**
      * Get information about the connection with the provided id.
      */
    def getConnection(): Request[GetConnectionResponse, AWSError] = js.native
    def getConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]): Request[GetConnectionResponse, AWSError] = js.native
    /**
      * Get information about the connection with the provided id.
      */
    def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse, AWSError] = js.native
    def getConnection(
      params: GetConnectionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]
    ): Request[GetConnectionResponse, AWSError] = js.native
    
    /**
      * Sends the provided data to the specified connection.
      */
    def postToConnection(): Request[js.Object, AWSError] = js.native
    def postToConnection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Sends the provided data to the specified connection.
      */
    def postToConnection(params: PostToConnectionRequest): Request[js.Object, AWSError] = js.native
    def postToConnection(
      params: PostToConnectionRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsApigatewaymanagementapiMod.apiVersion] = js.undefined
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
  
  type Data = Buffer | js.typedarray.Uint8Array | Blob | String
  
  trait DeleteConnectionRequest extends StObject {
    
    var ConnectionId: string
  }
  object DeleteConnectionRequest {
    
    inline def apply(ConnectionId: string): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteConnectionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteConnectionRequest] (val x: Self) extends AnyVal {
      
      inline def setConnectionId(value: string): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetConnectionRequest extends StObject {
    
    var ConnectionId: string
  }
  object GetConnectionRequest {
    
    inline def apply(ConnectionId: string): GetConnectionRequest = {
      val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConnectionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetConnectionRequest] (val x: Self) extends AnyVal {
      
      inline def setConnectionId(value: string): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetConnectionResponse extends StObject {
    
    /**
      * The time in ISO 8601 format for when the connection was established.
      */
    var ConnectedAt: js.UndefOr[js.Date] = js.undefined
    
    var Identity: js.UndefOr[typings.awsSdk.clientsApigatewaymanagementapiMod.Identity] = js.undefined
    
    /**
      * The time in ISO 8601 format for when the connection was last active.
      */
    var LastActiveAt: js.UndefOr[js.Date] = js.undefined
  }
  object GetConnectionResponse {
    
    inline def apply(): GetConnectionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetConnectionResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetConnectionResponse] (val x: Self) extends AnyVal {
      
      inline def setConnectedAt(value: js.Date): Self = StObject.set(x, "ConnectedAt", value.asInstanceOf[js.Any])
      
      inline def setConnectedAtUndefined: Self = StObject.set(x, "ConnectedAt", js.undefined)
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
      
      inline def setLastActiveAt(value: js.Date): Self = StObject.set(x, "LastActiveAt", value.asInstanceOf[js.Any])
      
      inline def setLastActiveAtUndefined: Self = StObject.set(x, "LastActiveAt", js.undefined)
    }
  }
  
  trait Identity extends StObject {
    
    /**
      * The source IP address of the TCP connection making the request to API Gateway.
      */
    var SourceIp: string
    
    /**
      * The User Agent of the API caller.
      */
    var UserAgent: string
  }
  object Identity {
    
    inline def apply(SourceIp: string, UserAgent: string): Identity = {
      val __obj = js.Dynamic.literal(SourceIp = SourceIp.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      inline def setSourceIp(value: string): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: string): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostToConnectionRequest extends StObject {
    
    /**
      * The identifier of the connection that a specific client is using.
      */
    var ConnectionId: string
    
    /**
      * The data to be sent to the client specified by its connection id.
      */
    var Data: typings.awsSdk.clientsApigatewaymanagementapiMod.Data
  }
  object PostToConnectionRequest {
    
    inline def apply(ConnectionId: string, Data: Data): PostToConnectionRequest = {
      val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostToConnectionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostToConnectionRequest] (val x: Self) extends AnyVal {
      
      inline def setConnectionId(value: string): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
      
      inline def setData(value: Data): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    }
  }
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  
  type string = String
  
  type timestampIso8601 = js.Date
}
