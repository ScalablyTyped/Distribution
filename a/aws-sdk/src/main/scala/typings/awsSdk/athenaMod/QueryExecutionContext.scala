package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecutionContext extends StObject {
  
  /**
    * The name of the data catalog used in the query execution.
    */
  var Catalog: js.UndefOr[CatalogNameString] = js.native
  
  /**
    * The name of the database used in the query execution.
    */
  var Database: js.UndefOr[DatabaseString] = js.native
}
object QueryExecutionContext {
  
  @scala.inline
  def apply(): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionContext]
  }
  
  @scala.inline
  implicit class QueryExecutionContextMutableBuilder[Self <: QueryExecutionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: CatalogNameString): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "Catalog", js.undefined)
    
    @scala.inline
    def setDatabase(value: DatabaseString): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
