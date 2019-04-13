package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedTraceSegment extends js.Object {
  /**
    * The error that caused processing to fail.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object UnprocessedTraceSegment {
  @scala.inline
  def apply(ErrorCode: String = null, Id: String = null, Message: String = null): UnprocessedTraceSegment = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[UnprocessedTraceSegment]
  }
}

