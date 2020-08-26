package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata = js.native
  var summary: CompileTypeSummary = js.native
}

object Metadata {
  @scala.inline
  def apply(
    metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata,
    summary: CompileTypeSummary
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setMetadata(
      value: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: CompileTypeSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

