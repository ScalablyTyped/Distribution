package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlQueryDatasetAction extends StObject {
  
  /**
    * Prefilters applied to message data.
    */
  var filters: js.UndefOr[QueryFilters] = js.undefined
  
  /**
    * A SQL query string.
    */
  var sqlQuery: SqlQuery
}
object SqlQueryDatasetAction {
  
  inline def apply(sqlQuery: SqlQuery): SqlQueryDatasetAction = {
    val __obj = js.Dynamic.literal(sqlQuery = sqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQueryDatasetAction]
  }
  
  extension [Self <: SqlQueryDatasetAction](x: Self) {
    
    inline def setFilters(value: QueryFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setSqlQuery(value: SqlQuery): Self = StObject.set(x, "sqlQuery", value.asInstanceOf[js.Any])
  }
}
