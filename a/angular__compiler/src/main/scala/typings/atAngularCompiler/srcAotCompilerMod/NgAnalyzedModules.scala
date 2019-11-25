package typings.atAngularCompiler.srcAotCompilerMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedModules extends js.Object {
  var files: js.Array[NgAnalyzedFile]
  var ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata]
  var ngModules: js.Array[CompileNgModuleMetadata]
  var symbolsMissingModule: js.UndefOr[js.Array[StaticSymbol]] = js.undefined
}

object NgAnalyzedModules {
  @scala.inline
  def apply(
    files: js.Array[NgAnalyzedFile],
    ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata],
    ngModules: js.Array[CompileNgModuleMetadata],
    symbolsMissingModule: js.Array[StaticSymbol] = null
  ): NgAnalyzedModules = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], ngModuleByPipeOrDirective = ngModuleByPipeOrDirective.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any])
    if (symbolsMissingModule != null) __obj.updateDynamic("symbolsMissingModule")(symbolsMissingModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedModules]
  }
}

