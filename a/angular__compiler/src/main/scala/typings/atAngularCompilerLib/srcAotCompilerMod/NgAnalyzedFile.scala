package typings
package atAngularCompilerLib.srcAotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFile extends js.Object {
  var directives: js.Array[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol]
  var exportsNonSourceFiles: scala.Boolean
  var fileName: java.lang.String
  var injectables: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata]
  var ngModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata]
  var pipes: js.Array[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol]
}

object NgAnalyzedFile {
  @scala.inline
  def apply(
    directives: js.Array[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    exportsNonSourceFiles: scala.Boolean,
    fileName: java.lang.String,
    injectables: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata],
    ngModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata],
    pipes: js.Array[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol]
  ): NgAnalyzedFile = {
    val __obj = js.Dynamic.literal(directives = directives, exportsNonSourceFiles = exportsNonSourceFiles, fileName = fileName, injectables = injectables, ngModules = ngModules, pipes = pipes)
  
    __obj.asInstanceOf[NgAnalyzedFile]
  }
}

