package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBuildInput extends js.Object {
  /**
    * Unique identifier for a build to update.
    */
  var BuildId: awsDashSdkLib.clientsGameliftMod.BuildId
  /**
    * Descriptive label that is associated with a build. Build names do not need to be unique. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Version that is associated with this build. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object UpdateBuildInput {
  @scala.inline
  def apply(BuildId: BuildId, Name: NonZeroAndMaxString = null, Version: NonZeroAndMaxString = null): UpdateBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[UpdateBuildInput]
  }
}

