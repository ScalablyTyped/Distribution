package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterOutput extends StObject {
  
  /**
    * The new Elastic DocumentDB cluster that has been created.
    */
  var cluster: Cluster
}
object CreateClusterOutput {
  
  inline def apply(cluster: Cluster): CreateClusterOutput = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterOutput] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
