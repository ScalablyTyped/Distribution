package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecutionContext extends StObject {
  
  /**
    * The name of the data catalog used in the query execution.
    */
  var Catalog: js.UndefOr[CatalogNameString] = js.undefined
  
  /**
    * The name of the database used in the query execution. The database must exist in the catalog.
    */
  var Database: js.UndefOr[DatabaseString] = js.undefined
}
object QueryExecutionContext {
  
  inline def apply(): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryExecutionContext] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: CatalogNameString): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "Catalog", js.undefined)
    
    inline def setDatabase(value: DatabaseString): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
