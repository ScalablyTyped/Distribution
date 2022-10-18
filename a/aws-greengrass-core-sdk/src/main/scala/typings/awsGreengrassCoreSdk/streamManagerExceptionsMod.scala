package typings.awsGreengrassCoreSdk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamManagerExceptionsMod {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ClientException")
  @js.native
  open class ClientException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ConnectFailedException")
  @js.native
  open class ConnectFailedException () extends ClientException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "InvalidRequestException")
  @js.native
  open class InvalidRequestException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "MessageStoreReadErrorException")
  @js.native
  open class MessageStoreReadErrorException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "NotEnoughMessagesException")
  @js.native
  open class NotEnoughMessagesException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "RequestPayloadTooLargeException")
  @js.native
  open class RequestPayloadTooLargeException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ResponsePayloadTooLargeException")
  @js.native
  open class ResponsePayloadTooLargeException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ServerOutOfMemoryException")
  @js.native
  open class ServerOutOfMemoryException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ServerTimeoutException")
  @js.native
  open class ServerTimeoutException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "StreamManagerException")
  @js.native
  open class StreamManagerException ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "UnauthorizedException")
  @js.native
  open class UnauthorizedException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "UnknownFailureException")
  @js.native
  open class UnknownFailureException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "UnknownOperationException")
  @js.native
  open class UnknownOperationException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "UpdateFailedException")
  @js.native
  open class UpdateFailedException () extends StreamManagerException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "UpdateNotAllowedException")
  @js.native
  open class UpdateNotAllowedException () extends InvalidRequestException
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/exceptions", "ValidationException")
  @js.native
  open class ValidationException () extends ClientException
}
