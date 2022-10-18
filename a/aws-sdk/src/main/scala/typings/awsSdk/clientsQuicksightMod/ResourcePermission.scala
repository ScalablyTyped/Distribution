package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePermission extends StObject {
  
  /**
    * The IAM action to grant or revoke permissions on.
    */
  var Actions: ActionList
  
  /**
    * The Amazon Resource Name (ARN) of the principal. This can be one of the following:   The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)   The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)   The ARN of an Amazon Web Services account root: This is an IAM ARN rather than a QuickSight ARN. Use this option only to share resources (templates) across Amazon Web Services accounts. (This is less common.)   
    */
  var Principal: typings.awsSdk.clientsQuicksightMod.Principal
}
object ResourcePermission {
  
  inline def apply(Actions: ActionList, Principal: Principal): ResourcePermission = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePermission]
  }
  
  extension [Self <: ResourcePermission](x: Self) {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
  }
}
