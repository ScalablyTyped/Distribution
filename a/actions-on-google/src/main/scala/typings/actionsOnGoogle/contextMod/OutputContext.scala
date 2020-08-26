package typings.actionsOnGoogle.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputContext[TParameters /* <: Parameters */] extends js.Object {
  /** @public */
  var lifespan: Double = js.native
  /** @public */
  var parameters: js.UndefOr[TParameters] = js.native
}

object OutputContext {
  @scala.inline
  def apply[/* <: typings.actionsOnGoogle.contextMod.Parameters */ TParameters](lifespan: Double): OutputContext[TParameters] = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputContext[TParameters]]
  }
  @scala.inline
  implicit class OutputContextOps[Self <: OutputContext[_], /* <: typings.actionsOnGoogle.contextMod.Parameters */ TParameters] (val x: Self with OutputContext[TParameters]) extends AnyVal {
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
    def setLifespan(value: Double): Self = this.set("lifespan", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: TParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

