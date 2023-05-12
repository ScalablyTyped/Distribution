package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.angularCompilerCli.srcTransformersApiMod.EmitFlags
import typings.angularCompilerCli.srcTransformersApiMod.TsEmitArguments
import typings.angularCompilerCli.srcTransformersApiMod.TsEmitCallback
import typings.angularCompilerCli.srcTransformersApiMod.TsMergeEmitResultsCallback
import typings.std.Set
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.EmitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTransformers[CbEmitRes /* <: EmitResult */] extends StObject {
  
  var customTransformers: js.UndefOr[typings.angularCompilerCli.srcTransformersApiMod.CustomTransformers] = js.undefined
  
  var emitCallback: js.UndefOr[TsEmitCallback[CbEmitRes]] = js.undefined
  
  var emitFlags: js.UndefOr[EmitFlags] = js.undefined
  
  var forceEmit: js.UndefOr[Boolean] = js.undefined
  
  var gatherDiagnostics: js.UndefOr[
    js.Function1[
      /* program */ typings.angularCompilerCli.srcTransformersApiMod.Program, 
      js.Array[Diagnostic]
    ]
  ] = js.undefined
  
  var host: js.UndefOr[CompilerHost] = js.undefined
  
  var mergeEmitResultsCallback: js.UndefOr[TsMergeEmitResultsCallback[CbEmitRes]] = js.undefined
  
  var modifiedResourceFiles: js.UndefOr[Set[String] | Null] = js.undefined
  
  var oldProgram: js.UndefOr[typings.angularCompilerCli.srcTransformersApiMod.Program] = js.undefined
  
  var options: CompilerOptions
  
  var rootNames: js.Array[String]
}
object CustomTransformers {
  
  inline def apply[CbEmitRes /* <: EmitResult */](options: CompilerOptions, rootNames: js.Array[String]): CustomTransformers[CbEmitRes] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTransformers[CbEmitRes]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomTransformers[?], CbEmitRes /* <: EmitResult */] (val x: Self & CustomTransformers[CbEmitRes]) extends AnyVal {
    
    inline def setCustomTransformers(value: typings.angularCompilerCli.srcTransformersApiMod.CustomTransformers): Self = StObject.set(x, "customTransformers", value.asInstanceOf[js.Any])
    
    inline def setCustomTransformersUndefined: Self = StObject.set(x, "customTransformers", js.undefined)
    
    inline def setEmitCallback(value: /* args */ TsEmitArguments => CbEmitRes): Self = StObject.set(x, "emitCallback", js.Any.fromFunction1(value))
    
    inline def setEmitCallbackUndefined: Self = StObject.set(x, "emitCallback", js.undefined)
    
    inline def setEmitFlags(value: EmitFlags): Self = StObject.set(x, "emitFlags", value.asInstanceOf[js.Any])
    
    inline def setEmitFlagsUndefined: Self = StObject.set(x, "emitFlags", js.undefined)
    
    inline def setForceEmit(value: Boolean): Self = StObject.set(x, "forceEmit", value.asInstanceOf[js.Any])
    
    inline def setForceEmitUndefined: Self = StObject.set(x, "forceEmit", js.undefined)
    
    inline def setGatherDiagnostics(
      value: /* program */ typings.angularCompilerCli.srcTransformersApiMod.Program => js.Array[Diagnostic]
    ): Self = StObject.set(x, "gatherDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGatherDiagnosticsUndefined: Self = StObject.set(x, "gatherDiagnostics", js.undefined)
    
    inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setMergeEmitResultsCallback(value: /* results */ js.Array[CbEmitRes] => CbEmitRes): Self = StObject.set(x, "mergeEmitResultsCallback", js.Any.fromFunction1(value))
    
    inline def setMergeEmitResultsCallbackUndefined: Self = StObject.set(x, "mergeEmitResultsCallback", js.undefined)
    
    inline def setModifiedResourceFiles(value: Set[String]): Self = StObject.set(x, "modifiedResourceFiles", value.asInstanceOf[js.Any])
    
    inline def setModifiedResourceFilesNull: Self = StObject.set(x, "modifiedResourceFiles", null)
    
    inline def setModifiedResourceFilesUndefined: Self = StObject.set(x, "modifiedResourceFiles", js.undefined)
    
    inline def setOldProgram(value: typings.angularCompilerCli.srcTransformersApiMod.Program): Self = StObject.set(x, "oldProgram", value.asInstanceOf[js.Any])
    
    inline def setOldProgramUndefined: Self = StObject.set(x, "oldProgram", js.undefined)
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRootNames(value: js.Array[String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
    
    inline def setRootNamesVarargs(value: String*): Self = StObject.set(x, "rootNames", js.Array(value*))
  }
}
