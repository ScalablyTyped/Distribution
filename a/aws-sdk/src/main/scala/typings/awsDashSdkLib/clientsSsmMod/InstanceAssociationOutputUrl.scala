package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAssociationOutputUrl extends js.Object {
  /**
    * The URL of Amazon S3 bucket where you want to store the results of this request.
    */
  var S3OutputUrl: js.UndefOr[S3OutputUrl] = js.undefined
}

object InstanceAssociationOutputUrl {
  @scala.inline
  def apply(S3OutputUrl: S3OutputUrl = null): InstanceAssociationOutputUrl = {
    val __obj = js.Dynamic.literal()
    if (S3OutputUrl != null) __obj.updateDynamic("S3OutputUrl")(S3OutputUrl)
    __obj.asInstanceOf[InstanceAssociationOutputUrl]
  }
}

