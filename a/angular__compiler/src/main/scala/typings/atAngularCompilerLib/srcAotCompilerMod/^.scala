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
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules = js.native
  def analyzeFile(
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFile = js.native
  def analyzeFileForInjectables(
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFileWithInjectables = js.native
  def analyzeNgModules(
    fileNames: js.Array[java.lang.String],
    host: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules = js.native
  def mergeAnalyzedFiles(analyzedFiles: js.Array[atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFile]): atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules = js.native
}

