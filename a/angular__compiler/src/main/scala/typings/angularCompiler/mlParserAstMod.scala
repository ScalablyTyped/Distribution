package typings.angularCompiler

import typings.angularCompiler.astPathMod.AstPath
import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mlParserAstMod {
  
  @JSImport("@angular/compiler/src/ml_parser/ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "Attribute")
  @js.native
  class Attribute protected () extends NodeWithI18n {
    def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: Unit, i18n: I18nMeta) = this()
    def this(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan,
      i18n: I18nMeta
    ) = this()
    
    var name: String = js.native
    
    var value: String = js.native
    
    var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "Comment")
  @js.native
  class Comment protected ()
    extends StObject
       with Node {
    def this(value: String, sourceSpan: ParseSourceSpan) = this()
    def this(value: Null, sourceSpan: ParseSourceSpan) = this()
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String | Null = js.native
    
    /* CompleteClass */
    override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "Element")
  @js.native
  class Element protected () extends NodeWithI18n {
    def this(
      name: String,
      attrs: js.Array[Attribute],
      children: js.Array[Node],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attrs: js.Array[Attribute],
      children: js.Array[Node],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attrs: js.Array[Attribute],
      children: js.Array[Node],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: Null,
      i18n: I18nMeta
    ) = this()
    def this(
      name: String,
      attrs: js.Array[Attribute],
      children: js.Array[Node],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: Unit,
      i18n: I18nMeta
    ) = this()
    def this(
      name: String,
      attrs: js.Array[Attribute],
      children: js.Array[Node],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan,
      i18n: I18nMeta
    ) = this()
    
    var attrs: js.Array[Attribute] = js.native
    
    var children: js.Array[Node] = js.native
    
    var endSourceSpan: ParseSourceSpan | Null = js.native
    
    var name: String = js.native
    
    var startSourceSpan: ParseSourceSpan = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "Expansion")
  @js.native
  class Expansion protected () extends NodeWithI18n {
    def this(
      switchValue: String,
      `type`: String,
      cases: js.Array[ExpansionCase],
      sourceSpan: ParseSourceSpan,
      switchValueSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      switchValue: String,
      `type`: String,
      cases: js.Array[ExpansionCase],
      sourceSpan: ParseSourceSpan,
      switchValueSourceSpan: ParseSourceSpan,
      i18n: I18nMeta
    ) = this()
    
    var cases: js.Array[ExpansionCase] = js.native
    
    var switchValue: String = js.native
    
    var switchValueSourceSpan: ParseSourceSpan = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "ExpansionCase")
  @js.native
  class ExpansionCase protected ()
    extends StObject
       with Node {
    def this(
      value: String,
      expression: js.Array[Node],
      sourceSpan: ParseSourceSpan,
      valueSourceSpan: ParseSourceSpan,
      expSourceSpan: ParseSourceSpan
    ) = this()
    
    var expSourceSpan: ParseSourceSpan = js.native
    
    var expression: js.Array[Node] = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    var valueSourceSpan: ParseSourceSpan = js.native
    
    /* CompleteClass */
    override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "NodeWithI18n")
  @js.native
  abstract class NodeWithI18n protected ()
    extends StObject
       with Node {
    def this(sourceSpan: ParseSourceSpan) = this()
    def this(sourceSpan: ParseSourceSpan, i18n: Message) = this()
    def this(sourceSpan: ParseSourceSpan, i18n: typings.angularCompiler.i18nAstMod.Node) = this()
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    /* CompleteClass */
    override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "RecursiveVisitor")
  @js.native
  class RecursiveVisitor ()
    extends StObject
       with Visitor {
    
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
    
    /* private */ var visitChildren: js.Any = js.native
    
    /* CompleteClass */
    override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitElement(element: Element, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitText(text: Text, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/ast", "Text")
  @js.native
  class Text protected () extends NodeWithI18n {
    def this(value: String, sourceSpan: ParseSourceSpan) = this()
    def this(value: String, sourceSpan: ParseSourceSpan, i18n: I18nMeta) = this()
    
    var value: String = js.native
  }
  
  inline def findNode(nodes: js.Array[Node], position: Double): HtmlAstPath = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(nodes.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[HtmlAstPath]
  
  inline def visitAll(visitor: Visitor, nodes: js.Array[Node]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def visitAll(visitor: Visitor, nodes: js.Array[Node], context: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  type HtmlAstPath = AstPath[Node]
  
  trait Node extends StObject {
    
    var sourceSpan: ParseSourceSpan
    
    def visit(visitor: Visitor, context: js.Any): js.Any
  }
  object Node {
    
    inline def apply(sourceSpan: ParseSourceSpan, visit: (Visitor, js.Any) => js.Any): Node = {
      val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
      
      inline def setVisit(value: (Visitor, js.Any) => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    }
  }
  
  trait Visitor extends StObject {
    
    var visit: js.UndefOr[js.Function2[/* node */ Node, /* context */ js.Any, js.Any]] = js.undefined
    
    def visitAttribute(attribute: Attribute, context: js.Any): js.Any
    
    def visitComment(comment: Comment, context: js.Any): js.Any
    
    def visitElement(element: Element, context: js.Any): js.Any
    
    def visitExpansion(expansion: Expansion, context: js.Any): js.Any
    
    def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any
    
    def visitText(text: Text, context: js.Any): js.Any
  }
  object Visitor {
    
    inline def apply(
      visitAttribute: (Attribute, js.Any) => js.Any,
      visitComment: (Comment, js.Any) => js.Any,
      visitElement: (Element, js.Any) => js.Any,
      visitExpansion: (Expansion, js.Any) => js.Any,
      visitExpansionCase: (ExpansionCase, js.Any) => js.Any,
      visitText: (Text, js.Any) => js.Any
    ): Visitor = {
      val __obj = js.Dynamic.literal(visitAttribute = js.Any.fromFunction2(visitAttribute), visitComment = js.Any.fromFunction2(visitComment), visitElement = js.Any.fromFunction2(visitElement), visitExpansion = js.Any.fromFunction2(visitExpansion), visitExpansionCase = js.Any.fromFunction2(visitExpansionCase), visitText = js.Any.fromFunction2(visitText))
      __obj.asInstanceOf[Visitor]
    }
    
    extension [Self <: Visitor](x: Self) {
      
      inline def setVisit(value: (/* node */ Node, /* context */ js.Any) => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
      
      inline def setVisitAttribute(value: (Attribute, js.Any) => js.Any): Self = StObject.set(x, "visitAttribute", js.Any.fromFunction2(value))
      
      inline def setVisitComment(value: (Comment, js.Any) => js.Any): Self = StObject.set(x, "visitComment", js.Any.fromFunction2(value))
      
      inline def setVisitElement(value: (Element, js.Any) => js.Any): Self = StObject.set(x, "visitElement", js.Any.fromFunction2(value))
      
      inline def setVisitExpansion(value: (Expansion, js.Any) => js.Any): Self = StObject.set(x, "visitExpansion", js.Any.fromFunction2(value))
      
      inline def setVisitExpansionCase(value: (ExpansionCase, js.Any) => js.Any): Self = StObject.set(x, "visitExpansionCase", js.Any.fromFunction2(value))
      
      inline def setVisitText(value: (Text, js.Any) => js.Any): Self = StObject.set(x, "visitText", js.Any.fromFunction2(value))
      
      inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
    }
  }
}
