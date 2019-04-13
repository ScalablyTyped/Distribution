package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateCertificateRequest extends js.Object {
  /**
    * The ARN of the ACM certificate that you want to disassociate from your MediaConvert resource.
    */
  var Arn: __string
}

object DisassociateCertificateRequest {
  @scala.inline
  def apply(Arn: __string): DisassociateCertificateRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[DisassociateCertificateRequest]
  }
}

