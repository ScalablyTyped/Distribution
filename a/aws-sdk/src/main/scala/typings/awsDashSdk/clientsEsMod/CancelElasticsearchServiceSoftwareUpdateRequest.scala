package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
  /**
    * The name of the domain that you want to stop the latest service software update on.
    */
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName
}

object CancelElasticsearchServiceSoftwareUpdateRequest {
  @scala.inline
  def apply(DomainName: DomainName): CancelElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
  }
}

