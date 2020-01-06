package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTagOptionFromResourceInput extends js.Object {
  /**
    * The resource identifier.
    */
  var ResourceId: typings.awsDashSdk.clientsServicecatalogMod.ResourceId = js.native
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsDashSdk.clientsServicecatalogMod.TagOptionId = js.native
}

object DisassociateTagOptionFromResourceInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): DisassociateTagOptionFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagOptionId = TagOptionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
  }
}

