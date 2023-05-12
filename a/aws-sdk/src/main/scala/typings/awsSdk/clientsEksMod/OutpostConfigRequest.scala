package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutpostConfigRequest extends StObject {
  
  /**
    * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. Choose an instance type based on the number of nodes that your cluster will have. For more information, see Capacity considerations in the Amazon EKS User Guide. The instance type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed after cluster creation. The control plane is not automatically scaled by Amazon EKS.  
    */
  var controlPlaneInstanceType: String
  
  /**
    * An object representing the placement configuration for all the control plane instances of your local Amazon EKS cluster on an Amazon Web Services Outpost. For more information, see Capacity considerations in the Amazon EKS User Guide.
    */
  var controlPlanePlacement: js.UndefOr[ControlPlanePlacementRequest] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutpostConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setControlPlaneInstanceType(value: String): Self = StObject.set(x, "controlPlaneInstanceType", value.asInstanceOf[js.Any])
    
    inline def setControlPlanePlacement(value: ControlPlanePlacementRequest): Self = StObject.set(x, "controlPlanePlacement", value.asInstanceOf[js.Any])
    
    inline def setControlPlanePlacementUndefined: Self = StObject.set(x, "controlPlanePlacement", js.undefined)
    
    inline def setOutpostArns(value: StringList): Self = StObject.set(x, "outpostArns", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnsVarargs(value: String*): Self = StObject.set(x, "outpostArns", js.Array(value*))
  }
}
