package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  /**
    * The authentication method. The user is authenticated using a streaming URL (API) or SAML 2.0 federation (SAML).
    */
  var AuthenticationType: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AuthenticationType] = js.undefined
  
  /**
    * Specifies whether a user is connected to the streaming session.
    */
  var ConnectionState: js.UndefOr[SessionConnectionState] = js.undefined
  
  /**
    * The name of the fleet for the streaming session.
    */
  var FleetName: String
  
  /**
    * The identifier of the streaming session.
    */
  var Id: String
  
  /**
    * The time when the streaming session is set to expire. This time is based on the MaxUserDurationinSeconds value, which determines the maximum length of time that a streaming session can run. A streaming session might end earlier than the time specified in SessionMaxExpirationTime, when the DisconnectTimeOutInSeconds elapses or the user chooses to end his or her session. If the DisconnectTimeOutInSeconds elapses, or the user chooses to end his or her session, the streaming instance is terminated and the streaming session ends.
    */
  var MaxExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The network details for the streaming session.
    */
  var NetworkAccessConfiguration: js.UndefOr[typings.awsSdk.clientsAppstreamMod.NetworkAccessConfiguration] = js.undefined
  
  /**
    * The name of the stack for the streaming session.
    */
  var StackName: String
  
  /**
    * The time when a streaming instance is dedicated for the user.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the streaming session.
    */
  var State: SessionState
  
  /**
    * The identifier of the user for whom the session was created.
    */
  var UserId: typings.awsSdk.clientsAppstreamMod.UserId
}
object Session {
  
  inline def apply(FleetName: String, Id: String, StackName: String, State: SessionState, UserId: UserId): Session = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setConnectionState(value: SessionConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMaxExpirationTime(value: js.Date): Self = StObject.set(x, "MaxExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setMaxExpirationTimeUndefined: Self = StObject.set(x, "MaxExpirationTime", js.undefined)
    
    inline def setNetworkAccessConfiguration(value: NetworkAccessConfiguration): Self = StObject.set(x, "NetworkAccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccessConfigurationUndefined: Self = StObject.set(x, "NetworkAccessConfiguration", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: SessionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
