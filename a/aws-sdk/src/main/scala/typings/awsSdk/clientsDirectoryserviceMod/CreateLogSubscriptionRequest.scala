package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLogSubscriptionRequest extends StObject {
  
  /**
    * Identifier of the directory to which you want to subscribe and receive real-time logs to your specified CloudWatch log group.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
    */
  var LogGroupName: typings.awsSdk.clientsDirectoryserviceMod.LogGroupName
}
object CreateLogSubscriptionRequest {
  
  inline def apply(DirectoryId: DirectoryId, LogGroupName: LogGroupName): CreateLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], LogGroupName = LogGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogSubscriptionRequest]
  }
  
  extension [Self <: CreateLogSubscriptionRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
  }
}
