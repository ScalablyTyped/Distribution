package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQuerySummary extends StObject {
  
  /**
    * The time the protected query was created.
    */
  var createTime: js.Date
  
  /**
    * The unique ID of the protected query.
    */
  var id: UUID
  
  /**
    * The unique ARN for the membership that initiated the protected query.
    */
  var membershipArn: MembershipArn
  
  /**
    * The unique ID for the membership that initiated the protected query.
    */
  var membershipId: UUID
  
  /**
    * The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`, `FAILED`, `SUCCESS`, `TIMED_OUT`.
    */
  var status: ProtectedQueryStatus
}
object ProtectedQuerySummary {
  
  inline def apply(
    createTime: js.Date,
    id: UUID,
    membershipArn: MembershipArn,
    membershipId: UUID,
    status: ProtectedQueryStatus
  ): ProtectedQuerySummary = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], membershipArn = membershipArn.asInstanceOf[js.Any], membershipId = membershipId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQuerySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQuerySummary] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: UUID): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ProtectedQueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
