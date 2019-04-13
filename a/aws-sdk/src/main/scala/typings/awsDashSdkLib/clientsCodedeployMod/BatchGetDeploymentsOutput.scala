package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentsOutput extends js.Object {
  /**
    *  Information about the deployments. 
    */
  var deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined
}

object BatchGetDeploymentsOutput {
  @scala.inline
  def apply(deploymentsInfo: DeploymentsInfoList = null): BatchGetDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentsInfo != null) __obj.updateDynamic("deploymentsInfo")(deploymentsInfo)
    __obj.asInstanceOf[BatchGetDeploymentsOutput]
  }
}

