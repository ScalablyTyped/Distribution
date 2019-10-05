package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamingURLRequest extends js.Object {
  /**
    * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The name of the fleet.
    */
  var FleetName: String
  /**
    * The session context. For more information, see Session Context in the Amazon AppStream 2.0 Administration Guide.
    */
  var SessionContext: js.UndefOr[String] = js.undefined
  /**
    * The name of the stack.
    */
  var StackName: String
  /**
    * The identifier of the user.
    */
  var UserId: StreamingUrlUserId
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 60 seconds.
    */
  var Validity: js.UndefOr[Long] = js.undefined
}

object CreateStreamingURLRequest {
  @scala.inline
  def apply(
    FleetName: String,
    StackName: String,
    UserId: StreamingUrlUserId,
    ApplicationId: String = null,
    SessionContext: String = null,
    Validity: Int | Double = null
  ): CreateStreamingURLRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName, StackName = StackName, UserId = UserId)
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (SessionContext != null) __obj.updateDynamic("SessionContext")(SessionContext)
    if (Validity != null) __obj.updateDynamic("Validity")(Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLRequest]
  }
}

