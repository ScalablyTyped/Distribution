package typings.apolloClient.storeMod

import typings.apolloClient.anon.MutationResult
import typings.apolloClient.queriesMod.QueryStoreValue
import typings.apolloClient.typesMod.MutationQueryReducer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithUpdater extends js.Object {
  var query: QueryStoreValue = js.native
  var updater: MutationQueryReducer[js.Object] = js.native
}

object QueryWithUpdater {
  @scala.inline
  def apply(
    query: QueryStoreValue,
    updater: (/* previousResult */ Record[String, js.Any], /* options */ MutationResult[js.Object]) => Record[String, js.Any]
  ): QueryWithUpdater = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], updater = js.Any.fromFunction2(updater))
    __obj.asInstanceOf[QueryWithUpdater]
  }
  @scala.inline
  implicit class QueryWithUpdaterOps[Self <: QueryWithUpdater] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuery(value: QueryStoreValue): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdater(
      value: (/* previousResult */ Record[String, js.Any], /* options */ MutationResult[js.Object]) => Record[String, js.Any]
    ): Self = this.set("updater", js.Any.fromFunction2(value))
  }
  
}

