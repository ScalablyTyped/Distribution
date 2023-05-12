package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetFromApiGatewayApiRequestDetails extends StObject {
  
  /**
    * The API description. Markdown supported.
    */
  var ApiDescription: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ApiDescription] = js.undefined
  
  /**
    * The API Gateway API ID.
    */
  var ApiId: _String
  
  /**
    * The API Gateway API key.
    */
  var ApiKey: js.UndefOr[_String] = js.undefined
  
  /**
    * The API name.
    */
  var ApiName: _String
  
  /**
    * The Base64-encoded MD5 hash of the OpenAPI 3.0 JSON API specification file. It is used to ensure the integrity of the file.
    */
  var ApiSpecificationMd5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
  
  /**
    * The data set ID.
    */
  var DataSetId: Id
  
  /**
    * The protocol type.
    */
  var ProtocolType: typings.awsSdk.clientsDataexchangeMod.ProtocolType
  
  /**
    * The revision ID.
    */
  var RevisionId: Id
  
  /**
    * The API stage.
    */
  var Stage: _String
}
object ImportAssetFromApiGatewayApiRequestDetails {
  
  inline def apply(
    ApiId: _String,
    ApiName: _String,
    ApiSpecificationMd5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
    DataSetId: Id,
    ProtocolType: ProtocolType,
    RevisionId: Id,
    Stage: _String
  ): ImportAssetFromApiGatewayApiRequestDetails = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ApiName = ApiName.asInstanceOf[js.Any], ApiSpecificationMd5Hash = ApiSpecificationMd5Hash.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ProtocolType = ProtocolType.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromApiGatewayApiRequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetFromApiGatewayApiRequestDetails] (val x: Self) extends AnyVal {
    
    inline def setApiDescription(value: ApiDescription): Self = StObject.set(x, "ApiDescription", value.asInstanceOf[js.Any])
    
    inline def setApiDescriptionUndefined: Self = StObject.set(x, "ApiDescription", js.undefined)
    
    inline def setApiId(value: _String): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiKey(value: _String): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "ApiKey", js.undefined)
    
    inline def setApiName(value: _String): Self = StObject.set(x, "ApiName", value.asInstanceOf[js.Any])
    
    inline def setApiSpecificationMd5Hash(value: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093): Self = StObject.set(x, "ApiSpecificationMd5Hash", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setProtocolType(value: ProtocolType): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setStage(value: _String): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
  }
}
