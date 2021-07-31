package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.BindingType
import typings.angularCompiler.astMod.BoundElementProperty
import typings.angularCompiler.astMod.ParsedEvent
import typings.angularCompiler.astMod.ParsedEventType
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3AstMod {
  
  @JSImport("@angular/compiler/src/render3/r3_ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
  @js.native
  class BoundAttribute protected ()
    extends StObject
       with Node {
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: String,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: Null,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: String,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: Null,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: String,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: Unit,
      i18n: I18nMeta
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: String,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan,
      i18n: I18nMeta
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: Null,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: Unit,
      i18n: I18nMeta
    ) = this()
    def this(
      name: String,
      `type`: BindingType,
      securityContext: SecurityContext,
      value: AST,
      unit: Null,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan,
      i18n: I18nMeta
    ) = this()
    
    var i18n: js.UndefOr[I18nMeta] = js.native
    
    val keySpan: ParseSourceSpan = js.native
    
    var name: String = js.native
    
    var securityContext: SecurityContext = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var `type`: BindingType = js.native
    
    var unit: String | Null = js.native
    
    var value: AST = js.native
    
    var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  /* static members */
  object BoundAttribute {
    
    @JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromBoundElementProperty(prop: BoundElementProperty): BoundAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundElementProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[BoundAttribute]
    @scala.inline
    def fromBoundElementProperty(prop: BoundElementProperty, i18n: I18nMeta): BoundAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundElementProperty")(prop.asInstanceOf[js.Any], i18n.asInstanceOf[js.Any])).asInstanceOf[BoundAttribute]
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "BoundEvent")
  @js.native
  class BoundEvent protected ()
    extends StObject
       with Node {
    def this(
      name: String,
      `type`: ParsedEventType,
      handler: AST,
      target: String,
      phase: String,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: ParsedEventType,
      handler: AST,
      target: String,
      phase: Null,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: ParsedEventType,
      handler: AST,
      target: Null,
      phase: String,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: ParsedEventType,
      handler: AST,
      target: Null,
      phase: Null,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    
    var handler: AST = js.native
    
    var handlerSpan: ParseSourceSpan = js.native
    
    var name: String = js.native
    
    var phase: String | Null = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var target: String | Null = js.native
    
    var `type`: ParsedEventType = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  /* static members */
  object BoundEvent {
    
    @JSImport("@angular/compiler/src/render3/r3_ast", "BoundEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromParsedEvent(event: ParsedEvent): BoundEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParsedEvent")(event.asInstanceOf[js.Any]).asInstanceOf[BoundEvent]
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "BoundText")
  @js.native
  class BoundText protected ()
    extends StObject
       with Node {
    def this(value: AST, sourceSpan: ParseSourceSpan) = this()
    def this(value: AST, sourceSpan: ParseSourceSpan, i18n: Message) = this()
    def this(value: AST, sourceSpan: ParseSourceSpan, i18n: typings.angularCompiler.i18nAstMod.Node) = this()
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: AST = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Content")
  @js.native
  class Content protected ()
    extends StObject
       with Node {
    def this(selector: String, attributes: js.Array[TextAttribute], sourceSpan: ParseSourceSpan) = this()
    def this(selector: String, attributes: js.Array[TextAttribute], sourceSpan: ParseSourceSpan, i18n: Message) = this()
    def this(
      selector: String,
      attributes: js.Array[TextAttribute],
      sourceSpan: ParseSourceSpan,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    
    var attributes: js.Array[TextAttribute] = js.native
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    val name: /* "ng-content" */ String = js.native
    
    var selector: String = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Element")
  @js.native
  class Element protected ()
    extends StObject
       with Node {
    def this(
      name: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      children: js.Array[Node],
      references: js.Array[Reference],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      children: js.Array[Node],
      references: js.Array[Reference],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      children: js.Array[Node],
      references: js.Array[Reference],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: Null,
      i18n: Message
    ) = this()
    def this(
      name: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      children: js.Array[Node],
      references: js.Array[Reference],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: Null,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    def this(
      name: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      children: js.Array[Node],
      references: js.Array[Reference],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan,
      i18n: Message
    ) = this()
    def this(
      name: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      children: js.Array[Node],
      references: js.Array[Reference],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    
    var attributes: js.Array[TextAttribute] = js.native
    
    var children: js.Array[Node] = js.native
    
    var endSourceSpan: ParseSourceSpan | Null = js.native
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    var inputs: js.Array[BoundAttribute] = js.native
    
    var name: String = js.native
    
    var outputs: js.Array[BoundEvent] = js.native
    
    var references: js.Array[Reference] = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var startSourceSpan: ParseSourceSpan = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Icu")
  @js.native
  class Icu protected ()
    extends StObject
       with Node {
    def this(
      vars: StringDictionary[BoundText],
      placeholders: StringDictionary[Text | BoundText],
      sourceSpan: ParseSourceSpan
    ) = this()
    def this(
      vars: StringDictionary[BoundText],
      placeholders: StringDictionary[Text | BoundText],
      sourceSpan: ParseSourceSpan,
      i18n: Message
    ) = this()
    def this(
      vars: StringDictionary[BoundText],
      placeholders: StringDictionary[Text | BoundText],
      sourceSpan: ParseSourceSpan,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    var placeholders: StringDictionary[Text | BoundText] = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var vars: StringDictionary[BoundText] = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "NullVisitor")
  @js.native
  class NullVisitor ()
    extends StObject
       with Visitor[Unit] {
    
    /* CompleteClass */
    override def visitBoundAttribute(attribute: BoundAttribute): Unit = js.native
    
    /* CompleteClass */
    override def visitBoundEvent(attribute: BoundEvent): Unit = js.native
    
    /* CompleteClass */
    override def visitBoundText(text: BoundText): Unit = js.native
    
    /* CompleteClass */
    override def visitContent(content: Content): Unit = js.native
    
    /* CompleteClass */
    override def visitElement(element: Element): Unit = js.native
    
    /* CompleteClass */
    override def visitIcu(icu: Icu): Unit = js.native
    
    /* CompleteClass */
    override def visitReference(reference: Reference): Unit = js.native
    
    /* CompleteClass */
    override def visitTemplate(template: Template): Unit = js.native
    
    /* CompleteClass */
    override def visitText(text: Text): Unit = js.native
    
    /* CompleteClass */
    override def visitTextAttribute(attribute: TextAttribute): Unit = js.native
    
    /* CompleteClass */
    override def visitVariable(variable: Variable): Unit = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "RecursiveVisitor")
  @js.native
  class RecursiveVisitor ()
    extends StObject
       with Visitor[Unit] {
    
    /* CompleteClass */
    override def visitBoundAttribute(attribute: BoundAttribute): Unit = js.native
    
    /* CompleteClass */
    override def visitBoundEvent(attribute: BoundEvent): Unit = js.native
    
    /* CompleteClass */
    override def visitBoundText(text: BoundText): Unit = js.native
    
    /* CompleteClass */
    override def visitContent(content: Content): Unit = js.native
    
    /* CompleteClass */
    override def visitElement(element: Element): Unit = js.native
    
    /* CompleteClass */
    override def visitIcu(icu: Icu): Unit = js.native
    
    /* CompleteClass */
    override def visitReference(reference: Reference): Unit = js.native
    
    /* CompleteClass */
    override def visitTemplate(template: Template): Unit = js.native
    
    /* CompleteClass */
    override def visitText(text: Text): Unit = js.native
    
    /* CompleteClass */
    override def visitTextAttribute(attribute: TextAttribute): Unit = js.native
    
    /* CompleteClass */
    override def visitVariable(variable: Variable): Unit = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Reference")
  @js.native
  class Reference protected ()
    extends StObject
       with Node {
    def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
    
    var name: String = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Template")
  @js.native
  class Template protected ()
    extends StObject
       with Node {
    def this(
      tagName: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      templateAttrs: js.Array[BoundAttribute | TextAttribute],
      children: js.Array[Node],
      references: js.Array[Reference],
      variables: js.Array[Variable],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      tagName: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      templateAttrs: js.Array[BoundAttribute | TextAttribute],
      children: js.Array[Node],
      references: js.Array[Reference],
      variables: js.Array[Variable],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      tagName: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      templateAttrs: js.Array[BoundAttribute | TextAttribute],
      children: js.Array[Node],
      references: js.Array[Reference],
      variables: js.Array[Variable],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: Null,
      i18n: Message
    ) = this()
    def this(
      tagName: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      templateAttrs: js.Array[BoundAttribute | TextAttribute],
      children: js.Array[Node],
      references: js.Array[Reference],
      variables: js.Array[Variable],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: Null,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    def this(
      tagName: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      templateAttrs: js.Array[BoundAttribute | TextAttribute],
      children: js.Array[Node],
      references: js.Array[Reference],
      variables: js.Array[Variable],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan,
      i18n: Message
    ) = this()
    def this(
      tagName: String,
      attributes: js.Array[TextAttribute],
      inputs: js.Array[BoundAttribute],
      outputs: js.Array[BoundEvent],
      templateAttrs: js.Array[BoundAttribute | TextAttribute],
      children: js.Array[Node],
      references: js.Array[Reference],
      variables: js.Array[Variable],
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    
    var attributes: js.Array[TextAttribute] = js.native
    
    var children: js.Array[Node] = js.native
    
    var endSourceSpan: ParseSourceSpan | Null = js.native
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    var inputs: js.Array[BoundAttribute] = js.native
    
    var outputs: js.Array[BoundEvent] = js.native
    
    var references: js.Array[Reference] = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var startSourceSpan: ParseSourceSpan = js.native
    
    var tagName: String = js.native
    
    var templateAttrs: js.Array[BoundAttribute | TextAttribute] = js.native
    
    var variables: js.Array[Variable] = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Text")
  @js.native
  class Text protected ()
    extends StObject
       with Node {
    def this(value: String, sourceSpan: ParseSourceSpan) = this()
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "TextAttribute")
  @js.native
  class TextAttribute protected ()
    extends StObject
       with Node {
    def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: Unit, i18n: Message) = this()
    def this(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      valueSpan: Unit,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    def this(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan,
      i18n: Message
    ) = this()
    def this(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan,
      i18n: typings.angularCompiler.i18nAstMod.Node
    ) = this()
    
    var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
    
    var name: String = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "TransformVisitor")
  @js.native
  class TransformVisitor ()
    extends StObject
       with Visitor[Node] {
    
    /* CompleteClass */
    override def visitBoundAttribute(attribute: BoundAttribute): Node = js.native
    
    /* CompleteClass */
    override def visitBoundEvent(attribute: BoundEvent): Node = js.native
    
    /* CompleteClass */
    override def visitBoundText(text: BoundText): Node = js.native
    
    /* CompleteClass */
    override def visitContent(content: Content): Node = js.native
    
    /* CompleteClass */
    override def visitElement(element: Element): Node = js.native
    
    /* CompleteClass */
    override def visitIcu(icu: Icu): Node = js.native
    
    /* CompleteClass */
    override def visitReference(reference: Reference): Node = js.native
    
    /* CompleteClass */
    override def visitTemplate(template: Template): Node = js.native
    
    /* CompleteClass */
    override def visitText(text: Text): Node = js.native
    
    /* CompleteClass */
    override def visitTextAttribute(attribute: TextAttribute): Node = js.native
    
    /* CompleteClass */
    override def visitVariable(variable: Variable): Node = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_ast", "Variable")
  @js.native
  class Variable protected ()
    extends StObject
       with Node {
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, keySpan: ParseSourceSpan) = this()
    def this(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      keySpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan
    ) = this()
    
    val keySpan: ParseSourceSpan = js.native
    
    var name: String = js.native
    
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
    
    /* CompleteClass */
    override def visit[Result](visitor: Visitor[Result]): Result = js.native
  }
  
  @scala.inline
  def transformAll[Result /* <: Node */](visitor: Visitor[Node], nodes: js.Array[Result]): js.Array[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  
  @scala.inline
  def visitAll[Result](visitor: Visitor[Result], nodes: js.Array[Node]): js.Array[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  
  trait Node extends StObject {
    
    var sourceSpan: ParseSourceSpan
    
    def visit[Result](visitor: Visitor[Result]): Result
  }
  object Node {
    
    @scala.inline
    def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => js.Any): Node = {
      val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisit(value: Visitor[js.Any] => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
    }
  }
  
  trait Visitor[Result] extends StObject {
    
    var visit: js.UndefOr[js.Function1[/* node */ Node, Result]] = js.undefined
    
    def visitBoundAttribute(attribute: BoundAttribute): Result
    
    def visitBoundEvent(attribute: BoundEvent): Result
    
    def visitBoundText(text: BoundText): Result
    
    def visitContent(content: Content): Result
    
    def visitElement(element: Element): Result
    
    def visitIcu(icu: Icu): Result
    
    def visitReference(reference: Reference): Result
    
    def visitTemplate(template: Template): Result
    
    def visitText(text: Text): Result
    
    def visitTextAttribute(attribute: TextAttribute): Result
    
    def visitVariable(variable: Variable): Result
  }
  object Visitor {
    
    @scala.inline
    def apply[Result](
      visitBoundAttribute: BoundAttribute => Result,
      visitBoundEvent: BoundEvent => Result,
      visitBoundText: BoundText => Result,
      visitContent: Content => Result,
      visitElement: Element => Result,
      visitIcu: Icu => Result,
      visitReference: Reference => Result,
      visitTemplate: Template => Result,
      visitText: Text => Result,
      visitTextAttribute: TextAttribute => Result,
      visitVariable: Variable => Result
    ): Visitor[Result] = {
      val __obj = js.Dynamic.literal(visitBoundAttribute = js.Any.fromFunction1(visitBoundAttribute), visitBoundEvent = js.Any.fromFunction1(visitBoundEvent), visitBoundText = js.Any.fromFunction1(visitBoundText), visitContent = js.Any.fromFunction1(visitContent), visitElement = js.Any.fromFunction1(visitElement), visitIcu = js.Any.fromFunction1(visitIcu), visitReference = js.Any.fromFunction1(visitReference), visitTemplate = js.Any.fromFunction1(visitTemplate), visitText = js.Any.fromFunction1(visitText), visitTextAttribute = js.Any.fromFunction1(visitTextAttribute), visitVariable = js.Any.fromFunction1(visitVariable))
      __obj.asInstanceOf[Visitor[Result]]
    }
    
    @scala.inline
    implicit class VisitorMutableBuilder[Self <: Visitor[?], Result] (val x: Self & Visitor[Result]) extends AnyVal {
      
      @scala.inline
      def setVisit(value: /* node */ Node => Result): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitBoundAttribute(value: BoundAttribute => Result): Self = StObject.set(x, "visitBoundAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitBoundEvent(value: BoundEvent => Result): Self = StObject.set(x, "visitBoundEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitBoundText(value: BoundText => Result): Self = StObject.set(x, "visitBoundText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitContent(value: Content => Result): Self = StObject.set(x, "visitContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitElement(value: Element => Result): Self = StObject.set(x, "visitElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitIcu(value: Icu => Result): Self = StObject.set(x, "visitIcu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitReference(value: Reference => Result): Self = StObject.set(x, "visitReference", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitTemplate(value: Template => Result): Self = StObject.set(x, "visitTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitText(value: Text => Result): Self = StObject.set(x, "visitText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitTextAttribute(value: TextAttribute => Result): Self = StObject.set(x, "visitTextAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
      
      @scala.inline
      def setVisitVariable(value: Variable => Result): Self = StObject.set(x, "visitVariable", js.Any.fromFunction1(value))
    }
  }
}
