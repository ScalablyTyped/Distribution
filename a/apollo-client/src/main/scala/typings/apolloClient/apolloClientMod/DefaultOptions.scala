package typings.apolloClient.apolloClientMod

import typings.apolloClient.anon.PartialMutationOptionskey
import typings.apolloClient.anon.PartialQueryOptionsOperat
import typings.apolloClient.anon.PartialWatchQueryOptionsO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[PartialMutationOptionskey] = js.native
  var query: js.UndefOr[PartialQueryOptionsOperat] = js.native
  var watchQuery: js.UndefOr[PartialWatchQueryOptionsO] = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
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
    def setMutate(value: PartialMutationOptionskey): Self = this.set("mutate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutate: Self = this.set("mutate", js.undefined)
    @scala.inline
    def setQuery(value: PartialQueryOptionsOperat): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setWatchQuery(value: PartialWatchQueryOptionsO): Self = this.set("watchQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchQuery: Self = this.set("watchQuery", js.undefined)
  }
  
}

