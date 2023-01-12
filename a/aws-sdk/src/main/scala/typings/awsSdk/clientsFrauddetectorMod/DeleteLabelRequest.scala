package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLabelRequest extends StObject {
  
  /**
    * The name of the label to delete.
    */
  var name: identifier
}
object DeleteLabelRequest {
  
  inline def apply(name: identifier): DeleteLabelRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLabelRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
