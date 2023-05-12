package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHubContentRequest extends StObject {
  
  /**
    * The name of the content that you want to delete from a hub.
    */
  var HubContentName: typings.awsSdk.clientsSagemakerMod.HubContentName
  
  /**
    * The type of content that you want to delete from a hub.
    */
  var HubContentType: typings.awsSdk.clientsSagemakerMod.HubContentType
  
  /**
    * The version of the content that you want to delete from a hub.
    */
  var HubContentVersion: typings.awsSdk.clientsSagemakerMod.HubContentVersion
  
  /**
    * The name of the hub that you want to delete content in.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
}
object DeleteHubContentRequest {
  
  inline def apply(
    HubContentName: HubContentName,
    HubContentType: HubContentType,
    HubContentVersion: HubContentVersion,
    HubName: HubName
  ): DeleteHubContentRequest = {
    val __obj = js.Dynamic.literal(HubContentName = HubContentName.asInstanceOf[js.Any], HubContentType = HubContentType.asInstanceOf[js.Any], HubContentVersion = HubContentVersion.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHubContentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHubContentRequest] (val x: Self) extends AnyVal {
    
    inline def setHubContentName(value: HubContentName): Self = StObject.set(x, "HubContentName", value.asInstanceOf[js.Any])
    
    inline def setHubContentType(value: HubContentType): Self = StObject.set(x, "HubContentType", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersion(value: HubContentVersion): Self = StObject.set(x, "HubContentVersion", value.asInstanceOf[js.Any])
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
  }
}
