package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedTraceSegment extends js.Object {
  /**
    * The error that caused processing to fail.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object UnprocessedTraceSegment {
  @scala.inline
  def apply(ErrorCode: String = null, Id: String = null, Message: String = null): UnprocessedTraceSegment = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedTraceSegment]
  }
}

