package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectEntitiesItemResult extends js.Object {
  /**
    * One or more Entity objects, one for each entity detected in the document.
    */
  var Entities: js.UndefOr[ListOfEntities] = js.undefined
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
}

object BatchDetectEntitiesItemResult {
  @scala.inline
  def apply(Entities: ListOfEntities = null, Index: Int | scala.Double = null): BatchDetectEntitiesItemResult = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities)
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectEntitiesItemResult]
  }
}

