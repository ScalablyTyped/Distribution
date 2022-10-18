package typings.angularCompilerCli

import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTypeEmitterMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_emitter", "TypeEmitter")
  @js.native
  open class TypeEmitter protected () extends StObject {
    def this(translator: TypeReferenceTranslator) = this()
    
    def emitType(`type`: TypeNode): TypeNode = js.native
    
    /* private */ var emitTypeReference: Any = js.native
    
    /* private */ var translator: Any = js.native
  }
  
  inline def canEmitType(`type`: TypeNode, canEmit: js.Function1[/* type */ TypeReferenceNode, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canEmitType")(`type`.asInstanceOf[js.Any], canEmit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type TypeReferenceTranslator = js.Function1[/* type */ TypeReferenceNode, TypeReferenceNode | Null]
}
