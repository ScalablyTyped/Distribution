package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relationship extends js.Object {
  /**
    * An array of IDs for related blocks. You can get the type of the relationship from the Type element.
    */
  var Ids: js.UndefOr[IdList] = js.undefined
  /**
    * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be VALUE or CHILD.
    */
  var Type: js.UndefOr[RelationshipType] = js.undefined
}

object Relationship {
  @scala.inline
  def apply(Ids: IdList = null, Type: RelationshipType = null): Relationship = {
    val __obj = js.Dynamic.literal()
    if (Ids != null) __obj.updateDynamic("Ids")(Ids)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
}

