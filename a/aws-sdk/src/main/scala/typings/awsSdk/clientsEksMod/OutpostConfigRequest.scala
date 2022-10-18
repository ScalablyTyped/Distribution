package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutpostConfigRequest extends StObject {
  
  /**
    * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The instance type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed after cluster creation. Choose an instance type based on the number of nodes that your cluster will have. If your cluster will have:   1–20 nodes, then we recommend specifying a large instance type.   21–100 nodes, then we recommend specifying an xlarge instance type.   101–250 nodes, then we recommend specifying a 2xlarge instance type.   For a list of the available Amazon EC2 instance types, see Compute and storage in Outposts rack features. The control plane is not automatically scaled by Amazon EKS.
    */
  var controlPlaneInstanceType: String
  
  /**
    * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. Only a single Outpost ARN is supported.
    */
  var outpostArns: StringList
}
object OutpostConfigRequest {
  
  inline def apply(controlPlaneInstanceType: String, outpostArns: StringList): OutpostConfigRequest = {
    val __obj = js.Dynamic.literal(controlPlaneInstanceType = controlPlaneInstanceType.asInstanceOf[js.Any], outpostArns = outpostArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutpostConfigRequest]
  }
  
  extension [Self <: OutpostConfigRequest](x: Self) {
    
    inline def setControlPlaneInstanceType(value: String): Self = StObject.set(x, "controlPlaneInstanceType", value.asInstanceOf[js.Any])
    
    inline def setOutpostArns(value: StringList): Self = StObject.set(x, "outpostArns", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnsVarargs(value: String*): Self = StObject.set(x, "outpostArns", js.Array(value*))
  }
}
