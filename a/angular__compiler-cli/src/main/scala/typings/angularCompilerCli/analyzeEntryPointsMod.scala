package typings.angularCompilerCli

import typings.angularCompilerCli.apiMod.AnalyzeEntryPointsFn
import typings.angularCompilerCli.entryPointMod.EntryPointJsonProperty
import typings.angularCompilerCli.interfaceMod.EntryPointFinder
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.srcTypesMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyzeEntryPointsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/analyze_entry_points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnalyzeEntryPointsFn(
    logger: Logger,
    finder: EntryPointFinder,
    fileSystem: FileSystem,
    supportedPropertiesToConsider: js.Array[EntryPointJsonProperty],
    typingsOnly: Boolean,
    compileAllFormats: Boolean,
    propertiesToConsider: js.Array[String],
    inParallel: Boolean
  ): AnalyzeEntryPointsFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyzeEntryPointsFn")(logger.asInstanceOf[js.Any], finder.asInstanceOf[js.Any], fileSystem.asInstanceOf[js.Any], supportedPropertiesToConsider.asInstanceOf[js.Any], typingsOnly.asInstanceOf[js.Any], compileAllFormats.asInstanceOf[js.Any], propertiesToConsider.asInstanceOf[js.Any], inParallel.asInstanceOf[js.Any])).asInstanceOf[AnalyzeEntryPointsFn]
}
