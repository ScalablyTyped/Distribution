package typings
package awsDashSdkLib.clientsComprehendMod

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
  def apply(Entities: ListOfEntities = null, Index: js.UndefOr[Integer] = js.undefined): BatchDetectEntitiesItemResult = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities)
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    __obj.asInstanceOf[BatchDetectEntitiesItemResult]
  }
}

