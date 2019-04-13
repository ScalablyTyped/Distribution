package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to delete one or more tags.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
  /**
    * A list of tag keys to delete.
    */
  var TagsToDelete: TagKeyList
}

object DeleteTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, TagsToDelete: TagKeyList): DeleteTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, TagsToDelete = TagsToDelete)
  
    __obj.asInstanceOf[DeleteTagsForDomainRequest]
  }
}

