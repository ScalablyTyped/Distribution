package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceViolation extends StObject {
  
  /**
    * Violation detail for network interfaces associated with the EC2 instance.
    */
  var AwsEc2NetworkInterfaceViolations: js.UndefOr[typings.awsSdk.clientsFmsMod.AwsEc2NetworkInterfaceViolations] = js.undefined
  
  /**
    * The resource ID of the EC2 instance.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
}
object AwsEc2InstanceViolation {
  
  inline def apply(): AwsEc2InstanceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2InstanceViolation] (val x: Self) extends AnyVal {
    
    inline def setAwsEc2NetworkInterfaceViolations(value: AwsEc2NetworkInterfaceViolations): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolations", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2NetworkInterfaceViolationsUndefined: Self = StObject.set(x, "AwsEc2NetworkInterfaceViolations", js.undefined)
    
    inline def setAwsEc2NetworkInterfaceViolationsVarargs(value: AwsEc2NetworkInterfaceViolation*): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolations", js.Array(value*))
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
