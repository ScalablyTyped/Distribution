package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateActionTargetRequest extends js.Object {
  /**
    * The description for the custom action target.
    */
  var Description: NonEmptyString = js.native
  /**
    * The ID for the custom action target.
    */
  var Id: NonEmptyString = js.native
  /**
    * The name of the custom action target.
    */
  var Name: NonEmptyString = js.native
}

object CreateActionTargetRequest {
  @scala.inline
  def apply(Description: NonEmptyString, Id: NonEmptyString, Name: NonEmptyString): CreateActionTargetRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateActionTargetRequest]
  }
}

