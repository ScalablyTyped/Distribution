package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryRequest extends StObject {
  
  /**
    *  The URI for the S3 bucket where CloudTrail delivers the query results. 
    */
  var DeliveryS3Uri: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.DeliveryS3Uri] = js.undefined
  
  /**
    * The SQL code of your query.
    */
  var QueryStatement: typings.awsSdk.clientsCloudtrailMod.QueryStatement
}
object StartQueryRequest {
  
  inline def apply(QueryStatement: QueryStatement): StartQueryRequest = {
    val __obj = js.Dynamic.literal(QueryStatement = QueryStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryRequest]
  }
  
  extension [Self <: StartQueryRequest](x: Self) {
    
    inline def setDeliveryS3Uri(value: DeliveryS3Uri): Self = StObject.set(x, "DeliveryS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3UriUndefined: Self = StObject.set(x, "DeliveryS3Uri", js.undefined)
    
    inline def setQueryStatement(value: QueryStatement): Self = StObject.set(x, "QueryStatement", value.asInstanceOf[js.Any])
  }
}
