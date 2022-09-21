package typings.angularCompilerCli

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceGraphMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point/src/reference_graph", "ReferenceGraph")
  @js.native
  open class ReferenceGraph[T] () extends StObject {
    
    def add(from: T, to: T): Unit = js.native
    
    /* private */ var collectPathFrom: Any = js.native
    
    /* private */ var collectTransitiveReferences: Any = js.native
    
    def pathFrom(source: T, target: T): js.Array[T] | Null = js.native
    
    /* private */ var references: Any = js.native
    
    def transitiveReferencesOf(target: T): Set[T] = js.native
  }
}
