package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterOutput extends StObject {
  
  /**
    * Returns information about a specific Elastic DocumentDB cluster.
    */
  var cluster: Cluster
}
object GetClusterOutput {
  
  inline def apply(cluster: Cluster): GetClusterOutput = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterOutput] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
