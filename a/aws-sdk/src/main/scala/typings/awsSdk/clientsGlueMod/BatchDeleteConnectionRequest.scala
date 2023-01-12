package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connections reside. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A list of names of the connections to delete.
    */
  var ConnectionNameList: DeleteConnectionNameList
}
object BatchDeleteConnectionRequest {
  
  inline def apply(ConnectionNameList: DeleteConnectionNameList): BatchDeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionNameList = ConnectionNameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setConnectionNameList(value: DeleteConnectionNameList): Self = StObject.set(x, "ConnectionNameList", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameListVarargs(value: NameString*): Self = StObject.set(x, "ConnectionNameList", js.Array(value*))
  }
}
