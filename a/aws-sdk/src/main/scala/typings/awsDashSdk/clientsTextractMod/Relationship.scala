package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relationship extends js.Object {
  /**
    * An array of IDs for related blocks. You can get the type of the relationship from the Type element.
    */
  var Ids: js.UndefOr[IdList] = js.native
  /**
    * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be VALUE or CHILD. A relationship of type VALUE is a list that contains the ID of the VALUE block that's associated with the KEY of a key-value pair. A relationship of type CHILD is a list of IDs that identify WORD blocks.
    */
  var Type: js.UndefOr[RelationshipType] = js.native
}

object Relationship {
  @scala.inline
  def apply(Ids: IdList = null, Type: RelationshipType = null): Relationship = {
    val __obj = js.Dynamic.literal()
    if (Ids != null) __obj.updateDynamic("Ids")(Ids.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
}

