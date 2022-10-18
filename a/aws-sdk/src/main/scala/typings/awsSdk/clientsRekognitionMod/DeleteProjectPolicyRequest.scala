package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectPolicyRequest extends StObject {
  
  /**
    * The name of the policy that you want to delete.
    */
  var PolicyName: ProjectPolicyName
  
  /**
    * The ID of the project policy revision that you want to delete.
    */
  var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
    */
  var ProjectArn: typings.awsSdk.clientsRekognitionMod.ProjectArn
}
object DeleteProjectPolicyRequest {
  
  inline def apply(PolicyName: ProjectPolicyName, ProjectArn: ProjectArn): DeleteProjectPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectPolicyRequest]
  }
  
  extension [Self <: DeleteProjectPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: ProjectPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionId(value: ProjectPolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
  }
}
