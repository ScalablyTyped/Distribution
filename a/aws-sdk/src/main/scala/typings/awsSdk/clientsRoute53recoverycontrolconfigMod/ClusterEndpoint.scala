package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEndpoint extends StObject {
  
  /**
    * A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a routing control state in the cluster. To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing Control Actions.
    */
  var Endpoint: js.UndefOr[stringMin1Max128PatternAZaZ09] = js.undefined
  
  /**
    * The Amazon Web Services Region for a cluster endpoint.
    */
  var Region: js.UndefOr[stringMin1Max32PatternS] = js.undefined
}
object ClusterEndpoint {
  
  inline def apply(): ClusterEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterEndpoint] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: stringMin1Max128PatternAZaZ09): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setRegion(value: stringMin1Max32PatternS): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
