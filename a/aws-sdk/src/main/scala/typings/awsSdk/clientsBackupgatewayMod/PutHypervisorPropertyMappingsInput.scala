package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutHypervisorPropertyMappingsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor.
    */
  var HypervisorArn: ServerArn
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role.
    */
  var IamRoleArn: typings.awsSdk.clientsBackupgatewayMod.IamRoleArn
  
  /**
    * This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
    */
  var VmwareToAwsTagMappings: typings.awsSdk.clientsBackupgatewayMod.VmwareToAwsTagMappings
}
object PutHypervisorPropertyMappingsInput {
  
  inline def apply(HypervisorArn: ServerArn, IamRoleArn: IamRoleArn, VmwareToAwsTagMappings: VmwareToAwsTagMappings): PutHypervisorPropertyMappingsInput = {
    val __obj = js.Dynamic.literal(HypervisorArn = HypervisorArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], VmwareToAwsTagMappings = VmwareToAwsTagMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutHypervisorPropertyMappingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutHypervisorPropertyMappingsInput] (val x: Self) extends AnyVal {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setVmwareToAwsTagMappings(value: VmwareToAwsTagMappings): Self = StObject.set(x, "VmwareToAwsTagMappings", value.asInstanceOf[js.Any])
    
    inline def setVmwareToAwsTagMappingsVarargs(value: VmwareToAwsTagMapping*): Self = StObject.set(x, "VmwareToAwsTagMappings", js.Array(value*))
  }
}
