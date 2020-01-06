package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelEndpointDataBlob extends js.Object {
  /**
    * The byte buffer of the Amazon SageMaker model endpoint input data blob.
    */
  var byteBuffer: js.UndefOr[blob] = js.native
  /**
    * The content type of the Amazon SageMaker model endpoint input data blob. 
    */
  var contentType: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.contentType] = js.native
}

object ModelEndpointDataBlob {
  @scala.inline
  def apply(byteBuffer: blob = null, contentType: contentType = null): ModelEndpointDataBlob = {
    val __obj = js.Dynamic.literal()
    if (byteBuffer != null) __obj.updateDynamic("byteBuffer")(byteBuffer.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelEndpointDataBlob]
  }
}

