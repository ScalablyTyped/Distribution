package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsOutput extends js.Object {
  /**
    * A list of application names.
    */
  var applications: js.UndefOr[ApplicationsList] = js.undefined
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list applications call to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListApplicationsOutput {
  @scala.inline
  def apply(applications: ApplicationsList = null, nextToken: NextToken = null): ListApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    if (applications != null) __obj.updateDynamic("applications")(applications)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListApplicationsOutput]
  }
}

