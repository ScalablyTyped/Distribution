package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterInList extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: String
  
  /**
    * The name of the Elastic DocumentDB cluster.
    */
  var clusterName: String
  
  /**
    * The status of the Elastic DocumentDB cluster.
    */
  var status: Status
}
object ClusterInList {
  
  inline def apply(clusterArn: String, clusterName: String, status: Status): ClusterInList = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterInList] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
