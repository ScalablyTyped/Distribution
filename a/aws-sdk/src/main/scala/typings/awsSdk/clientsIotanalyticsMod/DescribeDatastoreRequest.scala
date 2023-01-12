package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatastoreRequest extends StObject {
  
  /**
    * The name of the data store
    */
  var datastoreName: DatastoreName
  
  /**
    * If true, additional statistical information about the data store is included in the response. This feature can't be used with a data store whose S3 storage is customer-managed.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
}
object DescribeDatastoreRequest {
  
  inline def apply(datastoreName: DatastoreName): DescribeDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatastoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDatastoreRequest] (val x: Self) extends AnyVal {
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setIncludeStatistics(value: IncludeStatisticsFlag): Self = StObject.set(x, "includeStatistics", value.asInstanceOf[js.Any])
    
    inline def setIncludeStatisticsUndefined: Self = StObject.set(x, "includeStatistics", js.undefined)
  }
}
