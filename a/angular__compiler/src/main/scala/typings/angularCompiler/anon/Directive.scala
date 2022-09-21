package typings.angularCompiler.anon

import typings.angularCompiler.mod.DirectiveMeta
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive[DirectiveT /* <: DirectiveMeta */] extends StObject {
  
  var directive: DirectiveT
  
  var node: TmplAstElement | TmplAstTemplate
}
object Directive {
  
  inline def apply[DirectiveT /* <: DirectiveMeta */](directive: DirectiveT, node: TmplAstElement | TmplAstTemplate): Directive[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive[DirectiveT]]
  }
  
  extension [Self <: Directive[?], DirectiveT /* <: DirectiveMeta */](x: Self & Directive[DirectiveT]) {
    
    inline def setDirective(value: DirectiveT): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setNode(value: TmplAstElement | TmplAstTemplate): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
