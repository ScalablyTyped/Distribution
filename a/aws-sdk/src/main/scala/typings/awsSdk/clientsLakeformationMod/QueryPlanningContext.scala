package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPlanningContext extends StObject {
  
  /**
    * The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The database containing the table.
    */
  var DatabaseName: QueryPlanningContextDatabaseNameString
  
  /**
    * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with TransactionId.
    */
  var QueryAsOfTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A map consisting of key-value pairs.
    */
  var QueryParameters: js.UndefOr[QueryParameterMap] = js.undefined
  
  /**
    * The transaction ID at which to read the table contents. If this transaction is not committed, the read will be treated as part of that transaction and will see its writes. If this transaction has aborted, an error will be returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with QueryAsOfTime.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object QueryPlanningContext {
  
  inline def apply(DatabaseName: QueryPlanningContextDatabaseNameString): QueryPlanningContext = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPlanningContext]
  }
  
  extension [Self <: QueryPlanningContext](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: QueryPlanningContextDatabaseNameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setQueryAsOfTime(value: js.Date): Self = StObject.set(x, "QueryAsOfTime", value.asInstanceOf[js.Any])
    
    inline def setQueryAsOfTimeUndefined: Self = StObject.set(x, "QueryAsOfTime", js.undefined)
    
    inline def setQueryParameters(value: QueryParameterMap): Self = StObject.set(x, "QueryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "QueryParameters", js.undefined)
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
