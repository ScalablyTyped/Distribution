package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkResourceMetadataResponse extends StObject {
  
  /**
    * The updated resource metadata.
    */
  var Metadata: js.UndefOr[NetworkResourceMetadataMap] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ResourceArn] = js.undefined
}
object UpdateNetworkResourceMetadataResponse {
  
  inline def apply(): UpdateNetworkResourceMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNetworkResourceMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNetworkResourceMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: NetworkResourceMetadataMap): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
