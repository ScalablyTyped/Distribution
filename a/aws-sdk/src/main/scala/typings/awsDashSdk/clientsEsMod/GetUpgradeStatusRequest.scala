package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUpgradeStatusRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName
}

object GetUpgradeStatusRequest {
  @scala.inline
  def apply(DomainName: DomainName): GetUpgradeStatusRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[GetUpgradeStatusRequest]
  }
}

