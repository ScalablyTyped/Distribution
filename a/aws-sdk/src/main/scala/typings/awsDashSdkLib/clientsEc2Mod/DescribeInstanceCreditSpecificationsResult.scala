package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceCreditSpecificationsResult extends js.Object {
  /**
    * Information about the credit option for CPU usage of an instance.
    */
  var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeInstanceCreditSpecificationsResult {
  @scala.inline
  def apply(InstanceCreditSpecifications: InstanceCreditSpecificationList = null, NextToken: String = null): DescribeInstanceCreditSpecificationsResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceCreditSpecifications != null) __obj.updateDynamic("InstanceCreditSpecifications")(InstanceCreditSpecifications)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstanceCreditSpecificationsResult]
  }
}

