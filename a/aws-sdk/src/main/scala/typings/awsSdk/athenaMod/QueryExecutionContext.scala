package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecutionContext extends StObject {
  
  /**
    * The name of the data catalog used in the query execution.
    */
  var Catalog: js.UndefOr[CatalogNameString] = js.undefined
  
  /**
    * The name of the database used in the query execution.
    */
  var Database: js.UndefOr[DatabaseString] = js.undefined
}
object QueryExecutionContext {
  
  inline def apply(): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionContext]
  }
  
  extension [Self <: QueryExecutionContext](x: Self) {
    
    inline def setCatalog(value: CatalogNameString): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "Catalog", js.undefined)
    
    inline def setDatabase(value: DatabaseString): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
