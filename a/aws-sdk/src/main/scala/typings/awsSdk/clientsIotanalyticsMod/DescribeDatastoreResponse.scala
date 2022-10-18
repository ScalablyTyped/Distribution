package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatastoreResponse extends StObject {
  
  /**
    * Information about the data store.
    */
  var datastore: js.UndefOr[Datastore] = js.undefined
  
  /**
    * Additional statistical information about the data store. Included if the includeStatistics parameter is set to true in the request.
    */
  var statistics: js.UndefOr[DatastoreStatistics] = js.undefined
}
object DescribeDatastoreResponse {
  
  inline def apply(): DescribeDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatastoreResponse]
  }
  
  extension [Self <: DescribeDatastoreResponse](x: Self) {
    
    inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
    
    inline def setStatistics(value: DatastoreStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
