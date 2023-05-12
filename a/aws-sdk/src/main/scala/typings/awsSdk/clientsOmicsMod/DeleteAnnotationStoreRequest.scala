package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnnotationStoreRequest extends StObject {
  
  /**
    * Whether to force deletion.
    */
  var force: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The store's name.
    */
  var name: String
}
object DeleteAnnotationStoreRequest {
  
  inline def apply(name: String): DeleteAnnotationStoreRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnnotationStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAnnotationStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setForce(value: PrimitiveBoolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
