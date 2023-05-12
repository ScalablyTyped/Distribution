package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteListRequest extends StObject {
  
  /**
    *  The name of the list to delete. 
    */
  var name: noDashIdentifier
}
object DeleteListRequest {
  
  inline def apply(name: noDashIdentifier): DeleteListRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteListRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: noDashIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
