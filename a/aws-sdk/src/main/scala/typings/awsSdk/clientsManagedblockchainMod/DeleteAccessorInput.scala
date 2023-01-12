package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessorInput extends StObject {
  
  /**
    * The unique identifier of the accessor.
    */
  var AccessorId: ResourceIdString
}
object DeleteAccessorInput {
  
  inline def apply(AccessorId: ResourceIdString): DeleteAccessorInput = {
    val __obj = js.Dynamic.literal(AccessorId = AccessorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccessorInput] (val x: Self) extends AnyVal {
    
    inline def setAccessorId(value: ResourceIdString): Self = StObject.set(x, "AccessorId", value.asInstanceOf[js.Any])
  }
}
