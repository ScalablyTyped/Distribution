package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIndexRequest extends StObject {
  
  /**
    * The identifier of the index you want to delete.
    */
  var Id: IndexId
}
object DeleteIndexRequest {
  
  inline def apply(Id: IndexId): DeleteIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
