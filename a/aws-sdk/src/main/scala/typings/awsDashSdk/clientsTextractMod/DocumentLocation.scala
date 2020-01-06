package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLocation extends js.Object {
  /**
    * The Amazon S3 bucket that contains the input document.
    */
  var S3Object: js.UndefOr[typings.awsDashSdk.clientsTextractMod.S3Object] = js.native
}

object DocumentLocation {
  @scala.inline
  def apply(S3Object: S3Object = null): DocumentLocation = {
    val __obj = js.Dynamic.literal()
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLocation]
  }
}

