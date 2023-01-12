package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreFilter extends StObject {
  
  /**
    * A filter that allows the user to set cutoff dates for records. All Data Stores created after the specified date will be included in the results.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that allows the user to set cutoff dates for records. All Data Stores created before the specified date will be included in the results. 
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Allows the user to filter Data Store results by name.
    */
  var DatastoreName: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreName] = js.undefined
  
  /**
    * Allows the user to filter Data Store results by status.
    */
  var DatastoreStatus: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreStatus] = js.undefined
}
object DatastoreFilter {
  
  inline def apply(): DatastoreFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatastoreFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "DatastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreNameUndefined: Self = StObject.set(x, "DatastoreName", js.undefined)
    
    inline def setDatastoreStatus(value: DatastoreStatus): Self = StObject.set(x, "DatastoreStatus", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStatusUndefined: Self = StObject.set(x, "DatastoreStatus", js.undefined)
  }
}
