package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECSService extends js.Object {
  /**
    *  The name of the cluster that the Amazon ECS service is associated with. 
    */
  var clusterName: js.UndefOr[ECSClusterName] = js.undefined
  /**
    *  The name of the target Amazon ECS service. 
    */
  var serviceName: js.UndefOr[ECSServiceName] = js.undefined
}

object ECSService {
  @scala.inline
  def apply(clusterName: ECSClusterName = null, serviceName: ECSServiceName = null): ECSService = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[ECSService]
  }
}

