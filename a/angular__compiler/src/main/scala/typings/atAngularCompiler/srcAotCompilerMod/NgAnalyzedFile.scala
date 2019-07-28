package typings.atAngularCompiler.srcAotCompilerMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFile extends js.Object {
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
    directives: js.Array[StaticSymbol],
    exportsNonSourceFiles: Boolean,
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    ngModules: js.Array[CompileNgModuleMetadata],
    pipes: js.Array[StaticSymbol]
  ): NgAnalyzedFile = {
    val __obj = js.Dynamic.literal(directives = directives, exportsNonSourceFiles = exportsNonSourceFiles, fileName = fileName, injectables = injectables, ngModules = ngModules, pipes = pipes)
  
    __obj.asInstanceOf[NgAnalyzedFile]
  }
}

