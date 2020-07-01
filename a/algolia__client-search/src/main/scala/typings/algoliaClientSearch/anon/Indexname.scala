package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indexname extends js.Object {
  /**
    * Index name of the query.
    */
  val index_name: String
  /**
    * The offset of the query.
    */
  val offset: js.UndefOr[Double] = js.undefined
  /**
    * Query ID of the query.
    */
  val query_id: js.UndefOr[String] = js.undefined
  /**
    * The user token of the query.
    */
  val user_token: js.UndefOr[String] = js.undefined
}

object Indexname {
  @scala.inline
  def apply(
    index_name: String,
    offset: js.UndefOr[Double] = js.undefined,
    query_id: String = null,
    user_token: String = null
  ): Indexname = {
    val __obj = js.Dynamic.literal(index_name = index_name.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (query_id != null) __obj.updateDynamic("query_id")(query_id.asInstanceOf[js.Any])
    if (user_token != null) __obj.updateDynamic("user_token")(user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indexname]
  }
}

