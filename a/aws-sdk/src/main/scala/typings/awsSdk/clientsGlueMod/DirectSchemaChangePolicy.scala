package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectSchemaChangePolicy extends StObject {
  
  /**
    * Specifies the database that the schema change policy applies to.
    */
  var Database: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Whether to use the specified update behavior when the crawler finds a changed schema.
    */
  var EnableUpdateCatalog: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specifies the table in the database that the schema change policy applies to.
    */
  var Table: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The update behavior when the crawler finds a changed schema.
    */
  var UpdateBehavior: js.UndefOr[UpdateCatalogBehavior] = js.undefined
}
object DirectSchemaChangePolicy {
  
  inline def apply(): DirectSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectSchemaChangePolicy]
  }
  
  extension [Self <: DirectSchemaChangePolicy](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setEnableUpdateCatalog(value: BoxedBoolean): Self = StObject.set(x, "EnableUpdateCatalog", value.asInstanceOf[js.Any])
    
    inline def setEnableUpdateCatalogUndefined: Self = StObject.set(x, "EnableUpdateCatalog", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    inline def setUpdateBehavior(value: UpdateCatalogBehavior): Self = StObject.set(x, "UpdateBehavior", value.asInstanceOf[js.Any])
    
    inline def setUpdateBehaviorUndefined: Self = StObject.set(x, "UpdateBehavior", js.undefined)
  }
}
