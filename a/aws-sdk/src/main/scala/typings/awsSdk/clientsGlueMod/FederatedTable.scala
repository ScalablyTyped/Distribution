package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedTable extends StObject {
  
  /**
    * The name of the connection to the external metastore.
    */
  var ConnectionName: js.UndefOr[NameString] = js.undefined
  
  /**
    * A unique identifier for the federated database.
    */
  var DatabaseIdentifier: js.UndefOr[FederationIdentifier] = js.undefined
  
  /**
    * A unique identifier for the federated table.
    */
  var Identifier: js.UndefOr[FederationIdentifier] = js.undefined
}
object FederatedTable {
  
  inline def apply(): FederatedTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedTable] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: NameString): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setDatabaseIdentifier(value: FederationIdentifier): Self = StObject.set(x, "DatabaseIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdentifierUndefined: Self = StObject.set(x, "DatabaseIdentifier", js.undefined)
    
    inline def setIdentifier(value: FederationIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
  }
}
