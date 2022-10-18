package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.  "{\"Version\": \"2012-10-17\", \"Statement\" : [{ \"Sid\": \"AllowUserRestoreFromSnapshot\", \"Principal\":{\"AWS\": [\"739247239426\"]}, \"Action\": [\"redshift-serverless:RestoreFromSnapshot\"] , \"Effect\": \"Allow\" }]}" 
    */
  var policy: String
  
  /**
    * The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
    */
  var resourceArn: String
}
object PutResourcePolicyRequest {
  
  inline def apply(policy: String, resourceArn: String): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
