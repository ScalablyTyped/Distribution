package typings.acmeClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Production extends js.Object {
  var production: String = js.native
  var staging: String = js.native
}

object Production {
  @scala.inline
  def apply(production: String, staging: String): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], staging = staging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
  @scala.inline
  implicit class ProductionOps[Self <: Production] (val x: Self) extends AnyVal {
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
    def setProduction(value: String): Self = this.set("production", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaging(value: String): Self = this.set("staging", value.asInstanceOf[js.Any])
  }
  
}

