package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleQueriesOptions extends js.Object {
  val strategy: js.UndefOr[StrategyType] = js.native
}

object MultipleQueriesOptions {
  @scala.inline
  def apply(): MultipleQueriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleQueriesOptions]
  }
  @scala.inline
  implicit class MultipleQueriesOptionsOps[Self <: MultipleQueriesOptions] (val x: Self) extends AnyVal {
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
    def setStrategy(value: StrategyType): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

