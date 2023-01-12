package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnStaticRoute extends StObject {
  
  /**
    * The CIDR block associated with the local subnet of the customer data center.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates how the routes were provided.
    */
  var Source: js.UndefOr[VpnStaticRouteSource] = js.undefined
  
  /**
    * The current state of the static route.
    */
  var State: js.UndefOr[VpnState] = js.undefined
}
object VpnStaticRoute {
  
  inline def apply(): VpnStaticRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnStaticRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnStaticRoute] (val x: Self) extends AnyVal {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setSource(value: VpnStaticRouteSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setState(value: VpnState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
