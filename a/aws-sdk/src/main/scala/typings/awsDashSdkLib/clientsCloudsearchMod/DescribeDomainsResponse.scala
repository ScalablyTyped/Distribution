package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDomainsResponse extends js.Object {
  var DomainStatusList: awsDashSdkLib.clientsCloudsearchMod.DomainStatusList
}

object DescribeDomainsResponse {
  @scala.inline
  def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList)
  
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
}

