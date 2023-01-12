package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutpostConfigResponse extends StObject {
  
  /**
    * The Amazon EC2 instance type used for the control plane. The instance type is the same for all control plane instances.
    */
  var controlPlaneInstanceType: String
  
  /**
    * The ARN of the Outpost that you specified for use with your local Amazon EKS cluster on Outposts.
    */
  var outpostArns: StringList
}
object OutpostConfigResponse {
  
  inline def apply(controlPlaneInstanceType: String, outpostArns: StringList): OutpostConfigResponse = {
    val __obj = js.Dynamic.literal(controlPlaneInstanceType = controlPlaneInstanceType.asInstanceOf[js.Any], outpostArns = outpostArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutpostConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutpostConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setControlPlaneInstanceType(value: String): Self = StObject.set(x, "controlPlaneInstanceType", value.asInstanceOf[js.Any])
    
    inline def setOutpostArns(value: StringList): Self = StObject.set(x, "outpostArns", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnsVarargs(value: String*): Self = StObject.set(x, "outpostArns", js.Array(value*))
  }
}
