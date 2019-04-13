package typings
package awsDashSdkLib.clientsSagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeEndpointInput extends js.Object {
  /**
    * The desired MIME type of the inference in the response.
    */
  var Accept: js.UndefOr[Header] = js.undefined
  /**
    * Provides input data, in the format specified in the ContentType request header. Amazon SageMaker passes all of the data in the body to the model.  For information about the format of the request body, see Common Data Formats—Inference.
    */
  var Body: BodyBlob
  /**
    * The MIME type of the input data in the request body.
    */
  var ContentType: js.UndefOr[Header] = js.undefined
  /**
    * 
    */
  var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
  /**
    * The name of the endpoint that you specified when you created the endpoint using the CreateEndpoint API. 
    */
  var EndpointName: awsDashSdkLib.clientsSagemakerruntimeMod.EndpointName
}

object InvokeEndpointInput {
  @scala.inline
  def apply(
    Body: BodyBlob,
    EndpointName: EndpointName,
    Accept: Header = null,
    ContentType: Header = null,
    CustomAttributes: CustomAttributesHeader = null
  ): InvokeEndpointInput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], EndpointName = EndpointName)
    if (Accept != null) __obj.updateDynamic("Accept")(Accept)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (CustomAttributes != null) __obj.updateDynamic("CustomAttributes")(CustomAttributes)
    __obj.asInstanceOf[InvokeEndpointInput]
  }
}

