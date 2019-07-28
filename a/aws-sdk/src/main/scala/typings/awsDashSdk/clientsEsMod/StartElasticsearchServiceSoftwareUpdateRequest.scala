package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartElasticsearchServiceSoftwareUpdateRequest extends js.Object {
  /**
    * The name of the domain that you want to update to the latest service software.
    */
  var DomainName: typings.awsDashSdk.clientsEsMod.DomainName
}

object StartElasticsearchServiceSoftwareUpdateRequest {
  @scala.inline
  def apply(DomainName: DomainName): StartElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateRequest]
  }
}

