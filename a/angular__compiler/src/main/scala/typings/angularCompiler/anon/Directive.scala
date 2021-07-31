package typings.angularCompiler.anon

import typings.angularCompiler.r3AstMod.Element
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.t2ApiMod.DirectiveMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive[DirectiveT /* <: DirectiveMeta */] extends StObject {
  
  var directive: DirectiveT
  
  var node: Element | Template
}
object Directive {
  
  @scala.inline
  def apply[DirectiveT /* <: DirectiveMeta */](directive: DirectiveT, node: Element | Template): Directive[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive[DirectiveT]]
  }
  
  @scala.inline
  implicit class DirectiveMutableBuilder[Self <: Directive[?], DirectiveT /* <: DirectiveMeta */] (val x: Self & Directive[DirectiveT]) extends AnyVal {
    
    @scala.inline
    def setDirective(value: DirectiveT): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Element | Template): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
