package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1Context extends js.Object {
  var lifespan: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.native
}

object DialogflowV1Context {
  @scala.inline
  def apply(): DialogflowV1Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Context]
  }
  @scala.inline
  implicit class DialogflowV1ContextOps[Self <: DialogflowV1Context] (val x: Self) extends AnyVal {
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
    def deleteLifespan: Self = this.set("lifespan", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParameters(value: DialogflowV1Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

