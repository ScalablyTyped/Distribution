package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindObjectOptions extends js.Object {
  /**
    * If the underlying find object options should paginate
    * over a search method.
    */
  val paginate: js.UndefOr[Boolean] = js.undefined
  /**
    * The query used by the underlying find object to
    * find the object.
    */
  val query: js.UndefOr[String] = js.undefined
}

object FindObjectOptions {
  @scala.inline
  def apply(paginate: js.UndefOr[Boolean] = js.undefined, query: String = null): FindObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindObjectOptions]
  }
}

