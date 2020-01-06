package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsIngest extends js.Object {
  /**
    * A list of endpoints to which the source stream should be sent.
    */
  var IngestEndpoints: js.UndefOr[__listOfIngestEndpoint] = js.native
}

object HlsIngest {
  @scala.inline
  def apply(IngestEndpoints: __listOfIngestEndpoint = null): HlsIngest = {
    val __obj = js.Dynamic.literal()
    if (IngestEndpoints != null) __obj.updateDynamic("IngestEndpoints")(IngestEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsIngest]
  }
}

