package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingURLResult extends js.Object {
  /**
    * The elapsed time, in seconds after the Unix epoch, when this URL expires.
    */
  var Expires: js.UndefOr[Timestamp] = js.native
  /**
    * The URL to start the AppStream 2.0 streaming session.
    */
  var StreamingURL: js.UndefOr[String] = js.native
}

object CreateStreamingURLResult {
  @scala.inline
  def apply(Expires: Timestamp = null, StreamingURL: String = null): CreateStreamingURLResult = {
    val __obj = js.Dynamic.literal()
    if (Expires != null) __obj.updateDynamic("Expires")(Expires.asInstanceOf[js.Any])
    if (StreamingURL != null) __obj.updateDynamic("StreamingURL")(StreamingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLResult]
  }
}

