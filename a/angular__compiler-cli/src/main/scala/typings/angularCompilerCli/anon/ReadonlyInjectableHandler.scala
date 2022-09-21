package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompiler.mod.R3InjectableMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.invalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/src/injectable.InjectableHandlerData> */
trait ReadonlyInjectableHandler extends StObject {
  
  val classMetadata: js.UndefOr[R3ClassMetadata | Null] = js.undefined
  
  val ctorDeps: js.UndefOr[js.Array[R3DependencyMetadata] | invalid | Null] = js.undefined
  
  val meta: R3InjectableMetadata
  
  val needsFactory: Boolean
}
object ReadonlyInjectableHandler {
  
  inline def apply(meta: R3InjectableMetadata, needsFactory: Boolean): ReadonlyInjectableHandler = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], needsFactory = needsFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyInjectableHandler]
  }
  
  extension [Self <: ReadonlyInjectableHandler](x: Self) {
    
    inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
    
    inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
    
    inline def setClassMetadataUndefined: Self = StObject.set(x, "classMetadata", js.undefined)
    
    inline def setCtorDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "ctorDeps", value.asInstanceOf[js.Any])
    
    inline def setCtorDepsNull: Self = StObject.set(x, "ctorDeps", null)
    
    inline def setCtorDepsUndefined: Self = StObject.set(x, "ctorDeps", js.undefined)
    
    inline def setCtorDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "ctorDeps", js.Array(value*))
    
    inline def setMeta(value: R3InjectableMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setNeedsFactory(value: Boolean): Self = StObject.set(x, "needsFactory", value.asInstanceOf[js.Any])
  }
}
