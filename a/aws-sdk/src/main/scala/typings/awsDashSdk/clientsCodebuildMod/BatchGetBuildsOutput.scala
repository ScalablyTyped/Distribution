package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetBuildsOutput extends js.Object {
  /**
    * Information about the requested builds.
    */
  var builds: js.UndefOr[Builds] = js.native
  /**
    * The IDs of builds for which information could not be found.
    */
  var buildsNotFound: js.UndefOr[BuildIds] = js.native
}

object BatchGetBuildsOutput {
  @scala.inline
  def apply(builds: Builds = null, buildsNotFound: BuildIds = null): BatchGetBuildsOutput = {
    val __obj = js.Dynamic.literal()
    if (builds != null) __obj.updateDynamic("builds")(builds.asInstanceOf[js.Any])
    if (buildsNotFound != null) __obj.updateDynamic("buildsNotFound")(buildsNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBuildsOutput]
  }
}

