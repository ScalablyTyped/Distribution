package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIPSetResponse extends StObject {
  
  /**
    * The ID of the IPSet resource.
    */
  var IpSetId: String
}
object CreateIPSetResponse {
  
  inline def apply(IpSetId: String): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal(IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
    
    inline def setIpSetId(value: String): Self = StObject.set(x, "IpSetId", value.asInstanceOf[js.Any])
  }
}
