package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFieldProperties extends StObject {
  
  /**
    *  Indicates if the field can be queried. 
    */
  var isQueryable: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates whether the field can be returned in a search result. 
    */
  var isRetrievable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if this timestamp field can be used for incremental queries.
    */
  var isTimestampFieldForIncrementalQueries: js.UndefOr[Boolean] = js.undefined
}
object SourceFieldProperties {
  
  inline def apply(): SourceFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceFieldProperties]
  }
  
  extension [Self <: SourceFieldProperties](x: Self) {
    
    inline def setIsQueryable(value: Boolean): Self = StObject.set(x, "isQueryable", value.asInstanceOf[js.Any])
    
    inline def setIsQueryableUndefined: Self = StObject.set(x, "isQueryable", js.undefined)
    
    inline def setIsRetrievable(value: Boolean): Self = StObject.set(x, "isRetrievable", value.asInstanceOf[js.Any])
    
    inline def setIsRetrievableUndefined: Self = StObject.set(x, "isRetrievable", js.undefined)
    
    inline def setIsTimestampFieldForIncrementalQueries(value: Boolean): Self = StObject.set(x, "isTimestampFieldForIncrementalQueries", value.asInstanceOf[js.Any])
    
    inline def setIsTimestampFieldForIncrementalQueriesUndefined: Self = StObject.set(x, "isTimestampFieldForIncrementalQueries", js.undefined)
  }
}
