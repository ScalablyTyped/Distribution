package typings.angularCompilerCli.anon

import typings.angularCompilerCli.transformersApiMod.EmitFlags
import typings.angularCompilerCli.transformersApiMod.TsEmitArguments
import typings.angularCompilerCli.transformersApiMod.TsEmitCallback
import typings.angularCompilerCli.transformersApiMod.TsMergeEmitResultsCallback
import typings.typescript.mod.EmitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationToken extends StObject {
  
  var cancellationToken: js.UndefOr[typings.typescript.mod.CancellationToken] = js.undefined
  
  var customTransformers: js.UndefOr[typings.angularCompilerCli.transformersApiMod.CustomTransformers] = js.undefined
  
  var emitCallback: js.UndefOr[TsEmitCallback] = js.undefined
  
  var emitFlags: js.UndefOr[EmitFlags] = js.undefined
  
  var forceEmit: js.UndefOr[Boolean] = js.undefined
  
  var mergeEmitResultsCallback: js.UndefOr[TsMergeEmitResultsCallback] = js.undefined
}
object CancellationToken {
  
  inline def apply(): CancellationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancellationToken]
  }
  
  extension [Self <: CancellationToken](x: Self) {
    
    inline def setCancellationToken(value: typings.typescript.mod.CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
    
    inline def setCancellationTokenUndefined: Self = StObject.set(x, "cancellationToken", js.undefined)
    
    inline def setCustomTransformers(value: typings.angularCompilerCli.transformersApiMod.CustomTransformers): Self = StObject.set(x, "customTransformers", value.asInstanceOf[js.Any])
    
    inline def setCustomTransformersUndefined: Self = StObject.set(x, "customTransformers", js.undefined)
    
    inline def setEmitCallback(value: /* args */ TsEmitArguments => EmitResult): Self = StObject.set(x, "emitCallback", js.Any.fromFunction1(value))
    
    inline def setEmitCallbackUndefined: Self = StObject.set(x, "emitCallback", js.undefined)
    
    inline def setEmitFlags(value: EmitFlags): Self = StObject.set(x, "emitFlags", value.asInstanceOf[js.Any])
    
    inline def setEmitFlagsUndefined: Self = StObject.set(x, "emitFlags", js.undefined)
    
    inline def setForceEmit(value: Boolean): Self = StObject.set(x, "forceEmit", value.asInstanceOf[js.Any])
    
    inline def setForceEmitUndefined: Self = StObject.set(x, "forceEmit", js.undefined)
    
    inline def setMergeEmitResultsCallback(value: /* results */ js.Array[EmitResult] => EmitResult): Self = StObject.set(x, "mergeEmitResultsCallback", js.Any.fromFunction1(value))
    
    inline def setMergeEmitResultsCallbackUndefined: Self = StObject.set(x, "mergeEmitResultsCallback", js.undefined)
  }
}
