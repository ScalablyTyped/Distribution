package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateServiceLastAccessedDetailsRequest extends js.Object {
  /**
    * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the resource was last used in an attempt to access an AWS service.
    */
  var Arn: arnType
}

object GenerateServiceLastAccessedDetailsRequest {
  @scala.inline
  def apply(Arn: arnType): GenerateServiceLastAccessedDetailsRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsRequest]
  }
}

