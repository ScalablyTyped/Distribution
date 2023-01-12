package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceError extends StObject {
  
  /**
    *  This is the identifier of the resource. 
    */
  var logicalResourceId: js.UndefOr[String255] = js.undefined
  
  /**
    *  This is the identifier of the physical resource. 
    */
  var physicalResourceId: js.UndefOr[String255] = js.undefined
  
  /**
    *  This is the error message. 
    */
  var reason: js.UndefOr[ErrorMessage] = js.undefined
}
object ResourceError {
  
  inline def apply(): ResourceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceError] (val x: Self) extends AnyVal {
    
    inline def setLogicalResourceId(value: String255): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "logicalResourceId", js.undefined)
    
    inline def setPhysicalResourceId(value: String255): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "physicalResourceId", js.undefined)
    
    inline def setReason(value: ErrorMessage): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
