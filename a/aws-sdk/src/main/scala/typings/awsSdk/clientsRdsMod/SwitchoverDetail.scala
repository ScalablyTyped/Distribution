package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchoverDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a resource in the blue environment.
    */
  var SourceMember: js.UndefOr[DatabaseArn] = js.undefined
  
  /**
    * The switchover status of a resource in a blue/green deployment. Values:    PROVISIONING - The resource is being prepared to switch over.    AVAILABLE - The resource is ready to switch over.    SWITCHOVER_IN_PROGRESS - The resource is being switched over.    SWITCHOVER_COMPLETED - The resource has been switched over.    SWITCHOVER_FAILED - The resource attempted to switch over but failed.    MISSING_SOURCE - The source resource has been deleted.    MISSING_TARGET - The target resource has been deleted.  
    */
  var Status: js.UndefOr[SwitchoverDetailStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a resource in the green environment.
    */
  var TargetMember: js.UndefOr[DatabaseArn] = js.undefined
}
object SwitchoverDetail {
  
  inline def apply(): SwitchoverDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchoverDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchoverDetail] (val x: Self) extends AnyVal {
    
    inline def setSourceMember(value: DatabaseArn): Self = StObject.set(x, "SourceMember", value.asInstanceOf[js.Any])
    
    inline def setSourceMemberUndefined: Self = StObject.set(x, "SourceMember", js.undefined)
    
    inline def setStatus(value: SwitchoverDetailStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetMember(value: DatabaseArn): Self = StObject.set(x, "TargetMember", value.asInstanceOf[js.Any])
    
    inline def setTargetMemberUndefined: Self = StObject.set(x, "TargetMember", js.undefined)
  }
}
