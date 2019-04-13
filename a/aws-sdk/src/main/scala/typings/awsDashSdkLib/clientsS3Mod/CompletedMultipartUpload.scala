package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedMultipartUpload extends js.Object {
  /**
    * 
    */
  var Parts: js.UndefOr[CompletedPartList] = js.undefined
}

object CompletedMultipartUpload {
  @scala.inline
  def apply(Parts: CompletedPartList = null): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts)
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
}

