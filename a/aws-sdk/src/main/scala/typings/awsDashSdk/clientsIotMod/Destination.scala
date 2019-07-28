package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * Describes the location in S3 of the updated firmware.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.undefined
}

object Destination {
  @scala.inline
  def apply(s3Destination: S3Destination = null): Destination = {
    val __obj = js.Dynamic.literal()
    if (s3Destination != null) __obj.updateDynamic("s3Destination")(s3Destination)
    __obj.asInstanceOf[Destination]
  }
}

