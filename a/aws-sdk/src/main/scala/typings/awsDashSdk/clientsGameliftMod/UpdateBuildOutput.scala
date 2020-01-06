package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBuildOutput extends js.Object {
  /**
    * The updated build record.
    */
  var Build: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Build] = js.native
}

object UpdateBuildOutput {
  @scala.inline
  def apply(Build: Build = null): UpdateBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (Build != null) __obj.updateDynamic("Build")(Build.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBuildOutput]
  }
}

