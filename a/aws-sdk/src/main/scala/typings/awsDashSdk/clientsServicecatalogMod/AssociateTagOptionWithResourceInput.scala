package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateTagOptionWithResourceInput extends js.Object {
  /**
    * The resource identifier.
    */
  var ResourceId: typings.awsDashSdk.clientsServicecatalogMod.ResourceId
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsDashSdk.clientsServicecatalogMod.TagOptionId
}

object AssociateTagOptionWithResourceInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): AssociateTagOptionWithResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagOptionId = TagOptionId)
  
    __obj.asInstanceOf[AssociateTagOptionWithResourceInput]
  }
}

