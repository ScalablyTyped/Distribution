package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageBuilderStreamingURLResult extends js.Object {
  /**
    * The elapsed time, in seconds after the Unix epoch, when this URL expires.
    */
  var Expires: js.UndefOr[Timestamp] = js.undefined
  /**
    * The URL to start the AppStream 2.0 streaming session.
    */
  var StreamingURL: js.UndefOr[String] = js.undefined
}

object CreateImageBuilderStreamingURLResult {
  @scala.inline
  def apply(Expires: Timestamp = null, StreamingURL: String = null): CreateImageBuilderStreamingURLResult = {
    val __obj = js.Dynamic.literal()
    if (Expires != null) __obj.updateDynamic("Expires")(Expires)
    if (StreamingURL != null) __obj.updateDynamic("StreamingURL")(StreamingURL)
    __obj.asInstanceOf[CreateImageBuilderStreamingURLResult]
  }
}

