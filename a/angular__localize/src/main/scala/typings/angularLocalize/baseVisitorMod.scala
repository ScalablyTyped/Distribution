package typings.angularLocalize

import typings.angularCompiler.mod.Attribute
import typings.angularCompiler.mod.Comment
import typings.angularCompiler.mod.Comment2
import typings.angularCompiler.mod.Element
import typings.angularCompiler.mod.Element2
import typings.angularCompiler.mod.Expansion
import typings.angularCompiler.mod.ExpansionCase
import typings.angularCompiler.mod.Text
import typings.angularCompiler.mod.Text2
import typings.angularCompiler.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseVisitorMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/base_visitor", "BaseVisitor")
  @js.native
  open class BaseVisitor ()
    extends StObject
       with Visitor {
    
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: Any): Any = js.native
    
    def visitComment(_comment: Comment, _context: Any): Any = js.native
    /* CompleteClass */
    override def visitComment(comment: Comment2, context: Any): Any = js.native
    
    def visitElement(_element: Element, _context: Any): Any = js.native
    /* CompleteClass */
    override def visitElement(element: Element2, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: Any): Any = js.native
    
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: Any): Any = js.native
    
    def visitText(_text: Text, _context: Any): Any = js.native
    /* CompleteClass */
    override def visitText(text: Text2, context: Any): Any = js.native
  }
}
