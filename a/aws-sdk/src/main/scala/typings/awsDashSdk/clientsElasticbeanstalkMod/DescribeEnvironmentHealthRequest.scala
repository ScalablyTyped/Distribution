package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentHealthRequest extends js.Object {
  /**
    * Specify the response elements to return. To retrieve all attributes, set to All. If no attribute names are specified, returns the name of the environment.
    */
  var AttributeNames: js.UndefOr[EnvironmentHealthAttributes] = js.undefined
  /**
    * Specify the environment by ID. You must specify either this or an EnvironmentName, or both.
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * Specify the environment by name. You must specify either this or an EnvironmentName, or both.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
}

object DescribeEnvironmentHealthRequest {
  @scala.inline
  def apply(
    AttributeNames: EnvironmentHealthAttributes = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null
  ): DescribeEnvironmentHealthRequest = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames)
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    __obj.asInstanceOf[DescribeEnvironmentHealthRequest]
  }
}

