package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityTypesListItem extends js.Object {
  /**
    * Entity type of an item on an entity type list.
    */
  var Type: EntityTypeName
}

object EntityTypesListItem {
  @scala.inline
  def apply(Type: EntityTypeName): EntityTypesListItem = {
    val __obj = js.Dynamic.literal(Type = Type)
  
    __obj.asInstanceOf[EntityTypesListItem]
  }
}

