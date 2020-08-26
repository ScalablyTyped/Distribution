package typings.apolloClient.watchQueryOptionsMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchQueryOptions[TVariables] extends ModifiableWatchQueryOptions[TVariables] {
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
}

object WatchQueryOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): WatchQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchQueryOptions[TVariables]]
  }
  @scala.inline
  implicit class WatchQueryOptionsOps[Self <: WatchQueryOptions[_], TVariables] (val x: Self with WatchQueryOptions[TVariables]) extends AnyVal {
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
    def setFetchPolicy(value: WatchQueryFetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
  }
  
}

