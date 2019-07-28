package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCloudFormationChangeSetResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the change set.Length constraints: Minimum length of 1.Pattern: ARN:[-a-zA-Z0-9:/]*
    */
  var ChangeSetId: js.UndefOr[__string] = js.undefined
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[__string] = js.undefined
}

object CreateCloudFormationChangeSetResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    ChangeSetId: __string = null,
    SemanticVersion: __string = null,
    StackId: __string = null
  ): CreateCloudFormationChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId)
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CreateCloudFormationChangeSetResponse]
  }
}

