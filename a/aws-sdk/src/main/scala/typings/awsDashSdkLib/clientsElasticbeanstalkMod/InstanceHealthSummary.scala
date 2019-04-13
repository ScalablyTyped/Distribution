package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceHealthSummary extends js.Object {
  /**
    *  Red. The health agent is reporting a high number of request failures or other issues for an instance or environment.
    */
  var Degraded: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Green. An operation is in progress on an instance.
    */
  var Info: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
    */
  var NoData: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Green. An instance is passing health checks and the health agent is not reporting any problems.
    */
  var Ok: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Grey. An operation is in progress on an instance within the command timeout.
    */
  var Pending: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Red. The health agent is reporting a very high number of request failures or other issues for an instance or environment.
    */
  var Severe: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an instance.
    */
  var Unknown: js.UndefOr[NullableInteger] = js.undefined
  /**
    *  Yellow. The health agent is reporting a moderate number of request failures or other issues for an instance or environment.
    */
  var Warning: js.UndefOr[NullableInteger] = js.undefined
}

object InstanceHealthSummary {
  @scala.inline
  def apply(
    Degraded: js.UndefOr[NullableInteger] = js.undefined,
    Info: js.UndefOr[NullableInteger] = js.undefined,
    NoData: js.UndefOr[NullableInteger] = js.undefined,
    Ok: js.UndefOr[NullableInteger] = js.undefined,
    Pending: js.UndefOr[NullableInteger] = js.undefined,
    Severe: js.UndefOr[NullableInteger] = js.undefined,
    Unknown: js.UndefOr[NullableInteger] = js.undefined,
    Warning: js.UndefOr[NullableInteger] = js.undefined
  ): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Degraded)) __obj.updateDynamic("Degraded")(Degraded)
    if (!js.isUndefined(Info)) __obj.updateDynamic("Info")(Info)
    if (!js.isUndefined(NoData)) __obj.updateDynamic("NoData")(NoData)
    if (!js.isUndefined(Ok)) __obj.updateDynamic("Ok")(Ok)
    if (!js.isUndefined(Pending)) __obj.updateDynamic("Pending")(Pending)
    if (!js.isUndefined(Severe)) __obj.updateDynamic("Severe")(Severe)
    if (!js.isUndefined(Unknown)) __obj.updateDynamic("Unknown")(Unknown)
    if (!js.isUndefined(Warning)) __obj.updateDynamic("Warning")(Warning)
    __obj.asInstanceOf[InstanceHealthSummary]
  }
}

