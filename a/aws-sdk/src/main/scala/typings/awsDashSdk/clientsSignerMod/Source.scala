package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /**
    * The S3Source object.
    */
  var s3: js.UndefOr[S3Source] = js.native
}

object Source {
  @scala.inline
  def apply(s3: S3Source = null): Source = {
    val __obj = js.Dynamic.literal()
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

