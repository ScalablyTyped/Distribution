package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  /**
    * An Amazon S3 storage location.
    */
  var S3: js.UndefOr[S3Storage] = js.undefined
}

object Storage {
  @scala.inline
  def apply(S3: S3Storage = null): Storage = {
    val __obj = js.Dynamic.literal()
    if (S3 != null) __obj.updateDynamic("S3")(S3)
    __obj.asInstanceOf[Storage]
  }
}

