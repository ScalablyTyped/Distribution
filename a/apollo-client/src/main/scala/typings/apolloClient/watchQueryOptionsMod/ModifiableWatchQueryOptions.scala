package typings.apolloClient.watchQueryOptionsMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifiableWatchQueryOptions[TVariables] extends QueryBaseOptions[TVariables] {
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.native
  var pollInterval: js.UndefOr[Double] = js.native
  var returnPartialData: js.UndefOr[Boolean] = js.native
}

object ModifiableWatchQueryOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): ModifiableWatchQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiableWatchQueryOptions[TVariables]]
  }
  @scala.inline
  implicit class ModifiableWatchQueryOptionsOps[Self <: ModifiableWatchQueryOptions[_], TVariables] (val x: Self with ModifiableWatchQueryOptions[TVariables]) extends AnyVal {
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
    def setNotifyOnNetworkStatusChange(value: Boolean): Self = this.set("notifyOnNetworkStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyOnNetworkStatusChange: Self = this.set("notifyOnNetworkStatusChange", js.undefined)
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    @scala.inline
    def setReturnPartialData(value: Boolean): Self = this.set("returnPartialData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPartialData: Self = this.set("returnPartialData", js.undefined)
  }
  
}

