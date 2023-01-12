package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipatingServer extends StObject {
  
  /**
    * Participating server launch status.
    */
  var launchStatus: js.UndefOr[LaunchStatus] = js.undefined
  
  /**
    * Participating server Source Server ID.
    */
  var launchedEc2InstanceID: js.UndefOr[EC2InstanceID] = js.undefined
  
  /**
    * Participating server Source Server ID.
    */
  var postLaunchActionsStatus: js.UndefOr[PostLaunchActionsStatus] = js.undefined
  
  /**
    * Participating server Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object ParticipatingServer {
  
  inline def apply(sourceServerID: SourceServerID): ParticipatingServer = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipatingServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipatingServer] (val x: Self) extends AnyVal {
    
    inline def setLaunchStatus(value: LaunchStatus): Self = StObject.set(x, "launchStatus", value.asInstanceOf[js.Any])
    
    inline def setLaunchStatusUndefined: Self = StObject.set(x, "launchStatus", js.undefined)
    
    inline def setLaunchedEc2InstanceID(value: EC2InstanceID): Self = StObject.set(x, "launchedEc2InstanceID", value.asInstanceOf[js.Any])
    
    inline def setLaunchedEc2InstanceIDUndefined: Self = StObject.set(x, "launchedEc2InstanceID", js.undefined)
    
    inline def setPostLaunchActionsStatus(value: PostLaunchActionsStatus): Self = StObject.set(x, "postLaunchActionsStatus", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsStatusUndefined: Self = StObject.set(x, "postLaunchActionsStatus", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
