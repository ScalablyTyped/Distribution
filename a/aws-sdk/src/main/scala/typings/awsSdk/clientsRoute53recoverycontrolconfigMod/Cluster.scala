package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var ClusterArn: js.UndefOr[stringMin1Max256PatternAZaZ09] = js.undefined
  
  /**
    * Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control state in the cluster. To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing Control Actions.
    */
  var ClusterEndpoints: js.UndefOr[listOfClusterEndpoint] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.Status] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterEndpoints(value: listOfClusterEndpoint): Self = StObject.set(x, "ClusterEndpoints", value.asInstanceOf[js.Any])
    
    inline def setClusterEndpointsUndefined: Self = StObject.set(x, "ClusterEndpoints", js.undefined)
    
    inline def setClusterEndpointsVarargs(value: ClusterEndpoint*): Self = StObject.set(x, "ClusterEndpoints", js.Array(value*))
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
