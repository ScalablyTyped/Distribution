package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiGatewayApiAsset extends StObject {
  
  /**
    * The API description of the API asset.
    */
  var ApiDescription: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ApiDescription] = js.undefined
  
  /**
    * The API endpoint of the API asset.
    */
  var ApiEndpoint: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier of the API asset.
    */
  var ApiId: js.UndefOr[string] = js.undefined
  
  /**
    * The API key of the API asset.
    */
  var ApiKey: js.UndefOr[string] = js.undefined
  
  /**
    * The API name of the API asset.
    */
  var ApiName: js.UndefOr[string] = js.undefined
  
  /**
    * The download URL of the API specification of the API asset.
    */
  var ApiSpecificationDownloadUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time that the upload URL expires, in ISO 8601 format.
    */
  var ApiSpecificationDownloadUrlExpiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The protocol type of the API asset.
    */
  var ProtocolType: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ProtocolType] = js.undefined
  
  /**
    * The stage of the API asset.
    */
  var Stage: js.UndefOr[string] = js.undefined
}
object ApiGatewayApiAsset {
  
  inline def apply(): ApiGatewayApiAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGatewayApiAsset]
  }
  
  extension [Self <: ApiGatewayApiAsset](x: Self) {
    
    inline def setApiDescription(value: ApiDescription): Self = StObject.set(x, "ApiDescription", value.asInstanceOf[js.Any])
    
    inline def setApiDescriptionUndefined: Self = StObject.set(x, "ApiDescription", js.undefined)
    
    inline def setApiEndpoint(value: string): Self = StObject.set(x, "ApiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApiEndpointUndefined: Self = StObject.set(x, "ApiEndpoint", js.undefined)
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "ApiId", js.undefined)
    
    inline def setApiKey(value: string): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "ApiKey", js.undefined)
    
    inline def setApiName(value: string): Self = StObject.set(x, "ApiName", value.asInstanceOf[js.Any])
    
    inline def setApiNameUndefined: Self = StObject.set(x, "ApiName", js.undefined)
    
    inline def setApiSpecificationDownloadUrl(value: string): Self = StObject.set(x, "ApiSpecificationDownloadUrl", value.asInstanceOf[js.Any])
    
    inline def setApiSpecificationDownloadUrlExpiresAt(value: js.Date): Self = StObject.set(x, "ApiSpecificationDownloadUrlExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setApiSpecificationDownloadUrlExpiresAtUndefined: Self = StObject.set(x, "ApiSpecificationDownloadUrlExpiresAt", js.undefined)
    
    inline def setApiSpecificationDownloadUrlUndefined: Self = StObject.set(x, "ApiSpecificationDownloadUrl", js.undefined)
    
    inline def setProtocolType(value: ProtocolType): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    inline def setProtocolTypeUndefined: Self = StObject.set(x, "ProtocolType", js.undefined)
    
    inline def setStage(value: string): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
