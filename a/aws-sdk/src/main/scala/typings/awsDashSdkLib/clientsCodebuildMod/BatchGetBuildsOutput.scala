package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetBuildsOutput extends js.Object {
  /**
    * Information about the requested builds.
    */
  var builds: js.UndefOr[Builds] = js.undefined
  /**
    * The IDs of builds for which information could not be found.
    */
  var buildsNotFound: js.UndefOr[BuildIds] = js.undefined
}

object BatchGetBuildsOutput {
  @scala.inline
  def apply(builds: Builds = null, buildsNotFound: BuildIds = null): BatchGetBuildsOutput = {
    val __obj = js.Dynamic.literal()
    if (builds != null) __obj.updateDynamic("builds")(builds)
    if (buildsNotFound != null) __obj.updateDynamic("buildsNotFound")(buildsNotFound)
    __obj.asInstanceOf[BatchGetBuildsOutput]
  }
}

