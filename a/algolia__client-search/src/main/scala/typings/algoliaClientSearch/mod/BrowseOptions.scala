package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseOptions[TObject] extends js.Object {
  /**
    * The callback called for each batch of objects.
    */
  val batch: js.UndefOr[js.Function1[/* batch */ js.Array[TObject with ObjectWithObjectID], _]] = js.undefined
}

object BrowseOptions {
  @scala.inline
  def apply[TObject](batch: /* batch */ js.Array[TObject with ObjectWithObjectID] => _ = null): BrowseOptions[TObject] = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1(batch))
    __obj.asInstanceOf[BrowseOptions[TObject]]
  }
}

