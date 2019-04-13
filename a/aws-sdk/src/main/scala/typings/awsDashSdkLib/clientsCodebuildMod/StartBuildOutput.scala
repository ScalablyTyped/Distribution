package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBuildOutput extends js.Object {
  /**
    * Information about the build to be run.
    */
  var build: js.UndefOr[Build] = js.undefined
}

object StartBuildOutput {
  @scala.inline
  def apply(build: Build = null): StartBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build)
    __obj.asInstanceOf[StartBuildOutput]
  }
}

