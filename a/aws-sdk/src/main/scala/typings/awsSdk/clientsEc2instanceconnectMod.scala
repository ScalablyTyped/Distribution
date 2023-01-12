package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsEc2instanceconnectMod {
  
  @JSImport("aws-sdk/clients/ec2instanceconnect", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends EC2InstanceConnect {
    def this(options: ClientConfiguration) = this()
  }
  
  type AvailabilityZone = String
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.apiVersion] = js.undefined
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
  
  @js.native
  trait EC2InstanceConnect extends Service {
    
    @JSName("config")
    var config_EC2InstanceConnect: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Pushes an SSH public key to the specified EC2 instance for use by the specified user. The key remains for 60 seconds. For more information, see Connect to your Linux instance using EC2 Instance Connect in the Amazon EC2 User Guide.
      */
    def sendSSHPublicKey(): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    def sendSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    /**
      * Pushes an SSH public key to the specified EC2 instance for use by the specified user. The key remains for 60 seconds. For more information, see Connect to your Linux instance using EC2 Instance Connect in the Amazon EC2 User Guide.
      */
    def sendSSHPublicKey(params: SendSSHPublicKeyRequest): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    def sendSSHPublicKey(
      params: SendSSHPublicKeyRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]
    ): Request[SendSSHPublicKeyResponse, AWSError] = js.native
    
    /**
      * Pushes an SSH public key to the specified EC2 instance. The key remains for 60 seconds, which gives you 60 seconds to establish a serial console connection to the instance using SSH. For more information, see EC2 Serial Console in the Amazon EC2 User Guide.
      */
    def sendSerialConsoleSSHPublicKey(): Request[SendSerialConsoleSSHPublicKeyResponse, AWSError] = js.native
    def sendSerialConsoleSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ SendSerialConsoleSSHPublicKeyResponse, Unit]): Request[SendSerialConsoleSSHPublicKeyResponse, AWSError] = js.native
    /**
      * Pushes an SSH public key to the specified EC2 instance. The key remains for 60 seconds, which gives you 60 seconds to establish a serial console connection to the instance using SSH. For more information, see EC2 Serial Console in the Amazon EC2 User Guide.
      */
    def sendSerialConsoleSSHPublicKey(params: SendSerialConsoleSSHPublicKeyRequest): Request[SendSerialConsoleSSHPublicKeyResponse, AWSError] = js.native
    def sendSerialConsoleSSHPublicKey(
      params: SendSerialConsoleSSHPublicKeyRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ SendSerialConsoleSSHPublicKeyResponse, Unit]
    ): Request[SendSerialConsoleSSHPublicKeyResponse, AWSError] = js.native
  }
  
  type InstanceId = String
  
  type InstanceOSUser = String
  
  type RequestId = String
  
  type SSHPublicKey = String
  
  trait SendSSHPublicKeyRequest extends StObject {
    
    /**
      * The Availability Zone in which the EC2 instance was launched.
      */
    var AvailabilityZone: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.AvailabilityZone] = js.undefined
    
    /**
      * The ID of the EC2 instance.
      */
    var InstanceId: typings.awsSdk.clientsEc2instanceconnectMod.InstanceId
    
    /**
      * The OS user on the EC2 instance for whom the key can be used to authenticate.
      */
    var InstanceOSUser: typings.awsSdk.clientsEc2instanceconnectMod.InstanceOSUser
    
    /**
      * The public key material. To use the public key, you must have the matching private key.
      */
    var SSHPublicKey: typings.awsSdk.clientsEc2instanceconnectMod.SSHPublicKey
  }
  object SendSSHPublicKeyRequest {
    
    inline def apply(InstanceId: InstanceId, InstanceOSUser: InstanceOSUser, SSHPublicKey: SSHPublicKey): SendSSHPublicKeyRequest = {
      val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], InstanceOSUser = InstanceOSUser.asInstanceOf[js.Any], SSHPublicKey = SSHPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendSSHPublicKeyRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendSSHPublicKeyRequest] (val x: Self) extends AnyVal {
      
      inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
      
      inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceOSUser(value: InstanceOSUser): Self = StObject.set(x, "InstanceOSUser", value.asInstanceOf[js.Any])
      
      inline def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendSSHPublicKeyResponse extends StObject {
    
    /**
      * The ID of the request. Please provide this ID when contacting AWS Support for assistance.
      */
    var RequestId: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.RequestId] = js.undefined
    
    /**
      * Is true if the request succeeds and an error otherwise.
      */
    var Success: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.Success] = js.undefined
  }
  object SendSSHPublicKeyResponse {
    
    inline def apply(): SendSSHPublicKeyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendSSHPublicKeyResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendSSHPublicKeyResponse] (val x: Self) extends AnyVal {
      
      inline def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    }
  }
  
  trait SendSerialConsoleSSHPublicKeyRequest extends StObject {
    
    /**
      * The ID of the EC2 instance.
      */
    var InstanceId: typings.awsSdk.clientsEc2instanceconnectMod.InstanceId
    
    /**
      * The public key material. To use the public key, you must have the matching private key. For information about the supported key formats and lengths, see Requirements for key pairs in the Amazon EC2 User Guide.
      */
    var SSHPublicKey: typings.awsSdk.clientsEc2instanceconnectMod.SSHPublicKey
    
    /**
      * The serial port of the EC2 instance. Currently only port 0 is supported. Default: 0
      */
    var SerialPort: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.SerialPort] = js.undefined
  }
  object SendSerialConsoleSSHPublicKeyRequest {
    
    inline def apply(InstanceId: InstanceId, SSHPublicKey: SSHPublicKey): SendSerialConsoleSSHPublicKeyRequest = {
      val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SSHPublicKey = SSHPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendSerialConsoleSSHPublicKeyRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendSerialConsoleSSHPublicKeyRequest] (val x: Self) extends AnyVal {
      
      inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
      
      inline def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
      
      inline def setSerialPort(value: SerialPort): Self = StObject.set(x, "SerialPort", value.asInstanceOf[js.Any])
      
      inline def setSerialPortUndefined: Self = StObject.set(x, "SerialPort", js.undefined)
    }
  }
  
  trait SendSerialConsoleSSHPublicKeyResponse extends StObject {
    
    /**
      * The ID of the request. Please provide this ID when contacting AWS Support for assistance.
      */
    var RequestId: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.RequestId] = js.undefined
    
    /**
      * Is true if the request succeeds and an error otherwise.
      */
    var Success: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.Success] = js.undefined
  }
  object SendSerialConsoleSSHPublicKeyResponse {
    
    inline def apply(): SendSerialConsoleSSHPublicKeyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendSerialConsoleSSHPublicKeyResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendSerialConsoleSSHPublicKeyResponse] (val x: Self) extends AnyVal {
      
      inline def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    }
  }
  
  type SerialPort = Double
  
  type Success = Boolean
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-04-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
