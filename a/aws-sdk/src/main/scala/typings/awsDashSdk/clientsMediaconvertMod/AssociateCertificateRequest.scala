package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCertificateRequest extends js.Object {
  /**
    * The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
    */
  var Arn: __string = js.native
}

object AssociateCertificateRequest {
  @scala.inline
  def apply(Arn: __string): AssociateCertificateRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateCertificateRequest]
  }
}

