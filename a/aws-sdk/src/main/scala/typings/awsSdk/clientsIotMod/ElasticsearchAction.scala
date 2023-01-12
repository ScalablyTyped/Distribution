package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchAction extends StObject {
  
  /**
    * The endpoint of your OpenSearch domain.
    */
  var endpoint: ElasticsearchEndpoint
  
  /**
    * The unique identifier for the document you are storing.
    */
  var id: ElasticsearchId
  
  /**
    * The index where you want to store your data.
    */
  var index: ElasticsearchIndex
  
  /**
    * The IAM role ARN that has access to OpenSearch.
    */
  var roleArn: AwsArn
  
  /**
    * The type of document you are storing.
    */
  var `type`: ElasticsearchType
}
object ElasticsearchAction {
  
  inline def apply(
    endpoint: ElasticsearchEndpoint,
    id: ElasticsearchId,
    index: ElasticsearchIndex,
    roleArn: AwsArn,
    `type`: ElasticsearchType
  ): ElasticsearchAction = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticsearchAction] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: ElasticsearchEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setId(value: ElasticsearchId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: ElasticsearchIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: ElasticsearchType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
