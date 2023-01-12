package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityProfileResponse extends StObject {
  
  /**
    * The security profile.
    */
  var SecurityProfile: js.UndefOr[typings.awsSdk.clientsConnectMod.SecurityProfile] = js.undefined
}
object DescribeSecurityProfileResponse {
  
  inline def apply(): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSecurityProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityProfile(value: SecurityProfile): Self = StObject.set(x, "SecurityProfile", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileUndefined: Self = StObject.set(x, "SecurityProfile", js.undefined)
  }
}
