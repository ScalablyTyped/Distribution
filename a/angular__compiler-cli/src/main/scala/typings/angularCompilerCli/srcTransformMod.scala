package typings.angularCompilerCli

import typings.angularCompilerCli.compilationMod.TraitCompiler
import typings.angularCompilerCli.ngtscImportsMod.DefaultImportTracker
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcCoreMod.ImportRewriter
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ivyTransformFactory(
    compilation: TraitCompiler,
    reflector: ReflectionHost,
    importRewriter: ImportRewriter,
    defaultImportTracker: DefaultImportTracker,
    perf: PerfRecorder,
    isCore: Boolean,
    isClosureCompilerEnabled: Boolean
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("ivyTransformFactory")(compilation.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], defaultImportTracker.asInstanceOf[js.Any], perf.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isClosureCompilerEnabled.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
