package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputLocation extends js.Object {
  /**
    * Describes an S3 location that will receive the results of the restore request.
    */
  var S3: js.UndefOr[S3Location] = js.undefined
}

object OutputLocation {
  @scala.inline
  def apply(S3: S3Location = null): OutputLocation = {
    val __obj = js.Dynamic.literal()
    if (S3 != null) __obj.updateDynamic("S3")(S3)
    __obj.asInstanceOf[OutputLocation]
  }
}

