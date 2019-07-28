package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningImageFormat extends js.Object {
  /**
    * The default format of an AWS Signer signing image.
    */
  var defaultFormat: ImageFormat
  /**
    * The supported formats of an AWS Signer signing image.
    */
  var supportedFormats: ImageFormats
}

object SigningImageFormat {
  @scala.inline
  def apply(defaultFormat: ImageFormat, supportedFormats: ImageFormats): SigningImageFormat = {
    val __obj = js.Dynamic.literal(defaultFormat = defaultFormat.asInstanceOf[js.Any], supportedFormats = supportedFormats)
  
    __obj.asInstanceOf[SigningImageFormat]
  }
}

