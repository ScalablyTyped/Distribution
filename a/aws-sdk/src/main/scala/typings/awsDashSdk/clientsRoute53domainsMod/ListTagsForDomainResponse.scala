package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForDomainResponse extends js.Object {
  /**
    * A list of the tags that are associated with the specified domain.
    */
  var TagList: typings.awsDashSdk.clientsRoute53domainsMod.TagList
}

object ListTagsForDomainResponse {
  @scala.inline
  def apply(TagList: TagList): ListTagsForDomainResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList)
  
    __obj.asInstanceOf[ListTagsForDomainResponse]
  }
}

