package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredQuery extends StObject {
  
  /**
    * A unique description for the query.
    */
  var Description: js.UndefOr[QueryDescription] = js.undefined
  
  /**
    * The expression of the query. For example, SELECT resourceId, resourceType, supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType = 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'. 
    */
  var Expression: js.UndefOr[QueryExpression] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the query. For example, arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
    */
  var QueryArn: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.QueryArn] = js.undefined
  
  /**
    * The ID of the query.
    */
  var QueryId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.QueryId] = js.undefined
  
  /**
    * The name of the query.
    */
  var QueryName: typings.awsSdk.clientsConfigserviceMod.QueryName
}
object StoredQuery {
  
  inline def apply(QueryName: QueryName): StoredQuery = {
    val __obj = js.Dynamic.literal(QueryName = QueryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoredQuery] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: QueryDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpression(value: QueryExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setQueryArn(value: QueryArn): Self = StObject.set(x, "QueryArn", value.asInstanceOf[js.Any])
    
    inline def setQueryArnUndefined: Self = StObject.set(x, "QueryArn", js.undefined)
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "QueryId", js.undefined)
    
    inline def setQueryName(value: QueryName): Self = StObject.set(x, "QueryName", value.asInstanceOf[js.Any])
  }
}
