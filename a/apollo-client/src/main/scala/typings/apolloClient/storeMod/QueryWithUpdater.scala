package typings.apolloClient.storeMod

import typings.apolloClient.AnonMutationResult
import typings.apolloClient.queriesMod.QueryStoreValue
import typings.apolloClient.typesMod.MutationQueryReducer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryWithUpdater extends js.Object {
  var query: QueryStoreValue
  var updater: MutationQueryReducer[js.Object]
}

object QueryWithUpdater {
  @scala.inline
  def apply(
    query: QueryStoreValue,
    updater: (/* previousResult */ Record[String, js.Any], /* options */ AnonMutationResult[js.Object]) => Record[String, js.Any]
  ): QueryWithUpdater = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], updater = js.Any.fromFunction2(updater))
  
    __obj.asInstanceOf[QueryWithUpdater]
  }
}

