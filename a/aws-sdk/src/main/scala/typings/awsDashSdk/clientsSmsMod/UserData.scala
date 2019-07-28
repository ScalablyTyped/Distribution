package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  /**
    * Amazon S3 location of the user-data script.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
}

object UserData {
  @scala.inline
  def apply(s3Location: S3Location = null): UserData = {
    val __obj = js.Dynamic.literal()
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location)
    __obj.asInstanceOf[UserData]
  }
}

