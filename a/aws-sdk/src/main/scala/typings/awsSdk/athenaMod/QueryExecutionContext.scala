package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecutionContext extends js.Object {
  
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
  implicit class QueryExecutionContextOps[Self <: QueryExecutionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalog(value: CatalogNameString): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalog: Self = this.set("Catalog", js.undefined)
    
    @scala.inline
    def setDatabase(value: DatabaseString): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
  }
}
