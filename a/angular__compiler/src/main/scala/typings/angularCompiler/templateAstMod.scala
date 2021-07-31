package typings.angularCompiler

import typings.angularCompiler.angularCompilerNumbers.`0`
import typings.angularCompiler.angularCompilerNumbers.`1`
import typings.angularCompiler.angularCompilerNumbers.`2`
import typings.angularCompiler.angularCompilerNumbers.`3`
import typings.angularCompiler.angularCompilerNumbers.`4`
import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.astMod.BoundElementProperty
import typings.angularCompiler.astMod.ParsedEvent
import typings.angularCompiler.astMod.ParsedVariable
import typings.angularCompiler.astPathMod.AstPath
import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateAstMod {
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "AttrAst")
  @js.native
  class AttrAst protected ()
    extends StObject
       with TemplateAst {
    def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
    
    var name: String = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "BoundDirectivePropertyAst")
  @js.native
  class BoundDirectivePropertyAst protected ()
    extends StObject
       with TemplateAst {
    def this(directiveName: String, templateName: String, value: ASTWithSource, sourceSpan: ParseSourceSpan) = this()
    
    var directiveName: String = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var templateName: String = js.native
    
    var value: ASTWithSource = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "BoundElementPropertyAst")
  @js.native
  class BoundElementPropertyAst protected ()
    extends StObject
       with TemplateAst {
    def this(
      name: String,
      `type`: PropertyBindingType,
      securityContext: SecurityContext,
      value: ASTWithSource,
      unit: String,
      sourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      `type`: PropertyBindingType,
      securityContext: SecurityContext,
      value: ASTWithSource,
      unit: Null,
      sourceSpan: ParseSourceSpan
    ) = this()
    
    val isAnimation: Boolean = js.native
    
    var name: String = js.native
    
    var securityContext: SecurityContext = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var `type`: PropertyBindingType = js.native
    
    var unit: String | Null = js.native
    
    var value: ASTWithSource = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  /* static members */
  object BoundElementPropertyAst {
    
    @JSImport("@angular/compiler/src/template_parser/template_ast", "BoundElementPropertyAst")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromBoundProperty(prop: BoundElementProperty): BoundElementPropertyAst = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[BoundElementPropertyAst]
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "BoundEventAst")
  @js.native
  class BoundEventAst protected ()
    extends StObject
       with TemplateAst {
    def this(
      name: String,
      target: String,
      phase: String,
      handler: ASTWithSource,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      target: String,
      phase: Null,
      handler: ASTWithSource,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      target: Null,
      phase: String,
      handler: ASTWithSource,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      target: Null,
      phase: Null,
      handler: ASTWithSource,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan
    ) = this()
    
    val fullName: String = js.native
    
    var handler: ASTWithSource = js.native
    
    var handlerSpan: ParseSourceSpan = js.native
    
    val isAnimation: Boolean = js.native
    
    var name: String = js.native
    
    var phase: String | Null = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var target: String | Null = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  /* static members */
  object BoundEventAst {
    
    @JSImport("@angular/compiler/src/template_parser/template_ast", "BoundEventAst")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def calcFullName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calcFullName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def calcFullName(name: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcFullName")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def calcFullName(name: String, target: String, phase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcFullName")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], phase.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def calcFullName(name: String, target: Null, phase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcFullName")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], phase.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def fromParsedEvent(event: ParsedEvent): BoundEventAst = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParsedEvent")(event.asInstanceOf[js.Any]).asInstanceOf[BoundEventAst]
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "BoundTextAst")
  @js.native
  class BoundTextAst protected ()
    extends StObject
       with TemplateAst {
    def this(value: ASTWithSource, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
    
    var ngContentIndex: Double = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: ASTWithSource = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "DirectiveAst")
  @js.native
  class DirectiveAst protected ()
    extends StObject
       with TemplateAst {
    def this(
      directive: CompileDirectiveSummary,
      inputs: js.Array[BoundDirectivePropertyAst],
      hostProperties: js.Array[BoundElementPropertyAst],
      hostEvents: js.Array[BoundEventAst],
      contentQueryStartId: Double,
      sourceSpan: ParseSourceSpan
    ) = this()
    
    var contentQueryStartId: Double = js.native
    
    var directive: CompileDirectiveSummary = js.native
    
    var hostEvents: js.Array[BoundEventAst] = js.native
    
    var hostProperties: js.Array[BoundElementPropertyAst] = js.native
    
    var inputs: js.Array[BoundDirectivePropertyAst] = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "ElementAst")
  @js.native
  class ElementAst protected ()
    extends StObject
       with TemplateAst {
    def this(
      name: String,
      attrs: js.Array[AttrAst],
      inputs: js.Array[BoundElementPropertyAst],
      outputs: js.Array[BoundEventAst],
      references: js.Array[ReferenceAst],
      directives: js.Array[DirectiveAst],
      providers: js.Array[ProviderAst],
      hasViewContainer: Boolean,
      queryMatches: js.Array[QueryMatch],
      children: js.Array[TemplateAst],
      ngContentIndex: Double,
      sourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attrs: js.Array[AttrAst],
      inputs: js.Array[BoundElementPropertyAst],
      outputs: js.Array[BoundEventAst],
      references: js.Array[ReferenceAst],
      directives: js.Array[DirectiveAst],
      providers: js.Array[ProviderAst],
      hasViewContainer: Boolean,
      queryMatches: js.Array[QueryMatch],
      children: js.Array[TemplateAst],
      ngContentIndex: Null,
      sourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attrs: js.Array[AttrAst],
      inputs: js.Array[BoundElementPropertyAst],
      outputs: js.Array[BoundEventAst],
      references: js.Array[ReferenceAst],
      directives: js.Array[DirectiveAst],
      providers: js.Array[ProviderAst],
      hasViewContainer: Boolean,
      queryMatches: js.Array[QueryMatch],
      children: js.Array[TemplateAst],
      ngContentIndex: Double,
      sourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      name: String,
      attrs: js.Array[AttrAst],
      inputs: js.Array[BoundElementPropertyAst],
      outputs: js.Array[BoundEventAst],
      references: js.Array[ReferenceAst],
      directives: js.Array[DirectiveAst],
      providers: js.Array[ProviderAst],
      hasViewContainer: Boolean,
      queryMatches: js.Array[QueryMatch],
      children: js.Array[TemplateAst],
      ngContentIndex: Null,
      sourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan
    ) = this()
    
    var attrs: js.Array[AttrAst] = js.native
    
    var children: js.Array[TemplateAst] = js.native
    
    var directives: js.Array[DirectiveAst] = js.native
    
    var endSourceSpan: ParseSourceSpan | Null = js.native
    
    var hasViewContainer: Boolean = js.native
    
    var inputs: js.Array[BoundElementPropertyAst] = js.native
    
    var name: String = js.native
    
    var ngContentIndex: Double | Null = js.native
    
    var outputs: js.Array[BoundEventAst] = js.native
    
    var providers: js.Array[ProviderAst] = js.native
    
    var queryMatches: js.Array[QueryMatch] = js.native
    
    var references: js.Array[ReferenceAst] = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "EmbeddedTemplateAst")
  @js.native
  class EmbeddedTemplateAst protected ()
    extends StObject
       with TemplateAst {
    def this(
      attrs: js.Array[AttrAst],
      outputs: js.Array[BoundEventAst],
      references: js.Array[ReferenceAst],
      variables: js.Array[VariableAst],
      directives: js.Array[DirectiveAst],
      providers: js.Array[ProviderAst],
      hasViewContainer: Boolean,
      queryMatches: js.Array[QueryMatch],
      children: js.Array[TemplateAst],
      ngContentIndex: Double,
      sourceSpan: ParseSourceSpan
    ) = this()
    
    var attrs: js.Array[AttrAst] = js.native
    
    var children: js.Array[TemplateAst] = js.native
    
    var directives: js.Array[DirectiveAst] = js.native
    
    var hasViewContainer: Boolean = js.native
    
    var ngContentIndex: Double = js.native
    
    var outputs: js.Array[BoundEventAst] = js.native
    
    var providers: js.Array[ProviderAst] = js.native
    
    var queryMatches: js.Array[QueryMatch] = js.native
    
    var references: js.Array[ReferenceAst] = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var variables: js.Array[VariableAst] = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "NgContentAst")
  @js.native
  class NgContentAst protected ()
    extends StObject
       with TemplateAst {
    def this(index: Double, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
    
    var index: Double = js.native
    
    var ngContentIndex: Double = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "NullTemplateVisitor")
  @js.native
  class NullTemplateVisitor ()
    extends StObject
       with TemplateAstVisitor {
    
    /* CompleteClass */
    override def visitAttr(ast: AttrAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitBoundText(ast: BoundTextAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitDirective(ast: DirectiveAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitDirectiveProperty(ast: BoundDirectivePropertyAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitElement(ast: ElementAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitElementProperty(ast: BoundElementPropertyAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitEmbeddedTemplate(ast: EmbeddedTemplateAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitEvent(ast: BoundEventAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitNgContent(ast: NgContentAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitReference(ast: ReferenceAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitText(ast: TextAst, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariable(ast: VariableAst, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAst")
  @js.native
  class ProviderAst protected ()
    extends StObject
       with TemplateAst {
    def this(
      token: CompileTokenMetadata,
      multiProvider: Boolean,
      eager: Boolean,
      providers: js.Array[CompileProviderMetadata],
      providerType: ProviderAstType,
      lifecycleHooks: js.Array[LifecycleHooks],
      sourceSpan: ParseSourceSpan,
      isModule: Boolean
    ) = this()
    
    var eager: Boolean = js.native
    
    val isModule: Boolean = js.native
    
    var lifecycleHooks: js.Array[LifecycleHooks] = js.native
    
    var multiProvider: Boolean = js.native
    
    var providerType: ProviderAstType = js.native
    
    var providers: js.Array[CompileProviderMetadata] = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var token: CompileTokenMetadata = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @js.native
  sealed trait ProviderAstType extends StObject
  @JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAstType")
  @js.native
  object ProviderAstType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProviderAstType & Double] = js.native
    
    @js.native
    sealed trait Builtin
      extends StObject
         with ProviderAstType
    /* 4 */ val Builtin: typings.angularCompiler.templateAstMod.ProviderAstType.Builtin & Double = js.native
    
    @js.native
    sealed trait Component
      extends StObject
         with ProviderAstType
    /* 2 */ val Component: typings.angularCompiler.templateAstMod.ProviderAstType.Component & Double = js.native
    
    @js.native
    sealed trait Directive
      extends StObject
         with ProviderAstType
    /* 3 */ val Directive: typings.angularCompiler.templateAstMod.ProviderAstType.Directive & Double = js.native
    
    @js.native
    sealed trait PrivateService
      extends StObject
         with ProviderAstType
    /* 1 */ val PrivateService: typings.angularCompiler.templateAstMod.ProviderAstType.PrivateService & Double = js.native
    
    @js.native
    sealed trait PublicService
      extends StObject
         with ProviderAstType
    /* 0 */ val PublicService: typings.angularCompiler.templateAstMod.ProviderAstType.PublicService & Double = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "RecursiveTemplateAstVisitor")
  @js.native
  class RecursiveTemplateAstVisitor () extends NullTemplateVisitor {
    
    /* protected */ def visitChildren(
      context: js.Any,
      cb: js.Function1[
          /* visit */ js.Function1[/* children */ js.UndefOr[js.Array[TemplateAst]], Unit], 
          Unit
        ]
    ): js.Array[js.Any] = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "ReferenceAst")
  @js.native
  class ReferenceAst protected ()
    extends StObject
       with TemplateAst {
    def this(name: String, value: CompileTokenMetadata, originalValue: String, sourceSpan: ParseSourceSpan) = this()
    
    var name: String = js.native
    
    var originalValue: String = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: CompileTokenMetadata = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "TextAst")
  @js.native
  class TextAst protected ()
    extends StObject
       with TemplateAst {
    def this(value: String, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
    
    var ngContentIndex: Double = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    var value: String = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/template_parser/template_ast", "VariableAst")
  @js.native
  class VariableAst protected ()
    extends StObject
       with TemplateAst {
    def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
    def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
    
    val name: String = js.native
    
    /**
      * The source span from which this node was parsed.
      */
    /* CompleteClass */
    var sourceSpan: ParseSourceSpan = js.native
    
    val value: String = js.native
    
    val valueSpan: js.UndefOr[ParseSourceSpan] = js.native
    
    /**
      * Visit this node and possibly transform it.
      */
    /* CompleteClass */
    override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
  }
  /* static members */
  object VariableAst {
    
    @JSImport("@angular/compiler/src/template_parser/template_ast", "VariableAst")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromParsedVariable(v: ParsedVariable): VariableAst = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParsedVariable")(v.asInstanceOf[js.Any]).asInstanceOf[VariableAst]
  }
  
  @scala.inline
  def templateVisitAll(visitor: TemplateAstVisitor, asts: js.Array[TemplateAst]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("templateVisitAll")(visitor.asInstanceOf[js.Any], asts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def templateVisitAll(visitor: TemplateAstVisitor, asts: js.Array[TemplateAst], context: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("templateVisitAll")(visitor.asInstanceOf[js.Any], asts.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompiler.angularCompilerNumbers.`0`
    - typings.angularCompiler.angularCompilerNumbers.`1`
    - typings.angularCompiler.angularCompilerNumbers.`2`
    - typings.angularCompiler.angularCompilerNumbers.`3`
    - typings.angularCompiler.angularCompilerNumbers.`4`
  */
  trait PropertyBindingType extends StObject
  object PropertyBindingType {
    
    @scala.inline
    def Animation: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Attribute: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Class: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Property: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Style: `3` = 3.asInstanceOf[`3`]
  }
  
  trait QueryMatch extends StObject {
    
    var queryId: Double
    
    var value: CompileTokenMetadata
  }
  object QueryMatch {
    
    @scala.inline
    def apply(queryId: Double, value: CompileTokenMetadata): QueryMatch = {
      val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryMatch]
    }
    
    @scala.inline
    implicit class QueryMatchMutableBuilder[Self <: QueryMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryId(value: Double): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: CompileTokenMetadata): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAst extends StObject {
    
    /**
      * The source span from which this node was parsed.
      */
    var sourceSpan: ParseSourceSpan
    
    /**
      * Visit this node and possibly transform it.
      */
    def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any
  }
  object TemplateAst {
    
    @scala.inline
    def apply(sourceSpan: ParseSourceSpan, visit: (TemplateAstVisitor, js.Any) => js.Any): TemplateAst = {
      val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[TemplateAst]
    }
    
    @scala.inline
    implicit class TemplateAstMutableBuilder[Self <: TemplateAst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisit(value: (TemplateAstVisitor, js.Any) => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    }
  }
  
  type TemplateAstPath = AstPath[TemplateAst]
  
  trait TemplateAstVisitor extends StObject {
    
    var visit: js.UndefOr[js.Function2[/* ast */ TemplateAst, /* context */ js.Any, js.Any]] = js.undefined
    
    def visitAttr(ast: AttrAst, context: js.Any): js.Any
    
    def visitBoundText(ast: BoundTextAst, context: js.Any): js.Any
    
    def visitDirective(ast: DirectiveAst, context: js.Any): js.Any
    
    def visitDirectiveProperty(ast: BoundDirectivePropertyAst, context: js.Any): js.Any
    
    def visitElement(ast: ElementAst, context: js.Any): js.Any
    
    def visitElementProperty(ast: BoundElementPropertyAst, context: js.Any): js.Any
    
    def visitEmbeddedTemplate(ast: EmbeddedTemplateAst, context: js.Any): js.Any
    
    def visitEvent(ast: BoundEventAst, context: js.Any): js.Any
    
    def visitNgContent(ast: NgContentAst, context: js.Any): js.Any
    
    def visitReference(ast: ReferenceAst, context: js.Any): js.Any
    
    def visitText(ast: TextAst, context: js.Any): js.Any
    
    def visitVariable(ast: VariableAst, context: js.Any): js.Any
  }
  object TemplateAstVisitor {
    
    @scala.inline
    def apply(
      visitAttr: (AttrAst, js.Any) => js.Any,
      visitBoundText: (BoundTextAst, js.Any) => js.Any,
      visitDirective: (DirectiveAst, js.Any) => js.Any,
      visitDirectiveProperty: (BoundDirectivePropertyAst, js.Any) => js.Any,
      visitElement: (ElementAst, js.Any) => js.Any,
      visitElementProperty: (BoundElementPropertyAst, js.Any) => js.Any,
      visitEmbeddedTemplate: (EmbeddedTemplateAst, js.Any) => js.Any,
      visitEvent: (BoundEventAst, js.Any) => js.Any,
      visitNgContent: (NgContentAst, js.Any) => js.Any,
      visitReference: (ReferenceAst, js.Any) => js.Any,
      visitText: (TextAst, js.Any) => js.Any,
      visitVariable: (VariableAst, js.Any) => js.Any
    ): TemplateAstVisitor = {
      val __obj = js.Dynamic.literal(visitAttr = js.Any.fromFunction2(visitAttr), visitBoundText = js.Any.fromFunction2(visitBoundText), visitDirective = js.Any.fromFunction2(visitDirective), visitDirectiveProperty = js.Any.fromFunction2(visitDirectiveProperty), visitElement = js.Any.fromFunction2(visitElement), visitElementProperty = js.Any.fromFunction2(visitElementProperty), visitEmbeddedTemplate = js.Any.fromFunction2(visitEmbeddedTemplate), visitEvent = js.Any.fromFunction2(visitEvent), visitNgContent = js.Any.fromFunction2(visitNgContent), visitReference = js.Any.fromFunction2(visitReference), visitText = js.Any.fromFunction2(visitText), visitVariable = js.Any.fromFunction2(visitVariable))
      __obj.asInstanceOf[TemplateAstVisitor]
    }
    
    @scala.inline
    implicit class TemplateAstVisitorMutableBuilder[Self <: TemplateAstVisitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisit(value: (/* ast */ TemplateAst, /* context */ js.Any) => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitAttr(value: (AttrAst, js.Any) => js.Any): Self = StObject.set(x, "visitAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitBoundText(value: (BoundTextAst, js.Any) => js.Any): Self = StObject.set(x, "visitBoundText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitDirective(value: (DirectiveAst, js.Any) => js.Any): Self = StObject.set(x, "visitDirective", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitDirectiveProperty(value: (BoundDirectivePropertyAst, js.Any) => js.Any): Self = StObject.set(x, "visitDirectiveProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitElement(value: (ElementAst, js.Any) => js.Any): Self = StObject.set(x, "visitElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitElementProperty(value: (BoundElementPropertyAst, js.Any) => js.Any): Self = StObject.set(x, "visitElementProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitEmbeddedTemplate(value: (EmbeddedTemplateAst, js.Any) => js.Any): Self = StObject.set(x, "visitEmbeddedTemplate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitEvent(value: (BoundEventAst, js.Any) => js.Any): Self = StObject.set(x, "visitEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitNgContent(value: (NgContentAst, js.Any) => js.Any): Self = StObject.set(x, "visitNgContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitReference(value: (ReferenceAst, js.Any) => js.Any): Self = StObject.set(x, "visitReference", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitText(value: (TextAst, js.Any) => js.Any): Self = StObject.set(x, "visitText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
      
      @scala.inline
      def setVisitVariable(value: (VariableAst, js.Any) => js.Any): Self = StObject.set(x, "visitVariable", js.Any.fromFunction2(value))
    }
  }
}
