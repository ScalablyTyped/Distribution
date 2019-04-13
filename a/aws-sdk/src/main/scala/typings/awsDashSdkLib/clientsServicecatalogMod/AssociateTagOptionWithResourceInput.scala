package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateTagOptionWithResourceInput extends js.Object {
  /**
    * The resource identifier.
    */
  var ResourceId: awsDashSdkLib.clientsServicecatalogMod.ResourceId
  /**
    * The TagOption identifier.
    */
  var TagOptionId: awsDashSdkLib.clientsServicecatalogMod.TagOptionId
}

object AssociateTagOptionWithResourceInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): AssociateTagOptionWithResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagOptionId = TagOptionId)
  
    __obj.asInstanceOf[AssociateTagOptionWithResourceInput]
  }
}

