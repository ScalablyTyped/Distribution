package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileFactoryMetadata extends CompileIdentifierMetadata {
  var diDeps: js.Array[CompileDiDependencyMetadata] = js.native
}

object CompileFactoryMetadata {
  @scala.inline
  def apply(diDeps: js.Array[CompileDiDependencyMetadata], reference: js.Any): CompileFactoryMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileFactoryMetadata]
  }
  @scala.inline
  implicit class CompileFactoryMetadataOps[Self <: CompileFactoryMetadata] (val x: Self) extends AnyVal {
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
    def setDiDepsVarargs(value: CompileDiDependencyMetadata*): Self = this.set("diDeps", js.Array(value :_*))
    @scala.inline
    def setDiDeps(value: js.Array[CompileDiDependencyMetadata]): Self = this.set("diDeps", value.asInstanceOf[js.Any])
  }
  
}

