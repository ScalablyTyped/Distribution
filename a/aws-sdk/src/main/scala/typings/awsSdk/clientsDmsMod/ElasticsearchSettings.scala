package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchSettings extends StObject {
  
  /**
    * The endpoint for the OpenSearch cluster. DMS uses HTTPS if a transport protocol (http/https) is not specified.
    */
  var EndpointUri: String
  
  /**
    * The maximum number of seconds for which DMS retries failed API requests to the OpenSearch cluster.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The maximum percentage of records that can fail to be written before a full load operation stops. To avoid early failure, this counter is only effective after 1000 records are transferred. OpenSearch also has the concept of error monitoring during the last 10 minutes of an Observation Window. If transfer of all records fail in the last 10 minutes, the full load operation stops. 
    */
  var FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) used by the service to access the IAM role. The role must allow the iam:PassRole action.
    */
  var ServiceAccessRoleArn: String
  
  /**
    * Set this option to true for DMS to migrate documentation using the documentation type _doc. OpenSearch and an Elasticsearch cluster only support the _doc documentation type in versions 7. x and later. The default value is false.
    */
  var UseNewMappingType: js.UndefOr[BooleanOptional] = js.undefined
}
object ElasticsearchSettings {
  
  inline def apply(EndpointUri: String, ServiceAccessRoleArn: String): ElasticsearchSettings = {
    val __obj = js.Dynamic.literal(EndpointUri = EndpointUri.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticsearchSettings] (val x: Self) extends AnyVal {
    
    inline def setEndpointUri(value: String): Self = StObject.set(x, "EndpointUri", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryDuration(value: IntegerOptional): Self = StObject.set(x, "ErrorRetryDuration", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryDurationUndefined: Self = StObject.set(x, "ErrorRetryDuration", js.undefined)
    
    inline def setFullLoadErrorPercentage(value: IntegerOptional): Self = StObject.set(x, "FullLoadErrorPercentage", value.asInstanceOf[js.Any])
    
    inline def setFullLoadErrorPercentageUndefined: Self = StObject.set(x, "FullLoadErrorPercentage", js.undefined)
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setUseNewMappingType(value: BooleanOptional): Self = StObject.set(x, "UseNewMappingType", value.asInstanceOf[js.Any])
    
    inline def setUseNewMappingTypeUndefined: Self = StObject.set(x, "UseNewMappingType", js.undefined)
  }
}
