package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingURLRequest extends js.Object {
  /**
    * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The name of the fleet.
    */
  var FleetName: String = js.native
  /**
    * The session context. For more information, see Session Context in the Amazon AppStream 2.0 Administration Guide.
    */
  var SessionContext: js.UndefOr[String] = js.native
  /**
    * The name of the stack.
    */
  var StackName: String = js.native
  /**
    * The identifier of the user.
    */
  var UserId: StreamingUrlUserId = js.native
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 60 seconds.
    */
  var Validity: js.UndefOr[Long] = js.native
}

object CreateStreamingURLRequest {
  @scala.inline
  def apply(
    FleetName: String,
    StackName: String,
    UserId: StreamingUrlUserId,
    ApplicationId: String = null,
    SessionContext: String = null,
    Validity: js.UndefOr[Long] = js.undefined
  ): CreateStreamingURLRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (SessionContext != null) __obj.updateDynamic("SessionContext")(SessionContext.asInstanceOf[js.Any])
    if (!js.isUndefined(Validity)) __obj.updateDynamic("Validity")(Validity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLRequest]
  }
}

