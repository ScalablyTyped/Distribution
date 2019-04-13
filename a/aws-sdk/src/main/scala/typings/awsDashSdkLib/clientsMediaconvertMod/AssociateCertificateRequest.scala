package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateCertificateRequest extends js.Object {
  /**
    * The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
    */
  var Arn: __string
}

object AssociateCertificateRequest {
  @scala.inline
  def apply(Arn: __string): AssociateCertificateRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[AssociateCertificateRequest]
  }
}

