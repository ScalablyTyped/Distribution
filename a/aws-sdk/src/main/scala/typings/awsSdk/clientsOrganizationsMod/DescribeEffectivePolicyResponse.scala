package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEffectivePolicyResponse extends StObject {
  
  /**
    * The contents of the effective policy.
    */
  var EffectivePolicy: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.EffectivePolicy] = js.undefined
}
object DescribeEffectivePolicyResponse {
  
  inline def apply(): DescribeEffectivePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePolicyResponse]
  }
  
  extension [Self <: DescribeEffectivePolicyResponse](x: Self) {
    
    inline def setEffectivePolicy(value: EffectivePolicy): Self = StObject.set(x, "EffectivePolicy", value.asInstanceOf[js.Any])
    
    inline def setEffectivePolicyUndefined: Self = StObject.set(x, "EffectivePolicy", js.undefined)
  }
}
