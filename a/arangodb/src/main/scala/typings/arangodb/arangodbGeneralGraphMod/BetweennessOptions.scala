package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BetweennessOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[EdgeDirection] = js.native
  var weight: js.UndefOr[String] = js.native
}

object BetweennessOptions {
  @scala.inline
  def apply(): BetweennessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BetweennessOptions]
  }
  @scala.inline
  implicit class BetweennessOptionsOps[Self <: BetweennessOptions] (val x: Self) extends AnyVal {
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
    def setDefaultWeight(value: Double): Self = this.set("defaultWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWeight: Self = this.set("defaultWeight", js.undefined)
    @scala.inline
    def setDirection(value: EdgeDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

