package typings.angularCompilerCli

import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeParameterEmitterMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_parameter_emitter", "TypeParameterEmitter")
  @js.native
  open class TypeParameterEmitter protected () extends StObject {
    def this(typeParameters: Unit, reflector: ReflectionHost) = this()
    def this(typeParameters: NodeArray[TypeParameterDeclaration], reflector: ReflectionHost) = this()
    
    /**
      * Determines whether the type parameters can be emitted. If this returns true, then a call to
      * `emit` is known to succeed. Vice versa, if false is returned then `emit` should not be
      * called, as it would fail.
      */
    def canEmit(canEmitReference: js.Function1[/* ref */ Reference[Node], Boolean]): Boolean = js.native
    
    /* private */ var canEmitType: Any = js.native
    
    /**
      * Emits the type parameters using the provided emitter function for `Reference`s.
      */
    def emit(emitReference: js.Function1[/* ref */ Reference[Node], TypeNode]): js.UndefOr[js.Array[TypeParameterDeclaration]] = js.native
    
    /* private */ var isLocalTypeParameter: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    /* private */ var resolveTypeReference: Any = js.native
    
    /* private */ var translateTypeReference: Any = js.native
    
    /* private */ var typeParameters: Any = js.native
  }
}
