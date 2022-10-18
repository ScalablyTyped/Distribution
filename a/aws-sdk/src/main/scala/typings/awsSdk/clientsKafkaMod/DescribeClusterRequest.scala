package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
}
object DescribeClusterRequest {
  
  inline def apply(ClusterArn: string): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequest]
  }
  
  extension [Self <: DescribeClusterRequest](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
  }
}
