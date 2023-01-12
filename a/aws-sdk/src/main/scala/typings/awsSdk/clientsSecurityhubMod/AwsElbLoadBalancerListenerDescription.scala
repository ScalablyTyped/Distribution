package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerListenerDescription extends StObject {
  
  /**
    * Information about the listener.
    */
  var Listener: js.UndefOr[AwsElbLoadBalancerListener] = js.undefined
  
  /**
    * The policies enabled for the listener.
    */
  var PolicyNames: js.UndefOr[StringList] = js.undefined
}
object AwsElbLoadBalancerListenerDescription {
  
  inline def apply(): AwsElbLoadBalancerListenerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerListenerDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElbLoadBalancerListenerDescription] (val x: Self) extends AnyVal {
    
    inline def setListener(value: AwsElbLoadBalancerListener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
    
    inline def setPolicyNames(value: StringList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    inline def setPolicyNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
  }
}
