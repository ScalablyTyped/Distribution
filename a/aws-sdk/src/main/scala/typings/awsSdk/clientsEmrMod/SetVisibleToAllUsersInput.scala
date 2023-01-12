package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVisibleToAllUsersInput extends StObject {
  
  /**
    * The unique identifier of the job flow (cluster).
    */
  var JobFlowIds: XmlStringList
  
  /**
    * A value of true indicates that an IAM principal in the Amazon Web Services account can perform EMR actions on the cluster that the IAM policies attached to the principal allow. A value of false indicates that only the IAM principal that created the cluster and the Amazon Web Services root user can perform EMR actions on the cluster.
    */
  var VisibleToAllUsers: Boolean
}
object SetVisibleToAllUsersInput {
  
  inline def apply(JobFlowIds: XmlStringList, VisibleToAllUsers: Boolean): SetVisibleToAllUsersInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any], VisibleToAllUsers = VisibleToAllUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVisibleToAllUsersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetVisibleToAllUsersInput] (val x: Self) extends AnyVal {
    
    inline def setJobFlowIds(value: XmlStringList): Self = StObject.set(x, "JobFlowIds", value.asInstanceOf[js.Any])
    
    inline def setJobFlowIdsVarargs(value: XmlString*): Self = StObject.set(x, "JobFlowIds", js.Array(value*))
    
    inline def setVisibleToAllUsers(value: Boolean): Self = StObject.set(x, "VisibleToAllUsers", value.asInstanceOf[js.Any])
  }
}
