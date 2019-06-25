package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateActionTargetRequest extends js.Object {
  /**
    * The description for the custom action target.
    */
  var Description: NonEmptyString
  /**
    * The ID for the custom action target.
    */
  var Id: NonEmptyString
  /**
    * The name of the custom action target.
    */
  var Name: NonEmptyString
}

object CreateActionTargetRequest {
  @scala.inline
  def apply(Description: NonEmptyString, Id: NonEmptyString, Name: NonEmptyString): CreateActionTargetRequest = {
    val __obj = js.Dynamic.literal(Description = Description, Id = Id, Name = Name)
  
    __obj.asInstanceOf[CreateActionTargetRequest]
  }
}

