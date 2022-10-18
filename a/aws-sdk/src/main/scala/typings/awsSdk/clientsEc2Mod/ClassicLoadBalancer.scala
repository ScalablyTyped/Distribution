package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassicLoadBalancer extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ClassicLoadBalancer {
  
  inline def apply(): ClassicLoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLoadBalancer]
  }
  
  extension [Self <: ClassicLoadBalancer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
