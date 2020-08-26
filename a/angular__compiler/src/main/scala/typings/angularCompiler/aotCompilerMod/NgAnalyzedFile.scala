package typings.angularCompiler.aotCompilerMod

import typings.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgAnalyzedFile extends js.Object {
  var abstractDirectives: js.Array[StaticSymbol] = js.native
  var directives: js.Array[StaticSymbol] = js.native
  var exportsNonSourceFiles: Boolean = js.native
  var fileName: String = js.native
  var injectables: js.Array[CompileInjectableMetadata] = js.native
  var ngModules: js.Array[CompileNgModuleMetadata] = js.native
  var pipes: js.Array[StaticSymbol] = js.native
}

object NgAnalyzedFile {
  @scala.inline
  def apply(
    abstractDirectives: js.Array[StaticSymbol],
    directives: js.Array[StaticSymbol],
    exportsNonSourceFiles: Boolean,
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    ngModules: js.Array[CompileNgModuleMetadata],
    pipes: js.Array[StaticSymbol]
  ): NgAnalyzedFile = {
    val __obj = js.Dynamic.literal(abstractDirectives = abstractDirectives.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], exportsNonSourceFiles = exportsNonSourceFiles.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedFile]
  }
  @scala.inline
  implicit class NgAnalyzedFileOps[Self <: NgAnalyzedFile] (val x: Self) extends AnyVal {
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
    def setAbstractDirectivesVarargs(value: StaticSymbol*): Self = this.set("abstractDirectives", js.Array(value :_*))
    @scala.inline
    def setAbstractDirectives(value: js.Array[StaticSymbol]): Self = this.set("abstractDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: StaticSymbol*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[StaticSymbol]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportsNonSourceFiles(value: Boolean): Self = this.set("exportsNonSourceFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInjectablesVarargs(value: CompileInjectableMetadata*): Self = this.set("injectables", js.Array(value :_*))
    @scala.inline
    def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = this.set("injectables", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModulesVarargs(value: CompileNgModuleMetadata*): Self = this.set("ngModules", js.Array(value :_*))
    @scala.inline
    def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = this.set("ngModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipesVarargs(value: StaticSymbol*): Self = this.set("pipes", js.Array(value :_*))
    @scala.inline
    def setPipes(value: js.Array[StaticSymbol]): Self = this.set("pipes", value.asInstanceOf[js.Any])
  }
  
}

