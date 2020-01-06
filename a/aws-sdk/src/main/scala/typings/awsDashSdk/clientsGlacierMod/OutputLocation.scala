package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocation extends js.Object {
  /**
    * Describes an S3 location that will receive the results of the job request.
    */
  var S3: js.UndefOr[S3Location] = js.native
}

object OutputLocation {
  @scala.inline
  def apply(S3: S3Location = null): OutputLocation = {
    val __obj = js.Dynamic.literal()
    if (S3 != null) __obj.updateDynamic("S3")(S3.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputLocation]
  }
}

