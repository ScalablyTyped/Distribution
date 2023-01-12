package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerInstance extends StObject {
  
  /**
    * The instance identifier.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLoadBalancerInstance {
  
  inline def apply(): AwsElbLoadBalancerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElbLoadBalancerInstance] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
