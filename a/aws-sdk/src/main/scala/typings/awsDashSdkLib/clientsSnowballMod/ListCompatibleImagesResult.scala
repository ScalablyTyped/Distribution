package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCompatibleImagesResult extends js.Object {
  /**
    * A JSON-formatted object that describes a compatible AMI.
    */
  var CompatibleImages: js.UndefOr[CompatibleImageList] = js.undefined
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListCompatibleImagesResult {
  @scala.inline
  def apply(CompatibleImages: CompatibleImageList = null, NextToken: String = null): ListCompatibleImagesResult = {
    val __obj = js.Dynamic.literal()
    if (CompatibleImages != null) __obj.updateDynamic("CompatibleImages")(CompatibleImages)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCompatibleImagesResult]
  }
}

