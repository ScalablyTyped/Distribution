package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "R3TargetBinder")
@js.native
open class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected ()
  extends StObject
     with TargetBinder[DirectiveT] {
  def this(directiveMatcher: SelectorMatcher[js.Array[DirectiveT]]) = this()
  
  /* CompleteClass */
  override def bind(target: Target): BoundTarget[DirectiveT] = js.native
  
  /* private */ var directiveMatcher: Any = js.native
}
