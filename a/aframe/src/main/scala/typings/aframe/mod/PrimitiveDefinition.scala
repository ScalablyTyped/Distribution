package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimitiveDefinition extends js.Object {
  var defaultComponents: js.UndefOr[js.Any] = js.native
   // TODO cleanup type
  var deprecated: js.UndefOr[Boolean] = js.native
  var mappings: js.UndefOr[js.Any] = js.native
   // TODO cleanup type
  var transforms: js.UndefOr[js.Any] = js.native
}

object PrimitiveDefinition {
  @scala.inline
  def apply(): PrimitiveDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimitiveDefinition]
  }
  @scala.inline
  implicit class PrimitiveDefinitionOps[Self <: PrimitiveDefinition] (val x: Self) extends AnyVal {
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
    def setDefaultComponents(value: js.Any): Self = this.set("defaultComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultComponents: Self = this.set("defaultComponents", js.undefined)
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setMappings(value: js.Any): Self = this.set("mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMappings: Self = this.set("mappings", js.undefined)
    @scala.inline
    def setTransforms(value: js.Any): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

