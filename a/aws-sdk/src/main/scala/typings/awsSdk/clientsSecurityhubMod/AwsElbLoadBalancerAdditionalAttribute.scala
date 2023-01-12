package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerAdditionalAttribute extends StObject {
  
  /**
    * The name of the attribute.
    */
  var Key: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLoadBalancerAdditionalAttribute {
  
  inline def apply(): AwsElbLoadBalancerAdditionalAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerAdditionalAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElbLoadBalancerAdditionalAttribute] (val x: Self) extends AnyVal {
    
    inline def setKey(value: NonEmptyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
