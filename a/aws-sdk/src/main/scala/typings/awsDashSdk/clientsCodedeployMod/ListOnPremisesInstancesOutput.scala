package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOnPremisesInstancesOutput extends js.Object {
  /**
    * The list of matching on-premises instance names.
    */
  var instanceNames: js.UndefOr[InstanceNameList] = js.undefined
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list on-premises instances call to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListOnPremisesInstancesOutput {
  @scala.inline
  def apply(instanceNames: InstanceNameList = null, nextToken: NextToken = null): ListOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (instanceNames != null) __obj.updateDynamic("instanceNames")(instanceNames)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListOnPremisesInstancesOutput]
  }
}

