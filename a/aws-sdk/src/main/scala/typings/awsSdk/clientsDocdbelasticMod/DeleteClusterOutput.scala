package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterOutput extends StObject {
  
  /**
    * Returns information about the newly deleted Elastic DocumentDB cluster.
    */
  var cluster: Cluster
}
object DeleteClusterOutput {
  
  inline def apply(cluster: Cluster): DeleteClusterOutput = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterOutput] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
