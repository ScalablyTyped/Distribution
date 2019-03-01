package typings
package atAngularCompilerLib.srcAotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedModules extends js.Object {
  var files: js.Array[NgAnalyzedFile]
  var ngModuleByPipeOrDirective: stdLib.Map[
    atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol, 
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
  ]
  var ngModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata]
  var symbolsMissingModule: js.UndefOr[js.Array[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol]] = js.undefined
}

object NgAnalyzedModules {
  @scala.inline
  def apply(
    files: js.Array[NgAnalyzedFile],
    ngModuleByPipeOrDirective: stdLib.Map[
      atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol, 
      atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
    ],
    ngModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata],
    symbolsMissingModule: js.Array[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol] = null
  ): NgAnalyzedModules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("ngModuleByPipeOrDirective")(ngModuleByPipeOrDirective)
    __obj.updateDynamic("ngModules")(ngModules)
    if (symbolsMissingModule != null) __obj.updateDynamic("symbolsMissingModule")(symbolsMissingModule)
    __obj.asInstanceOf[NgAnalyzedModules]
  }
}

