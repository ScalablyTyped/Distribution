package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesResult extends js.Object {
  /**
    * The Elastic Beanstalk resource quotas associated with the calling AWS account.
    */
  var ResourceQuotas: js.UndefOr[ResourceQuotas] = js.undefined
}

object DescribeAccountAttributesResult {
  @scala.inline
  def apply(ResourceQuotas: ResourceQuotas = null): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (ResourceQuotas != null) __obj.updateDynamic("ResourceQuotas")(ResourceQuotas)
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
}

