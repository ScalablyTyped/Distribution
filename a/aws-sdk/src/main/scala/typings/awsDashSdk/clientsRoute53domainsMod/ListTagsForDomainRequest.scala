package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to get a list of tags.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
}

object ListTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): ListTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[ListTagsForDomainRequest]
  }
}

