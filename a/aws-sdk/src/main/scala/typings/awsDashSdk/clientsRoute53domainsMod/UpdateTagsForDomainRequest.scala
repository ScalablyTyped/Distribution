package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to add or update tags.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
  /**
    * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the corresponding value will be replaced.
    */
  var TagsToUpdate: js.UndefOr[TagList] = js.undefined
}

object UpdateTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, TagsToUpdate: TagList = null): UpdateTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (TagsToUpdate != null) __obj.updateDynamic("TagsToUpdate")(TagsToUpdate)
    __obj.asInstanceOf[UpdateTagsForDomainRequest]
  }
}

