package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallInstructionsMessageType extends js.Object {
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var Text: js.UndefOr[NonEmptyString] = js.undefined
}

object CallInstructionsMessageType {
  @scala.inline
  def apply(Text: NonEmptyString = null): CallInstructionsMessageType = {
    val __obj = js.Dynamic.literal()
    if (Text != null) __obj.updateDynamic("Text")(Text)
    __obj.asInstanceOf[CallInstructionsMessageType]
  }
}

