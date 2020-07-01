package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseOptions[TObject] extends js.Object {
  /**
    * The callback called for each batch of objects.
    */
  val batch: js.UndefOr[js.Function1[/* batch */ js.Array[TObject with ObjectWithObjectID], _]] = js.undefined
  /**
    * The callback called to determine if the browse should stop. By
    * default this checks whether there's any more content to get.
    */
  val shouldStop: js.UndefOr[js.Function1[/* response */ BrowseResponse[TObject], Boolean]] = js.undefined
}

object BrowseOptions {
  @scala.inline
  def apply[TObject](
    batch: /* batch */ js.Array[TObject with ObjectWithObjectID] => _ = null,
    shouldStop: /* response */ BrowseResponse[TObject] => Boolean = null
  ): BrowseOptions[TObject] = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1(batch))
    if (shouldStop != null) __obj.updateDynamic("shouldStop")(js.Any.fromFunction1(shouldStop))
    __obj.asInstanceOf[BrowseOptions[TObject]]
  }
}

