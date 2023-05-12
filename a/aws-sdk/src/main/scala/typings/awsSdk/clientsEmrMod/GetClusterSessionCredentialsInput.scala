package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterSessionCredentialsInput extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: XmlStringMaxLen256
  
  /**
    * The Amazon Resource Name (ARN) of the runtime role for interactive workload submission on the cluster. The runtime role can be a cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type using the following format: arn:partition:service:region:account:resource.
    */
  var ExecutionRoleArn: ArnType
}
object GetClusterSessionCredentialsInput {
  
  inline def apply(ClusterId: XmlStringMaxLen256, ExecutionRoleArn: ArnType): GetClusterSessionCredentialsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSessionCredentialsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterSessionCredentialsInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: XmlStringMaxLen256): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ArnType): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
  }
}
