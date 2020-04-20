package typings.angularCompiler.compilerMod

import typings.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFile extends js.Object {
  var abstractDirectives: js.Array[StaticSymbol]
  var directives: js.Array[StaticSymbol]
  var exportsNonSourceFiles: Boolean
  var fileName: String
  var injectables: js.Array[CompileInjectableMetadata]
  var ngModules: js.Array[CompileNgModuleMetadata]
  var pipes: js.Array[StaticSymbol]
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
}

