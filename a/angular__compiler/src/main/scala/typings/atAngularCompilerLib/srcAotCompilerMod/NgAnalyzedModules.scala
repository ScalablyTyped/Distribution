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

