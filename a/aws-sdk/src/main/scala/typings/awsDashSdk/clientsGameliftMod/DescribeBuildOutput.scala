package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBuildOutput extends js.Object {
  /**
    * Set of properties describing the requested build.
    */
  var Build: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Build] = js.native
}

object DescribeBuildOutput {
  @scala.inline
  def apply(Build: Build = null): DescribeBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (Build != null) __obj.updateDynamic("Build")(Build.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBuildOutput]
  }
}

