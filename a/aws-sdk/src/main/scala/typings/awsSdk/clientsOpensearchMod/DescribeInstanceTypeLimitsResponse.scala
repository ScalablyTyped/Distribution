package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceTypeLimitsResponse extends StObject {
  
  var LimitsByRole: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LimitsByRole] = js.undefined
}
object DescribeInstanceTypeLimitsResponse {
  
  inline def apply(): DescribeInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypeLimitsResponse]
  }
  
  extension [Self <: DescribeInstanceTypeLimitsResponse](x: Self) {
    
    inline def setLimitsByRole(value: LimitsByRole): Self = StObject.set(x, "LimitsByRole", value.asInstanceOf[js.Any])
    
    inline def setLimitsByRoleUndefined: Self = StObject.set(x, "LimitsByRole", js.undefined)
  }
}
