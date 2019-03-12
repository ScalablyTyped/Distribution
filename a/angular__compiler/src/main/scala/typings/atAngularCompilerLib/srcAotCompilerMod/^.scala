package typings
package atAngularCompilerLib.srcAotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def analyzeAndValidateNgModules(
    fileNames: js.Array[java.lang.String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  def analyzeFile(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): NgAnalyzedFile = js.native
  def analyzeFileForInjectables(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): NgAnalyzedFileWithInjectables = js.native
  def analyzeNgModules(
    fileNames: js.Array[java.lang.String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  def mergeAnalyzedFiles(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

