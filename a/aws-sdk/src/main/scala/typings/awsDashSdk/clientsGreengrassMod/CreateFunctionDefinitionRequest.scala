package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFunctionDefinitionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * Information about the initial version of the function definition.
    */
  var InitialVersion: js.UndefOr[FunctionDefinitionVersion] = js.undefined
  /**
    * The name of the function definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateFunctionDefinitionRequest {
  @scala.inline
  def apply(
    AmznClientToken: __string = null,
    InitialVersion: FunctionDefinitionVersion = null,
    Name: __string = null,
    tags: Tags = null
  ): CreateFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (InitialVersion != null) __obj.updateDynamic("InitialVersion")(InitialVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateFunctionDefinitionRequest]
  }
}

