package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3OutputUrl extends js.Object {
  /**
    * A URL for an Amazon S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[Url] = js.undefined
}

object S3OutputUrl {
  @scala.inline
  def apply(OutputUrl: Url = null): S3OutputUrl = {
    val __obj = js.Dynamic.literal()
    if (OutputUrl != null) __obj.updateDynamic("OutputUrl")(OutputUrl)
    __obj.asInstanceOf[S3OutputUrl]
  }
}

