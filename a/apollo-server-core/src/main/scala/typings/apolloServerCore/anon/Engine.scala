package typings.apolloServerCore.anon

import typings.apolloServerCore.typesMod.GraphQLServiceEngineConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  var engine: js.UndefOr[GraphQLServiceEngineConfig] = js.native
}

object Engine {
  @scala.inline
  def apply(): Engine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
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
    def setEngine(value: GraphQLServiceEngineConfig): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
  }
  
}

