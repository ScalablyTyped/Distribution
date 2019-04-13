package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBuildOutput extends js.Object {
  /**
    * Set of properties describing the requested build.
    */
  var Build: js.UndefOr[Build] = js.undefined
}

object DescribeBuildOutput {
  @scala.inline
  def apply(Build: Build = null): DescribeBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (Build != null) __obj.updateDynamic("Build")(Build)
    __obj.asInstanceOf[DescribeBuildOutput]
  }
}

