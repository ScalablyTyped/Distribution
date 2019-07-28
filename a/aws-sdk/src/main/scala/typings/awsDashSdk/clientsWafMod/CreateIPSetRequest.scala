package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIPSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafMod.ChangeToken
  /**
    * A friendly name or description of the IPSet. You can't change Name after you create the IPSet.
    */
  var Name: ResourceName
}

object CreateIPSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, Name = Name)
  
    __obj.asInstanceOf[CreateIPSetRequest]
  }
}

