package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInputSecurityGroupRequest extends StObject {
  
  /**
    * The Input Security Group to delete
    */
  var InputSecurityGroupId: string
}
object DeleteInputSecurityGroupRequest {
  
  inline def apply(InputSecurityGroupId: string): DeleteInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setInputSecurityGroupId(value: string): Self = StObject.set(x, "InputSecurityGroupId", value.asInstanceOf[js.Any])
  }
}
