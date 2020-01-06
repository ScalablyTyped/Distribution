package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * The S3Destination object.
    */
  var s3: js.UndefOr[S3Destination] = js.native
}

object Destination {
  @scala.inline
  def apply(s3: S3Destination = null): Destination = {
    val __obj = js.Dynamic.literal()
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

