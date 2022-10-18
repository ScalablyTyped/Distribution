package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatastoreRequest extends StObject {
  
  /**
    * The name of the data store to delete.
    */
  var datastoreName: DatastoreName
}
object DeleteDatastoreRequest {
  
  inline def apply(datastoreName: DatastoreName): DeleteDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatastoreRequest]
  }
  
  extension [Self <: DeleteDatastoreRequest](x: Self) {
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
  }
}
