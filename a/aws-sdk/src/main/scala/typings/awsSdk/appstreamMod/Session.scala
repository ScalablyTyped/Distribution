package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  /**
    * The authentication method. The user is authenticated using a streaming URL (API) or SAML 2.0 federation (SAML).
    */
  var AuthenticationType: js.UndefOr[typings.awsSdk.appstreamMod.AuthenticationType] = js.native
  
  /**
    * Specifies whether a user is connected to the streaming session.
    */
  var ConnectionState: js.UndefOr[SessionConnectionState] = js.native
  
  /**
    * The name of the fleet for the streaming session.
    */
  var FleetName: String = js.native
  
  /**
    * The identifier of the streaming session.
    */
  var Id: String = js.native
  
  /**
    * The time when the streaming session is set to expire. This time is based on the MaxUserDurationinSeconds value, which determines the maximum length of time that a streaming session can run. A streaming session might end earlier than the time specified in SessionMaxExpirationTime, when the DisconnectTimeOutInSeconds elapses or the user chooses to end his or her session. If the DisconnectTimeOutInSeconds elapses, or the user chooses to end his or her session, the streaming instance is terminated and the streaming session ends.
    */
  var MaxExpirationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The network details for the streaming session.
    */
  var NetworkAccessConfiguration: js.UndefOr[typings.awsSdk.appstreamMod.NetworkAccessConfiguration] = js.native
  
  /**
    * The name of the stack for the streaming session.
    */
  var StackName: String = js.native
  
  /**
    * The time when a streaming instance is dedicated for the user.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The current state of the streaming session.
    */
  var State: SessionState = js.native
  
  /**
    * The identifier of the user for whom the session was created.
    */
  var UserId: typings.awsSdk.appstreamMod.UserId = js.native
}
object Session {
  
  @scala.inline
  def apply(FleetName: String, Id: String, StackName: String, State: SessionState, UserId: UserId): Session = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFleetName(value: String): Self = this.set("FleetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: String): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SessionState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationType: Self = this.set("AuthenticationType", js.undefined)
    
    @scala.inline
    def setConnectionState(value: SessionConnectionState): Self = this.set("ConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionState: Self = this.set("ConnectionState", js.undefined)
    
    @scala.inline
    def setMaxExpirationTime(value: Timestamp): Self = this.set("MaxExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExpirationTime: Self = this.set("MaxExpirationTime", js.undefined)
    
    @scala.inline
    def setNetworkAccessConfiguration(value: NetworkAccessConfiguration): Self = this.set("NetworkAccessConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAccessConfiguration: Self = this.set("NetworkAccessConfiguration", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
