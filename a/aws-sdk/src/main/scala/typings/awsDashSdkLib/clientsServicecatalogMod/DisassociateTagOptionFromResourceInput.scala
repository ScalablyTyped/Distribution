package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateTagOptionFromResourceInput extends js.Object {
  /**
    * The resource identifier.
    */
  var ResourceId: awsDashSdkLib.clientsServicecatalogMod.ResourceId
  /**
    * The TagOption identifier.
    */
  var TagOptionId: awsDashSdkLib.clientsServicecatalogMod.TagOptionId
}

object DisassociateTagOptionFromResourceInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): DisassociateTagOptionFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagOptionId = TagOptionId)
  
    __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
  }
}

