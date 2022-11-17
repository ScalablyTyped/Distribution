package typings.angularCompilerCli

import typings.angularCompiler.mod.InterpolationConfig
import typings.angularCompiler.mod.ParseSourceFile
import typings.angularCompiler.mod.ParsedTemplate
import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcApiMod.ResourceLoader
import typings.angularCompilerCli.srcNgtscDiagnosticsMod.FatalDiagnosticError
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typings.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.Resource
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateSourceMapping
import typings.std.Map
import typings.std.ReadonlySet
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsComponentSrcResourcesMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractComponentStyleUrls(evaluator: PartialEvaluator, component: Map[String, Expression]): js.Array[StyleUrlMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentStyleUrls")(evaluator.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Array[StyleUrlMeta]]
  
  inline def extractStyleResources(resourceLoader: ResourceLoader, component: Map[String, Expression], containingFile: String): ReadonlySet[Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractStyleResources")(resourceLoader.asInstanceOf[js.Any], component.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any])).asInstanceOf[ReadonlySet[Resource]]
  
  inline def extractTemplate(
    node: ClassDeclaration[DeclarationNode],
    template: TemplateDeclaration,
    evaluator: PartialEvaluator,
    depTracker: Null,
    resourceLoader: ResourceLoader,
    options: ExtractTemplateOptions
  ): ParsedTemplateWithSource = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTemplate")(node.asInstanceOf[js.Any], template.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], depTracker.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedTemplateWithSource]
  inline def extractTemplate(
    node: ClassDeclaration[DeclarationNode],
    template: TemplateDeclaration,
    evaluator: PartialEvaluator,
    depTracker: DependencyTracker[SourceFile],
    resourceLoader: ResourceLoader,
    options: ExtractTemplateOptions
  ): ParsedTemplateWithSource = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTemplate")(node.asInstanceOf[js.Any], template.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], depTracker.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedTemplateWithSource]
  
  inline def extractTemplateStyleUrls(template: ParsedTemplateWithSource): js.Array[StyleUrlMeta] = ^.asInstanceOf[js.Dynamic].applyDynamic("_extractTemplateStyleUrls")(template.asInstanceOf[js.Any]).asInstanceOf[js.Array[StyleUrlMeta]]
  
  inline def getTemplateDeclarationNodeForError(declaration: TemplateDeclaration): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateDeclarationNodeForError")(declaration.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def makeResourceNotFoundError(file: String, nodeForError: Node, resourceType: ResourceTypeForDiagnostics): FatalDiagnosticError = (^.asInstanceOf[js.Dynamic].applyDynamic("makeResourceNotFoundError")(file.asInstanceOf[js.Any], nodeForError.asInstanceOf[js.Any], resourceType.asInstanceOf[js.Any])).asInstanceOf[FatalDiagnosticError]
  
  inline def parseTemplateDeclaration(
    decorator: Decorator,
    component: Map[String, Expression],
    containingFile: String,
    evaluator: PartialEvaluator,
    resourceLoader: ResourceLoader,
    defaultPreserveWhitespaces: Boolean
  ): TemplateDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplateDeclaration")(decorator.asInstanceOf[js.Any], component.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any], defaultPreserveWhitespaces.asInstanceOf[js.Any])).asInstanceOf[TemplateDeclaration]
  
  inline def preloadAndParseTemplate(
    evaluator: PartialEvaluator,
    resourceLoader: ResourceLoader,
    depTracker: Null,
    preanalyzeTemplateCache: Map[DeclarationNode, ParsedTemplateWithSource],
    node: ClassDeclaration[DeclarationNode],
    decorator: Decorator,
    component: Map[String, Expression],
    containingFile: String,
    defaultPreserveWhitespaces: Boolean,
    options: ExtractTemplateOptions
  ): js.Promise[ParsedTemplateWithSource | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("preloadAndParseTemplate")(evaluator.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any], depTracker.asInstanceOf[js.Any], preanalyzeTemplateCache.asInstanceOf[js.Any], node.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], component.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], defaultPreserveWhitespaces.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsedTemplateWithSource | Null]]
  inline def preloadAndParseTemplate(
    evaluator: PartialEvaluator,
    resourceLoader: ResourceLoader,
    depTracker: DependencyTracker[SourceFile],
    preanalyzeTemplateCache: Map[DeclarationNode, ParsedTemplateWithSource],
    node: ClassDeclaration[DeclarationNode],
    decorator: Decorator,
    component: Map[String, Expression],
    containingFile: String,
    defaultPreserveWhitespaces: Boolean,
    options: ExtractTemplateOptions
  ): js.Promise[ParsedTemplateWithSource | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("preloadAndParseTemplate")(evaluator.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any], depTracker.asInstanceOf[js.Any], preanalyzeTemplateCache.asInstanceOf[js.Any], node.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], component.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], defaultPreserveWhitespaces.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsedTemplateWithSource | Null]]
  
  inline def transformDecoratorResources(
    dec: Decorator,
    component: Map[String, Expression],
    styles: js.Array[String],
    template: ParsedTemplateWithSource
  ): Decorator = (^.asInstanceOf[js.Dynamic].applyDynamic("transformDecoratorResources")(dec.asInstanceOf[js.Any], component.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Decorator]
  
  /**
    * Common fields extracted from the declaration of a template.
    */
  trait CommonTemplateDeclaration extends StObject {
    
    var interpolationConfig: InterpolationConfig
    
    var preserveWhitespaces: Boolean
    
    var resolvedTemplateUrl: String
    
    var templateUrl: String
  }
  object CommonTemplateDeclaration {
    
    inline def apply(
      interpolationConfig: InterpolationConfig,
      preserveWhitespaces: Boolean,
      resolvedTemplateUrl: String,
      templateUrl: String
    ): CommonTemplateDeclaration = {
      val __obj = js.Dynamic.literal(interpolationConfig = interpolationConfig.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], resolvedTemplateUrl = resolvedTemplateUrl.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonTemplateDeclaration]
    }
    
    extension [Self <: CommonTemplateDeclaration](x: Self) {
      
      inline def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      inline def setResolvedTemplateUrl(value: String): Self = StObject.set(x, "resolvedTemplateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalTemplateDeclaration
    extends StObject
       with CommonTemplateDeclaration {
    
    var isInline: false
    
    var templateUrlExpression: Expression
  }
  object ExternalTemplateDeclaration {
    
    inline def apply(
      interpolationConfig: InterpolationConfig,
      preserveWhitespaces: Boolean,
      resolvedTemplateUrl: String,
      templateUrl: String,
      templateUrlExpression: Expression
    ): ExternalTemplateDeclaration = {
      val __obj = js.Dynamic.literal(interpolationConfig = interpolationConfig.asInstanceOf[js.Any], isInline = false, preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], resolvedTemplateUrl = resolvedTemplateUrl.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any], templateUrlExpression = templateUrlExpression.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalTemplateDeclaration]
    }
    
    extension [Self <: ExternalTemplateDeclaration](x: Self) {
      
      inline def setIsInline(value: false): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlExpression(value: Expression): Self = StObject.set(x, "templateUrlExpression", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtractTemplateOptions extends StObject {
    
    var enableI18nLegacyMessageIdFormat: Boolean
    
    var i18nNormalizeLineEndingsInICUs: Boolean
    
    var usePoisonedData: Boolean
  }
  object ExtractTemplateOptions {
    
    inline def apply(
      enableI18nLegacyMessageIdFormat: Boolean,
      i18nNormalizeLineEndingsInICUs: Boolean,
      usePoisonedData: Boolean
    ): ExtractTemplateOptions = {
      val __obj = js.Dynamic.literal(enableI18nLegacyMessageIdFormat = enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any], i18nNormalizeLineEndingsInICUs = i18nNormalizeLineEndingsInICUs.asInstanceOf[js.Any], usePoisonedData = usePoisonedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractTemplateOptions]
    }
    
    extension [Self <: ExtractTemplateOptions](x: Self) {
      
      inline def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
      
      inline def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
      
      inline def setUsePoisonedData(value: Boolean): Self = StObject.set(x, "usePoisonedData", value.asInstanceOf[js.Any])
    }
  }
  
  trait InlineTemplateDeclaration
    extends StObject
       with CommonTemplateDeclaration {
    
    var expression: Expression
    
    var isInline: true
  }
  object InlineTemplateDeclaration {
    
    inline def apply(
      expression: Expression,
      interpolationConfig: InterpolationConfig,
      preserveWhitespaces: Boolean,
      resolvedTemplateUrl: String,
      templateUrl: String
    ): InlineTemplateDeclaration = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], interpolationConfig = interpolationConfig.asInstanceOf[js.Any], isInline = true, preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], resolvedTemplateUrl = resolvedTemplateUrl.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineTemplateDeclaration]
    }
    
    extension [Self <: InlineTemplateDeclaration](x: Self) {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setIsInline(value: true): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedComponentTemplate
    extends StObject
       with ParsedTemplate {
    
    /**
      * The template AST, parsed in a manner which preserves source map information for diagnostics.
      *
      * Not useful for emit.
      */
    var diagNodes: js.Array[TmplAstNode]
    
    /**
      * The `ParseSourceFile` for the template.
      */
    var file: ParseSourceFile
  }
  object ParsedComponentTemplate {
    
    inline def apply(
      diagNodes: js.Array[TmplAstNode],
      file: ParseSourceFile,
      ngContentSelectors: js.Array[String],
      nodes: js.Array[typings.std.Node],
      styleUrls: js.Array[String],
      styles: js.Array[String]
    ): ParsedComponentTemplate = {
      val __obj = js.Dynamic.literal(diagNodes = diagNodes.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], errors = null)
      __obj.asInstanceOf[ParsedComponentTemplate]
    }
    
    extension [Self <: ParsedComponentTemplate](x: Self) {
      
      inline def setDiagNodes(value: js.Array[TmplAstNode]): Self = StObject.set(x, "diagNodes", value.asInstanceOf[js.Any])
      
      inline def setDiagNodesVarargs(value: TmplAstNode*): Self = StObject.set(x, "diagNodes", js.Array(value*))
      
      inline def setFile(value: ParseSourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedTemplateWithSource
    extends StObject
       with ParsedComponentTemplate {
    
    /** The string contents of the template. */
    var content: String
    
    var declaration: TemplateDeclaration
    
    var sourceMapping: TemplateSourceMapping
  }
  object ParsedTemplateWithSource {
    
    inline def apply(
      content: String,
      declaration: TemplateDeclaration,
      diagNodes: js.Array[TmplAstNode],
      file: ParseSourceFile,
      ngContentSelectors: js.Array[String],
      nodes: js.Array[typings.std.Node],
      sourceMapping: TemplateSourceMapping,
      styleUrls: js.Array[String],
      styles: js.Array[String]
    ): ParsedTemplateWithSource = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], diagNodes = diagNodes.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceMapping = sourceMapping.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], errors = null)
      __obj.asInstanceOf[ParsedTemplateWithSource]
    }
    
    extension [Self <: ParsedTemplateWithSource](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDeclaration(value: TemplateDeclaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setSourceMapping(value: TemplateSourceMapping): Self = StObject.set(x, "sourceMapping", value.asInstanceOf[js.Any])
    }
  }
  
  object ResourceTypeForDiagnostics {
    
    inline def StylesheetFromDecorator: 2 = 2.asInstanceOf[2]
    
    inline def StylesheetFromTemplate: 1 = 1.asInstanceOf[1]
    
    inline def Template: 0 = 0.asInstanceOf[0]
  }
  type ResourceTypeForDiagnostics = 0 | 1 | 2
  
  trait StyleUrlMeta extends StObject {
    
    var nodeForError: Node
    
    var source: 1 | 2
    
    var url: String
  }
  object StyleUrlMeta {
    
    inline def apply(nodeForError: Node, source: 1 | 2, url: String): StyleUrlMeta = {
      val __obj = js.Dynamic.literal(nodeForError = nodeForError.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleUrlMeta]
    }
    
    extension [Self <: StyleUrlMeta](x: Self) {
      
      inline def setNodeForError(value: Node): Self = StObject.set(x, "nodeForError", value.asInstanceOf[js.Any])
      
      inline def setSource(value: 1 | 2): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type TemplateDeclaration = InlineTemplateDeclaration | ExternalTemplateDeclaration
}
