package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputSecurityGroupResponse extends StObject {
  
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
}
object UpdateInputSecurityGroupResponse {
  
  inline def apply(): UpdateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputSecurityGroupResponse]
  }
  
  extension [Self <: UpdateInputSecurityGroupResponse](x: Self) {
    
    inline def setSecurityGroup(value: InputSecurityGroup): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
  }
}
