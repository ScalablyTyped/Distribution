package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResult extends js.Object {
  /**
    * The Elastic Beanstalk resource quotas associated with the calling AWS account.
    */
  var ResourceQuotas: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ResourceQuotas] = js.native
}

object DescribeAccountAttributesResult {
  @scala.inline
  def apply(ResourceQuotas: ResourceQuotas = null): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (ResourceQuotas != null) __obj.updateDynamic("ResourceQuotas")(ResourceQuotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
}

