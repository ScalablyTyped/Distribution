package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConsoleScreenshotResult extends js.Object {
  /**
    * The data that comprises the image.
    */
  var ImageData: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object GetConsoleScreenshotResult {
  @scala.inline
  def apply(ImageData: String = null, InstanceId: String = null): GetConsoleScreenshotResult = {
    val __obj = js.Dynamic.literal()
    if (ImageData != null) __obj.updateDynamic("ImageData")(ImageData)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[GetConsoleScreenshotResult]
  }
}

