package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityProfileRequest extends StObject {
  
  /**
    * The name of the security profile whose information you want to get.
    */
  var securityProfileName: SecurityProfileName
}
object DescribeSecurityProfileRequest {
  
  inline def apply(securityProfileName: SecurityProfileName): DescribeSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityProfileRequest]
  }
  
  extension [Self <: DescribeSecurityProfileRequest](x: Self) {
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
  }
}
