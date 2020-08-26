package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterateOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.native
  var probability: js.UndefOr[Double] = js.native
}

object IterateOptions {
  @scala.inline
  def apply(): IterateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterateOptions]
  }
  @scala.inline
  implicit class IterateOptionsOps[Self <: IterateOptions] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setProbability(value: Double): Self = this.set("probability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProbability: Self = this.set("probability", js.undefined)
  }
  
}

