package typings.angularCompilerCli

import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompilerCli.angularCompilerCliStrings.invalid
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcInjectableRegistryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/injectable_registry", "InjectableClassRegistry")
  @js.native
  open class InjectableClassRegistry protected () extends StObject {
    def this(host: ReflectionHost, isCore: Boolean) = this()
    
    /* private */ var classes: Any = js.native
    
    def getInjectableMeta(declaration: ClassDeclarationDeclarati): InjectableMeta | Null = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var isCore: Any = js.native
    
    def registerInjectable(declaration: ClassDeclarationDeclarati, meta: InjectableMeta): Unit = js.native
  }
  
  trait InjectableMeta extends StObject {
    
    var ctorDeps: js.Array[R3DependencyMetadata] | invalid | Null
  }
  object InjectableMeta {
    
    inline def apply(): InjectableMeta = {
      val __obj = js.Dynamic.literal(ctorDeps = null)
      __obj.asInstanceOf[InjectableMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectableMeta] (val x: Self) extends AnyVal {
      
      inline def setCtorDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "ctorDeps", value.asInstanceOf[js.Any])
      
      inline def setCtorDepsNull: Self = StObject.set(x, "ctorDeps", null)
      
      inline def setCtorDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "ctorDeps", js.Array(value*))
    }
  }
}
