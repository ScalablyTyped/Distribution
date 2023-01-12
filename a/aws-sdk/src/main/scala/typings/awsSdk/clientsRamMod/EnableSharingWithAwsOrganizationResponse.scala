package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableSharingWithAwsOrganizationResponse extends StObject {
  
  /**
    * A return value of true indicates that the request succeeded. A value of false indicates that the request failed.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}
object EnableSharingWithAwsOrganizationResponse {
  
  inline def apply(): EnableSharingWithAwsOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSharingWithAwsOrganizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableSharingWithAwsOrganizationResponse] (val x: Self) extends AnyVal {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
