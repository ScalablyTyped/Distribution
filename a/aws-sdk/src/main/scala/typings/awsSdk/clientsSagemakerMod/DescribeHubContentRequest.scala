package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHubContentRequest extends StObject {
  
  /**
    * The name of the content to describe.
    */
  var HubContentName: typings.awsSdk.clientsSagemakerMod.HubContentName
  
  /**
    * The type of content in the hub.
    */
  var HubContentType: typings.awsSdk.clientsSagemakerMod.HubContentType
  
  /**
    * The version of the content to describe.
    */
  var HubContentVersion: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentVersion] = js.undefined
  
  /**
    * The name of the hub that contains the content to describe.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
}
object DescribeHubContentRequest {
  
  inline def apply(HubContentName: HubContentName, HubContentType: HubContentType, HubName: HubName): DescribeHubContentRequest = {
    val __obj = js.Dynamic.literal(HubContentName = HubContentName.asInstanceOf[js.Any], HubContentType = HubContentType.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHubContentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHubContentRequest] (val x: Self) extends AnyVal {
    
    inline def setHubContentName(value: HubContentName): Self = StObject.set(x, "HubContentName", value.asInstanceOf[js.Any])
    
    inline def setHubContentType(value: HubContentType): Self = StObject.set(x, "HubContentType", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersion(value: HubContentVersion): Self = StObject.set(x, "HubContentVersion", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersionUndefined: Self = StObject.set(x, "HubContentVersion", js.undefined)
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
  }
}
