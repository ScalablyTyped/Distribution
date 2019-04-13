package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeletePhoneNumberRequest extends js.Object {
  /**
    * List of phone number IDs.
    */
  var PhoneNumberIds: NonEmptyStringList
}

object BatchDeletePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberIds: NonEmptyStringList): BatchDeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberIds = PhoneNumberIds)
  
    __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
  }
}

