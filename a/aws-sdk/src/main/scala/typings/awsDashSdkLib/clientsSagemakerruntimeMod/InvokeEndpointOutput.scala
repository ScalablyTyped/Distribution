package typings
package awsDashSdkLib.clientsSagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeEndpointOutput extends js.Object {
  /**
    * Includes the inference provided by the model. For information about the format of the response body, see Common Data Formats—Inference.
    */
  var Body: BodyBlob
  /**
    * The MIME type of the inference returned in the response body.
    */
  var ContentType: js.UndefOr[Header] = js.undefined
  /**
    * 
    */
  var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
  /**
    * Identifies the production variant that was invoked.
    */
  var InvokedProductionVariant: js.UndefOr[Header] = js.undefined
}

object InvokeEndpointOutput {
  @scala.inline
  def apply(
    Body: BodyBlob,
    ContentType: Header = null,
    CustomAttributes: CustomAttributesHeader = null,
    InvokedProductionVariant: Header = null
  ): InvokeEndpointOutput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (CustomAttributes != null) __obj.updateDynamic("CustomAttributes")(CustomAttributes)
    if (InvokedProductionVariant != null) __obj.updateDynamic("InvokedProductionVariant")(InvokedProductionVariant)
    __obj.asInstanceOf[InvokeEndpointOutput]
  }
}

