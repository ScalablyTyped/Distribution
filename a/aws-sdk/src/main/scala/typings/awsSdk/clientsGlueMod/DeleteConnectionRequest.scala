package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the connection to delete.
    */
  var ConnectionName: NameString
}
object DeleteConnectionRequest {
  
  inline def apply(ConnectionName: NameString): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
  
  extension [Self <: DeleteConnectionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setConnectionName(value: NameString): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
  }
}
