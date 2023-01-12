package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectorRequest extends StObject {
  
  /**
    * The reference ID of the Fleet Advisor collector to delete.
    */
  var CollectorReferencedId: String
}
object DeleteCollectorRequest {
  
  inline def apply(CollectorReferencedId: String): DeleteCollectorRequest = {
    val __obj = js.Dynamic.literal(CollectorReferencedId = CollectorReferencedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollectorRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectorReferencedId(value: String): Self = StObject.set(x, "CollectorReferencedId", value.asInstanceOf[js.Any])
  }
}
