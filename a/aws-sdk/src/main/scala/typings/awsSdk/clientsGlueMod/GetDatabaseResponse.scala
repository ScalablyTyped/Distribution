package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabaseResponse extends StObject {
  
  /**
    * The definition of the specified database in the Data Catalog.
    */
  var Database: js.UndefOr[typings.awsSdk.clientsGlueMod.Database] = js.undefined
}
object GetDatabaseResponse {
  
  inline def apply(): GetDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseResponse]
  }
  
  extension [Self <: GetDatabaseResponse](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
