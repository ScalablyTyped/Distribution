package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessorInput extends StObject {
  
  /**
    * The unique identifier of the accessor.
    */
  var AccessorId: ResourceIdString
}
object GetAccessorInput {
  
  inline def apply(AccessorId: ResourceIdString): GetAccessorInput = {
    val __obj = js.Dynamic.literal(AccessorId = AccessorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessorInput]
  }
  
  extension [Self <: GetAccessorInput](x: Self) {
    
    inline def setAccessorId(value: ResourceIdString): Self = StObject.set(x, "AccessorId", value.asInstanceOf[js.Any])
  }
}
