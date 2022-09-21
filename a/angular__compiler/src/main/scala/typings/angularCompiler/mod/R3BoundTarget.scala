package typings.angularCompiler.mod

import typings.angularCompiler.anon.Directive
import typings.std.Map
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "R3BoundTarget")
@js.native
open class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends StObject
     with BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[TmplAstElement | TmplAstTemplate, js.Array[DirectiveT]],
    bindings: Map[
        TmplAstBoundAttribute | TmplAstBoundEvent | TmplAstTextAttribute, 
        DirectiveT | TmplAstElement | TmplAstTemplate
      ],
    references: Map[
        TmplAstBoundAttribute | TmplAstBoundEvent | TmplAstReference | TmplAstTextAttribute, 
        Directive[DirectiveT] | TmplAstElement | TmplAstTemplate
      ],
    exprTargets: Map[AST, TmplAstReference | TmplAstVariable],
    symbols: Map[TmplAstReference | TmplAstVariable, TmplAstTemplate],
    nestingLevel: Map[TmplAstTemplate, Double],
    templateEntities: Map[TmplAstTemplate | Null, ReadonlySet[TmplAstReference | TmplAstVariable]],
    usedPipes: Set[String]
  ) = this()
  
  /* private */ var bindings: Any = js.native
  
  /* private */ var directives: Any = js.native
  
  /* private */ var exprTargets: Any = js.native
  
  /* private */ var nestingLevel: Any = js.native
  
  /* private */ var references: Any = js.native
  
  /* private */ var symbols: Any = js.native
  
  /* private */ var templateEntities: Any = js.native
  
  /* private */ var usedPipes: Any = js.native
}
