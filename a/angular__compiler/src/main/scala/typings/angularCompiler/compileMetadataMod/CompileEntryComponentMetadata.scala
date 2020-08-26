package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileEntryComponentMetadata extends js.Object {
  var componentFactory: StaticSymbol | js.Object = js.native
  var componentType: js.Any = js.native
}

object CompileEntryComponentMetadata {
  @scala.inline
  def apply(componentFactory: StaticSymbol | js.Object, componentType: js.Any): CompileEntryComponentMetadata = {
    val __obj = js.Dynamic.literal(componentFactory = componentFactory.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileEntryComponentMetadata]
  }
  @scala.inline
  implicit class CompileEntryComponentMetadataOps[Self <: CompileEntryComponentMetadata] (val x: Self) extends AnyVal {
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
    def setComponentFactory(value: StaticSymbol | js.Object): Self = this.set("componentFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentType(value: js.Any): Self = this.set("componentType", value.asInstanceOf[js.Any])
  }
  
}

