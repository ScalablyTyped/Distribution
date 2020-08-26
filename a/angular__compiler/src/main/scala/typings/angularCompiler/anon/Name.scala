package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var name: String = js.native
  var pure: Boolean = js.native
  var `type`: CompileTypeMetadata = js.native
}

object Name {
  @scala.inline
  def apply(name: String, pure: Boolean, `type`: CompileTypeMetadata): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

