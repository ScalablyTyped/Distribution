package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSolutionVersionResponse extends js.Object {
  /**
    * The solution version.
    */
  var solutionVersion: js.UndefOr[SolutionVersion] = js.native
}

object DescribeSolutionVersionResponse {
  @scala.inline
  def apply(solutionVersion: SolutionVersion = null): DescribeSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (solutionVersion != null) __obj.updateDynamic("solutionVersion")(solutionVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSolutionVersionResponse]
  }
}

