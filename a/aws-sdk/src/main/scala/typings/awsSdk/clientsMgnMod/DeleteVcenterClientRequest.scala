package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVcenterClientRequest extends StObject {
  
  /**
    * ID of resource to be deleted.
    */
  var vcenterClientID: VcenterClientID
}
object DeleteVcenterClientRequest {
  
  inline def apply(vcenterClientID: VcenterClientID): DeleteVcenterClientRequest = {
    val __obj = js.Dynamic.literal(vcenterClientID = vcenterClientID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVcenterClientRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVcenterClientRequest] (val x: Self) extends AnyVal {
    
    inline def setVcenterClientID(value: VcenterClientID): Self = StObject.set(x, "vcenterClientID", value.asInstanceOf[js.Any])
  }
}
