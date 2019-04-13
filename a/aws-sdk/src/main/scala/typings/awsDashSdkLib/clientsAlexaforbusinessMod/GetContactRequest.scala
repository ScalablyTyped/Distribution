package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContactRequest extends js.Object {
  /**
    * The ARN of the contact for which to request details.
    */
  var ContactArn: Arn
}

object GetContactRequest {
  @scala.inline
  def apply(ContactArn: Arn): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn)
  
    __obj.asInstanceOf[GetContactRequest]
  }
}

