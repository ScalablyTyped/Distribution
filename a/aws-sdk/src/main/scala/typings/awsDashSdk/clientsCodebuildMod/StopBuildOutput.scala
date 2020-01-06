package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBuildOutput extends js.Object {
  /**
    * Information about the build.
    */
  var build: js.UndefOr[Build] = js.native
}

object StopBuildOutput {
  @scala.inline
  def apply(build: Build = null): StopBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBuildOutput]
  }
}

