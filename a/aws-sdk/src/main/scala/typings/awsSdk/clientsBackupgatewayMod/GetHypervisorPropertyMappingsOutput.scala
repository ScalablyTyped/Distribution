package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHypervisorPropertyMappingsOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role.
    */
  var IamRoleArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.IamRoleArn] = js.undefined
  
  /**
    * This is a display of the mappings of on-premises VMware tags to the Amazon Web Services tags.
    */
  var VmwareToAwsTagMappings: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.VmwareToAwsTagMappings] = js.undefined
}
object GetHypervisorPropertyMappingsOutput {
  
  inline def apply(): GetHypervisorPropertyMappingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHypervisorPropertyMappingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHypervisorPropertyMappingsOutput] (val x: Self) extends AnyVal {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setVmwareToAwsTagMappings(value: VmwareToAwsTagMappings): Self = StObject.set(x, "VmwareToAwsTagMappings", value.asInstanceOf[js.Any])
    
    inline def setVmwareToAwsTagMappingsUndefined: Self = StObject.set(x, "VmwareToAwsTagMappings", js.undefined)
    
    inline def setVmwareToAwsTagMappingsVarargs(value: VmwareToAwsTagMapping*): Self = StObject.set(x, "VmwareToAwsTagMappings", js.Array(value*))
  }
}
