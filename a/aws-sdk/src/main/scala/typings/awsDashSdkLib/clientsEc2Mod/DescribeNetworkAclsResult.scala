package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNetworkAclsResult extends js.Object {
  /**
    * Information about one or more network ACLs.
    */
  var NetworkAcls: js.UndefOr[NetworkAclList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeNetworkAclsResult {
  @scala.inline
  def apply(NetworkAcls: NetworkAclList = null, NextToken: String = null): DescribeNetworkAclsResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkAcls != null) __obj.updateDynamic("NetworkAcls")(NetworkAcls)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNetworkAclsResult]
  }
}

