package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceECRImagePullerRoleRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether to activate the role.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
}
object ContainerServiceECRImagePullerRoleRequest {
  
  inline def apply(): ContainerServiceECRImagePullerRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceECRImagePullerRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerServiceECRImagePullerRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
  }
}
