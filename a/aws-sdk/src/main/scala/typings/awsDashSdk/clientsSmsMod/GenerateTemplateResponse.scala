package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTemplateResponse extends js.Object {
  /**
    * Location of the Amazon S3 object.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
}

object GenerateTemplateResponse {
  @scala.inline
  def apply(s3Location: S3Location = null): GenerateTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location)
    __obj.asInstanceOf[GenerateTemplateResponse]
  }
}

