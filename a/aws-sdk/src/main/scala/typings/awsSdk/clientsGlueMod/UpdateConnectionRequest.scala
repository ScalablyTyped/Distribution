package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A ConnectionInput object that redefines the connection in question.
    */
  var ConnectionInput: typings.awsSdk.clientsGlueMod.ConnectionInput
  
  /**
    * The name of the connection definition to update.
    */
  var Name: NameString
}
object UpdateConnectionRequest {
  
  inline def apply(ConnectionInput: ConnectionInput, Name: NameString): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
  
  extension [Self <: UpdateConnectionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setConnectionInput(value: ConnectionInput): Self = StObject.set(x, "ConnectionInput", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
