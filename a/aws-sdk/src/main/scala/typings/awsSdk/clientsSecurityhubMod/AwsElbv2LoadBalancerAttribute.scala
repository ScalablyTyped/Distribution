package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbv2LoadBalancerAttribute extends StObject {
  
  /**
    * The name of the load balancer attribute.
    */
  var Key: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the load balancer attribute.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbv2LoadBalancerAttribute {
  
  inline def apply(): AwsElbv2LoadBalancerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbv2LoadBalancerAttribute]
  }
  
  extension [Self <: AwsElbv2LoadBalancerAttribute](x: Self) {
    
    inline def setKey(value: NonEmptyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
