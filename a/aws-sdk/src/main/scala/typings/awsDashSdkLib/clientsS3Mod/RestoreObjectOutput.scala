package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreObjectOutput extends js.Object {
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  /**
    * Indicates the path in the provided S3 output location where Select results will be restored to.
    */
  var RestoreOutputPath: js.UndefOr[RestoreOutputPath] = js.undefined
}

object RestoreObjectOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null, RestoreOutputPath: RestoreOutputPath = null): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (RestoreOutputPath != null) __obj.updateDynamic("RestoreOutputPath")(RestoreOutputPath)
    __obj.asInstanceOf[RestoreObjectOutput]
  }
}

