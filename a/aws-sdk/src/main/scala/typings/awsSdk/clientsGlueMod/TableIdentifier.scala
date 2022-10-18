package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableIdentifier extends StObject {
  
  /**
    * The ID of the Data Catalog in which the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database that contains the target table.
    */
  var DatabaseName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the target table.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object TableIdentifier {
  
  inline def apply(): TableIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableIdentifier]
  }
  
  extension [Self <: TableIdentifier](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
