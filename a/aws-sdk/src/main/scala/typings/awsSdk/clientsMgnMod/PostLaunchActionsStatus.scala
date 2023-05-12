package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostLaunchActionsStatus extends StObject {
  
  /**
    * List of Post Launch Action status.
    */
  var postLaunchActionsLaunchStatusList: js.UndefOr[PostLaunchActionsLaunchStatusList] = js.undefined
  
  /**
    * Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
    */
  var ssmAgentDiscoveryDatetime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object PostLaunchActionsStatus {
  
  inline def apply(): PostLaunchActionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostLaunchActionsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostLaunchActionsStatus] (val x: Self) extends AnyVal {
    
    inline def setPostLaunchActionsLaunchStatusList(value: PostLaunchActionsLaunchStatusList): Self = StObject.set(x, "postLaunchActionsLaunchStatusList", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsLaunchStatusListUndefined: Self = StObject.set(x, "postLaunchActionsLaunchStatusList", js.undefined)
    
    inline def setPostLaunchActionsLaunchStatusListVarargs(value: JobPostLaunchActionsLaunchStatus*): Self = StObject.set(x, "postLaunchActionsLaunchStatusList", js.Array(value*))
    
    inline def setSsmAgentDiscoveryDatetime(value: ISO8601DatetimeString): Self = StObject.set(x, "ssmAgentDiscoveryDatetime", value.asInstanceOf[js.Any])
    
    inline def setSsmAgentDiscoveryDatetimeUndefined: Self = StObject.set(x, "ssmAgentDiscoveryDatetime", js.undefined)
  }
}
