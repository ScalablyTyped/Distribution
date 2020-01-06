package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityTypesListItem extends js.Object {
  /**
    * Entity type of an item on an entity type list.
    */
  var Type: EntityTypeName = js.native
}

object EntityTypesListItem {
  @scala.inline
  def apply(Type: EntityTypeName): EntityTypesListItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityTypesListItem]
  }
}

