package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterOperationRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the MSK cluster operation.
    
    */
  var ClusterOperationArn: string
}
object DescribeClusterOperationRequest {
  
  inline def apply(ClusterOperationArn: string): DescribeClusterOperationRequest = {
    val __obj = js.Dynamic.literal(ClusterOperationArn = ClusterOperationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterOperationRequest]
  }
  
  extension [Self <: DescribeClusterOperationRequest](x: Self) {
    
    inline def setClusterOperationArn(value: string): Self = StObject.set(x, "ClusterOperationArn", value.asInstanceOf[js.Any])
  }
}
