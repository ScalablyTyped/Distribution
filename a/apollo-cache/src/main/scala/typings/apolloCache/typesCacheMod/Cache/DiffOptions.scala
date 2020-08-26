package typings.apolloCache.typesCacheMod.Cache

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffOptions
  extends ReadOptions[js.Any] {
  var returnPartialData: js.UndefOr[Boolean] = js.native
}

object DiffOptions {
  @scala.inline
  def apply(optimistic: Boolean, query: DocumentNode): DiffOptions = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
  @scala.inline
  implicit class DiffOptionsOps[Self <: DiffOptions] (val x: Self) extends AnyVal {
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
    def setReturnPartialData(value: Boolean): Self = this.set("returnPartialData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPartialData: Self = this.set("returnPartialData", js.undefined)
  }
  
}

