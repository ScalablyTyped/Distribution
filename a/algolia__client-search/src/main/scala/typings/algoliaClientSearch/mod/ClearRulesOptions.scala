package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearRulesOptions extends js.Object {
  /**
    * If the clear rules request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.native
}

object ClearRulesOptions {
  @scala.inline
  def apply(): ClearRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearRulesOptions]
  }
  @scala.inline
  implicit class ClearRulesOptionsOps[Self <: ClearRulesOptions] (val x: Self) extends AnyVal {
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
    def setForwardToReplicas(value: Boolean): Self = this.set("forwardToReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardToReplicas: Self = this.set("forwardToReplicas", js.undefined)
  }
  
}

