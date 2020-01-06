package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentsOutput extends js.Object {
  /**
    *  Information about the deployments. 
    */
  var deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.native
}

object BatchGetDeploymentsOutput {
  @scala.inline
  def apply(deploymentsInfo: DeploymentsInfoList = null): BatchGetDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentsInfo != null) __obj.updateDynamic("deploymentsInfo")(deploymentsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentsOutput]
  }
}

