package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBuildOutput extends js.Object {
  /**
    * Information about the build.
    */
  var build: js.UndefOr[Build] = js.undefined
}

object StopBuildOutput {
  @scala.inline
  def apply(build: Build = null): StopBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build)
    __obj.asInstanceOf[StopBuildOutput]
  }
}

