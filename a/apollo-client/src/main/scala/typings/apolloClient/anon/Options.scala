package typings.apolloClient.anon

import typings.apolloClient.queryManagerMod.QueryManager
import typings.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TVariables] extends js.Object {
  var options: WatchQueryOptions[TVariables] = js.native
  var queryManager: QueryManager[_] = js.native
  var shouldSubscribe: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply[TVariables](options: WatchQueryOptions[TVariables], queryManager: QueryManager[_]): Options[TVariables] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TVariables]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], TVariables] (val x: Self with Options[TVariables]) extends AnyVal {
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
    def setOptions(value: WatchQueryOptions[TVariables]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryManager(value: QueryManager[_]): Self = this.set("queryManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldSubscribe(value: Boolean): Self = this.set("shouldSubscribe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldSubscribe: Self = this.set("shouldSubscribe", js.undefined)
  }
  
}

