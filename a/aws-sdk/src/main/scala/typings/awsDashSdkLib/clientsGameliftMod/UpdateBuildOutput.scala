package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBuildOutput extends js.Object {
  /**
    * Object that contains the updated build record.
    */
  var Build: js.UndefOr[Build] = js.undefined
}

object UpdateBuildOutput {
  @scala.inline
  def apply(Build: Build = null): UpdateBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (Build != null) __obj.updateDynamic("Build")(Build)
    __obj.asInstanceOf[UpdateBuildOutput]
  }
}

