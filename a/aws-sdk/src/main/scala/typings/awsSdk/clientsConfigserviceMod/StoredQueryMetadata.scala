package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredQueryMetadata extends StObject {
  
  /**
    * A unique description for the query.
    */
  var Description: js.UndefOr[QueryDescription] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the query. For example, arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
    */
  var QueryArn: typings.awsSdk.clientsConfigserviceMod.QueryArn
  
  /**
    * The ID of the query. 
    */
  var QueryId: typings.awsSdk.clientsConfigserviceMod.QueryId
  
  /**
    * The name of the query.
    */
  var QueryName: typings.awsSdk.clientsConfigserviceMod.QueryName
}
object StoredQueryMetadata {
  
  inline def apply(QueryArn: QueryArn, QueryId: QueryId, QueryName: QueryName): StoredQueryMetadata = {
    val __obj = js.Dynamic.literal(QueryArn = QueryArn.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any], QueryName = QueryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredQueryMetadata]
  }
  
  extension [Self <: StoredQueryMetadata](x: Self) {
    
    inline def setDescription(value: QueryDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setQueryArn(value: QueryArn): Self = StObject.set(x, "QueryArn", value.asInstanceOf[js.Any])
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryName(value: QueryName): Self = StObject.set(x, "QueryName", value.asInstanceOf[js.Any])
  }
}
