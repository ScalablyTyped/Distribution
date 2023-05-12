package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterOutput extends StObject {
  
  /**
    * Returns information about the updated Elastic DocumentDB cluster.
    */
  var cluster: Cluster
}
object UpdateClusterOutput {
  
  inline def apply(cluster: Cluster): UpdateClusterOutput = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterOutput] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
