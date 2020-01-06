package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The authentication method. The user is authenticated using a streaming URL (API) or SAML 2.0 federation (SAML).
    */
  var AuthenticationType: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.AuthenticationType] = js.native
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
  var NetworkAccessConfiguration: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.NetworkAccessConfiguration] = js.native
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
  var UserId: typings.awsDashSdk.clientsAppstreamMod.UserId = js.native
}

object Session {
  @scala.inline
  def apply(
    FleetName: String,
    Id: String,
    StackName: String,
    State: SessionState,
    UserId: UserId,
    AuthenticationType: AuthenticationType = null,
    ConnectionState: SessionConnectionState = null,
    MaxExpirationTime: Timestamp = null,
    NetworkAccessConfiguration: NetworkAccessConfiguration = null,
    StartTime: Timestamp = null
  ): Session = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (AuthenticationType != null) __obj.updateDynamic("AuthenticationType")(AuthenticationType.asInstanceOf[js.Any])
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (MaxExpirationTime != null) __obj.updateDynamic("MaxExpirationTime")(MaxExpirationTime.asInstanceOf[js.Any])
    if (NetworkAccessConfiguration != null) __obj.updateDynamic("NetworkAccessConfiguration")(NetworkAccessConfiguration.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

