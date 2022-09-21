package typings.angularCompilerCli

import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.BoundTarget
import typings.angularCompiler.mod.DirectiveMeta
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.angularCompilerCliBooleans.`false`
import typings.angularCompilerCli.angularCompilerCliStrings.direct
import typings.angularCompilerCli.angularCompilerCliStrings.external
import typings.angularCompilerCli.angularCompilerCliStrings.indirect
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.anon.Inputs
import typings.angularCompilerCli.errorCodeMod.ErrorCode
import typings.angularCompilerCli.metadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.metadataSrcApiMod.TemplateGuardMeta
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.ngtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.propertyMappingMod.ClassPropertyName
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.std.Map
import typings.std.Set
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticCategory
import typings.typescript.mod.DiagnosticMessageChain
import typings.typescript.mod.Expression
import typings.typescript.mod.NoSubstitutionTemplateLiteral
import typings.typescript.mod.SourceFile
import typings.typescript.mod.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiApiMod {
  
  trait DirectTemplateSourceMapping
    extends StObject
       with TemplateSourceMapping {
    
    var node: StringLiteral | NoSubstitutionTemplateLiteral
    
    var `type`: direct
  }
  object DirectTemplateSourceMapping {
    
    inline def apply(node: StringLiteral | NoSubstitutionTemplateLiteral): DirectTemplateSourceMapping = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("direct")
      __obj.asInstanceOf[DirectTemplateSourceMapping]
    }
    
    extension [Self <: DirectTemplateSourceMapping](x: Self) {
      
      inline def setNode(value: StringLiteral | NoSubstitutionTemplateLiteral): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setType(value: direct): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalTemplateSourceMapping
    extends StObject
       with TemplateSourceMapping {
    
    var componentClass: ClassDeclaration[DeclarationNode]
    
    var node: Expression
    
    var template: String
    
    var templateUrl: String
    
    var `type`: external
  }
  object ExternalTemplateSourceMapping {
    
    inline def apply(
      componentClass: ClassDeclaration[DeclarationNode],
      node: Expression,
      template: String,
      templateUrl: String
    ): ExternalTemplateSourceMapping = {
      val __obj = js.Dynamic.literal(componentClass = componentClass.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("external")
      __obj.asInstanceOf[ExternalTemplateSourceMapping]
    }
    
    extension [Self <: ExternalTemplateSourceMapping](x: Self) {
      
      inline def setComponentClass(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Expression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setType(value: external): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullTemplateMapping extends StObject {
    
    var sourceLocation: SourceLocation
    
    var span: ParseSourceSpan
    
    var templateSourceMapping: TemplateSourceMapping
  }
  object FullTemplateMapping {
    
    inline def apply(
      sourceLocation: SourceLocation,
      span: ParseSourceSpan,
      templateSourceMapping: TemplateSourceMapping
    ): FullTemplateMapping = {
      val __obj = js.Dynamic.literal(sourceLocation = sourceLocation.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], templateSourceMapping = templateSourceMapping.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullTemplateMapping]
    }
    
    extension [Self <: FullTemplateMapping](x: Self) {
      
      inline def setSourceLocation(value: SourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: ParseSourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setTemplateSourceMapping(value: TemplateSourceMapping): Self = StObject.set(x, "templateSourceMapping", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndirectTemplateSourceMapping
    extends StObject
       with TemplateSourceMapping {
    
    var componentClass: ClassDeclaration[DeclarationNode]
    
    var node: Expression
    
    var template: String
    
    var `type`: indirect
  }
  object IndirectTemplateSourceMapping {
    
    inline def apply(componentClass: ClassDeclaration[DeclarationNode], node: Expression, template: String): IndirectTemplateSourceMapping = {
      val __obj = js.Dynamic.literal(componentClass = componentClass.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("indirect")
      __obj.asInstanceOf[IndirectTemplateSourceMapping]
    }
    
    extension [Self <: IndirectTemplateSourceMapping](x: Self) {
      
      inline def setComponentClass(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Expression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setType(value: indirect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NgTemplateDiagnostic[T /* <: ErrorCode */]
    extends StObject
       with TemplateDiagnostic {
    
    var __ngCode: T
  }
  object NgTemplateDiagnostic {
    
    inline def apply[T /* <: ErrorCode */](
      __ngCode: T,
      category: DiagnosticCategory,
      code: Double,
      componentFile: SourceFile,
      messageText: String | DiagnosticMessageChain,
      templateId: TemplateId
    ): NgTemplateDiagnostic[T] = {
      val __obj = js.Dynamic.literal(__ngCode = __ngCode.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], componentFile = componentFile.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgTemplateDiagnostic[T]]
    }
    
    extension [Self <: NgTemplateDiagnostic[?], T /* <: ErrorCode */](x: Self & NgTemplateDiagnostic[T]) {
      
      inline def set__ngCode(value: T): Self = StObject.set(x, "__ngCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceLocation extends StObject {
    
    var id: TemplateId
    
    var span: AbsoluteSourceSpan
  }
  object SourceLocation {
    
    inline def apply(id: TemplateId, span: AbsoluteSourceSpan): SourceLocation = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    extension [Self <: SourceLocation](x: Self) {
      
      inline def setId(value: TemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: AbsoluteSourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateDiagnostic
    extends StObject
       with Diagnostic {
    
    /**
      * The component with the template that resulted in this diagnostic.
      */
    var componentFile: SourceFile
    
    /**
      * The template id of the component that resulted in this diagnostic.
      */
    var templateId: TemplateId
  }
  object TemplateDiagnostic {
    
    inline def apply(
      category: DiagnosticCategory,
      code: Double,
      componentFile: SourceFile,
      messageText: String | DiagnosticMessageChain,
      templateId: TemplateId
    ): TemplateDiagnostic = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], componentFile = componentFile.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateDiagnostic]
    }
    
    extension [Self <: TemplateDiagnostic](x: Self) {
      
      inline def setComponentFile(value: SourceFile): Self = StObject.set(x, "componentFile", value.asInstanceOf[js.Any])
      
      inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplateId
    extends StObject
       with typings.std.String {
    
    var __brand: typings.angularCompilerCli.angularCompilerCliStrings.TemplateId = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.apiApiMod.DirectTemplateSourceMapping
    - typings.angularCompilerCli.apiApiMod.IndirectTemplateSourceMapping
    - typings.angularCompilerCli.apiApiMod.ExternalTemplateSourceMapping
  */
  trait TemplateSourceMapping extends StObject
  object TemplateSourceMapping {
    
    inline def DirectTemplateSourceMapping(node: StringLiteral | NoSubstitutionTemplateLiteral): typings.angularCompilerCli.apiApiMod.DirectTemplateSourceMapping = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("direct")
      __obj.asInstanceOf[typings.angularCompilerCli.apiApiMod.DirectTemplateSourceMapping]
    }
    
    inline def ExternalTemplateSourceMapping(
      componentClass: ClassDeclaration[DeclarationNode],
      node: Expression,
      template: String,
      templateUrl: String
    ): typings.angularCompilerCli.apiApiMod.ExternalTemplateSourceMapping = {
      val __obj = js.Dynamic.literal(componentClass = componentClass.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("external")
      __obj.asInstanceOf[typings.angularCompilerCli.apiApiMod.ExternalTemplateSourceMapping]
    }
    
    inline def IndirectTemplateSourceMapping(componentClass: ClassDeclaration[DeclarationNode], node: Expression, template: String): typings.angularCompilerCli.apiApiMod.IndirectTemplateSourceMapping = {
      val __obj = js.Dynamic.literal(componentClass = componentClass.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("indirect")
      __obj.asInstanceOf[typings.angularCompilerCli.apiApiMod.IndirectTemplateSourceMapping]
    }
  }
  
  trait TypeCheckBlockMetadata extends StObject {
    
    /**
      * Semantic information about the template of the component.
      */
    var boundTarget: BoundTarget[TypeCheckableDirectiveMeta]
    
    /**
      * A unique identifier for the class which gave rise to this TCB.
      *
      * This can be used to map errors back to the `ts.ClassDeclaration` for the component.
      */
    var id: TemplateId
    
    var isStandalone: Boolean
    
    var pipes: Map[String, Reference[ClassDeclarationClassDecl]]
    
    /**
      * Schemas that apply to this template.
      */
    var schemas: js.Array[SchemaMetadata]
  }
  object TypeCheckBlockMetadata {
    
    inline def apply(
      boundTarget: BoundTarget[TypeCheckableDirectiveMeta],
      id: TemplateId,
      isStandalone: Boolean,
      pipes: Map[String, Reference[ClassDeclarationClassDecl]],
      schemas: js.Array[SchemaMetadata]
    ): TypeCheckBlockMetadata = {
      val __obj = js.Dynamic.literal(boundTarget = boundTarget.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeCheckBlockMetadata]
    }
    
    extension [Self <: TypeCheckBlockMetadata](x: Self) {
      
      inline def setBoundTarget(value: BoundTarget[TypeCheckableDirectiveMeta]): Self = StObject.set(x, "boundTarget", value.asInstanceOf[js.Any])
      
      inline def setId(value: TemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
      
      inline def setPipes(value: Map[String, Reference[ClassDeclarationClassDecl]]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
  
  trait TypeCheckableDirectiveMeta
    extends StObject
       with DirectiveMeta
       with DirectiveTypeCheckMeta {
    
    @JSName("inputs")
    var inputs_TypeCheckableDirectiveMeta: ClassPropertyMapping
    
    var isStandalone: Boolean
    
    @JSName("outputs")
    var outputs_TypeCheckableDirectiveMeta: ClassPropertyMapping
    
    var queries: js.Array[String]
    
    var ref: Reference[ClassDeclaration[DeclarationNode]]
  }
  object TypeCheckableDirectiveMeta {
    
    inline def apply(
      coercedInputFields: Set[ClassPropertyName],
      hasNgTemplateContextGuard: Boolean,
      inputs: ClassPropertyMapping,
      isComponent: Boolean,
      isGeneric: Boolean,
      isStandalone: Boolean,
      isStructural: Boolean,
      name: String,
      ngTemplateGuards: js.Array[TemplateGuardMeta],
      outputs: ClassPropertyMapping,
      queries: js.Array[String],
      ref: Reference[ClassDeclaration[DeclarationNode]],
      restrictedInputFields: Set[ClassPropertyName],
      stringLiteralInputFields: Set[ClassPropertyName],
      undeclaredInputFields: Set[ClassPropertyName]
    ): TypeCheckableDirectiveMeta = {
      val __obj = js.Dynamic.literal(coercedInputFields = coercedInputFields.asInstanceOf[js.Any], hasNgTemplateContextGuard = hasNgTemplateContextGuard.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ngTemplateGuards = ngTemplateGuards.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], restrictedInputFields = restrictedInputFields.asInstanceOf[js.Any], stringLiteralInputFields = stringLiteralInputFields.asInstanceOf[js.Any], undeclaredInputFields = undeclaredInputFields.asInstanceOf[js.Any], animationTriggerNames = null, exportAs = null, selector = null)
      __obj.asInstanceOf[TypeCheckableDirectiveMeta]
    }
    
    extension [Self <: TypeCheckableDirectiveMeta](x: Self) {
      
      inline def setInputs(value: ClassPropertyMapping): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: ClassPropertyMapping): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setRef(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeCheckingConfig extends StObject {
    
    /**
      * Whether to always apply DOM schema checks in template bodies, independently of the
      * `checkTemplateBodies` setting.
      */
    var alwaysCheckSchemaInTemplateBodies: Boolean
    
    /**
      * Whether to narrow the types of template contexts.
      */
    var applyTemplateContextGuards: Boolean
    
    /**
      * Whether to check resolvable queries.
      *
      * This is currently an unsupported feature.
      */
    var checkQueries: `false`
    
    /**
      * Whether to descend into template bodies and check any bindings there.
      */
    var checkTemplateBodies: Boolean
    
    /**
      * Whether to infer the type of the `$event` variable in event bindings for animations.
      *
      * If this is `true`, the type of `$event` will be `AnimationEvent` from `@angular/animations`.
      * If set to `false`, the `$event` variable will be of type `any`.
      */
    var checkTypeOfAnimationEvents: Boolean
    
    /**
      * Whether to check text attributes that happen to be consumed by a directive or component.
      *
      * For example, in a template containing `<input matInput disabled>` the `disabled` attribute ends
      * up being consumed as an input with type `boolean` by the `matInput` directive. At runtime, the
      * input will be set to the attribute's string value, which is an empty string for attributes
      * without a value, so with this flag set to `true`, an error would be reported. If set to
      * `false`, text attributes will never report an error.
      *
      * Note that if `checkTypeOfInputBindings` is set to `false`, this flag has no effect.
      */
    var checkTypeOfAttributes: Boolean
    
    /**
      * Whether to check the left-hand side type of binding operations to DOM properties.
      *
      * As `checkTypeOfBindings`, but only applies to bindings to DOM properties.
      *
      * This does not affect the use of the `DomSchemaChecker` to validate the template against the DOM
      * schema. Rather, this flag is an experimental, not yet complete feature which uses the
      * lib.dom.d.ts DOM typings in TypeScript to validate that DOM bindings are of the correct type
      * for assignability to the underlying DOM element properties.
      */
    var checkTypeOfDomBindings: Boolean
    
    /**
      * Whether to infer the type of the `$event` variable in event bindings to DOM events.
      *
      * If this is `true`, the type of `$event` will be inferred based on TypeScript's
      * `HTMLElementEventMap`, with a fallback to the native `Event` type. If set to `false`, the
      * `$event` variable will be of type `any`.
      */
    var checkTypeOfDomEvents: Boolean
    
    /**
      * Whether to infer the type of local references to DOM elements.
      *
      * If this is `true`, the type of a `#ref` variable on a DOM node in the template will be
      * determined by the type of `document.createElement` for the given DOM node type. If set to
      * `false`, the type of `ref` for DOM nodes will be `any`.
      */
    var checkTypeOfDomReferences: Boolean
    
    /**
      * Whether to check the left-hand side type of binding operations.
      *
      * For example, if this is `false` then the expression `[input]="expr"` will have `expr` type-
      * checked, but not the assignment of the resulting type to the `input` property of whichever
      * directive or component is receiving the binding. If set to `true`, both sides of the assignment
      * are checked.
      *
      * This flag only affects bindings to components/directives. Bindings to the DOM are checked if
      * `checkTypeOfDomBindings` is set.
      */
    var checkTypeOfInputBindings: Boolean
    
    /**
      * Whether to infer the type of local references.
      *
      * If this is `true`, the type of a `#ref` variable that points to a directive or `TemplateRef` in
      * the template will be inferred correctly. If set to `false`, the type of `ref` for will be
      * `any`.
      */
    var checkTypeOfNonDomReferences: Boolean
    
    /**
      * Whether to infer the type of the `$event` variable in event bindings for directive outputs or
      * animation events.
      *
      * If this is `true`, the type of `$event` will be inferred based on the generic type of
      * `EventEmitter`/`Subject` of the output. If set to `false`, the `$event` variable will be of
      * type `any`.
      */
    var checkTypeOfOutputEvents: Boolean
    
    /**
      * Whether to include type information from pipes in the type-checking operation.
      *
      * If this is `true`, then the pipe's type signature for `transform()` will be used to check the
      * usage of the pipe. If this is `false`, then the result of applying a pipe will be `any`, and
      * the types of the pipe's value and arguments will not be matched against the `transform()`
      * method.
      */
    var checkTypeOfPipes: Boolean
    
    /**
      * Whether to adjust the output of the TCB to ensure compatibility with the `TemplateTypeChecker`.
      *
      * The statements generated in the TCB are optimized for performance and producing diagnostics.
      * These optimizations can result in generating a TCB that does not have all the information
      * needed by the `TemplateTypeChecker` for retrieving `Symbol`s. For example, as an optimization,
      * the TCB will not generate variable declaration statements for directives that have no
      * references, inputs, or outputs. However, the `TemplateTypeChecker` always needs these
      * statements to be present in order to provide `ts.Symbol`s and `ts.Type`s for the directives.
      *
      * When set to `false`, enables TCB optimizations for template diagnostics.
      * When set to `true`, ensures all information required by `TemplateTypeChecker` to
      * retrieve symbols for template nodes is available in the TCB.
      */
    var enableTemplateTypeChecker: Boolean
    
    /**
      * Whether to honor the access modifiers on input bindings for the component/directive.
      *
      * If a template binding attempts to assign to an input that is private/protected/readonly,
      * this will produce errors when enabled but will not when disabled.
      */
    var honorAccessModifiersForInputBindings: Boolean
    
    /**
      * Whether or not to infer types for object and array literals in the template.
      *
      * If this is `true`, then the type of an object or an array literal in the template will be the
      * same type that TypeScript would infer if the literal appeared in code. If `false`, then such
      * literals are cast to `any` when declared.
      */
    var strictLiteralTypes: Boolean
    
    /**
      * Whether to use strict null types for input bindings for directives.
      *
      * If this is `true`, applications that are compiled with TypeScript's `strictNullChecks` enabled
      * will produce type errors for bindings which can evaluate to `undefined` or `null` where the
      * inputs's type does not include `undefined` or `null` in its type. If set to `false`, all
      * binding expressions are wrapped in a non-null assertion operator to effectively disable strict
      * null checks. This may be particularly useful when the directive is from a library that is not
      * compiled with `strictNullChecks` enabled.
      *
      * If `checkTypeOfInputBindings` is set to `false`, this flag has no effect.
      */
    var strictNullInputBindings: Boolean
    
    /**
      * Whether to use a strict type for null-safe navigation operations.
      *
      * If this is `false`, then the return type of `a?.b` or `a?()` will be `any`. If set to `true`,
      * then the return type of `a?.b` for example will be the same as the type of the ternary
      * expression `a != null ? a.b : a`.
      */
    var strictSafeNavigationTypes: Boolean
    
    /**
      * Whether or not to produce diagnostic suggestions in cases where the compiler could have
      * inferred a better type for a construct, but was prevented from doing so by the current type
      * checking configuration.
      *
      * For example, if the compiler could have used a template context guard to infer a better type
      * for a structural directive's context and `let-` variables, but the user is in
      * `fullTemplateTypeCheck` mode and such guards are therefore disabled.
      *
      * This mode is useful for clients like the Language Service which want to inform users of
      * opportunities to improve their own developer experience.
      */
    var suggestionsForSuboptimalTypeInference: Boolean
    
    /**
      * Whether to use any generic types of the context component.
      *
      * If this is `true`, then if the context component has generic types, those will be mirrored in
      * the template type-checking context. If `false`, any generic type parameters of the context
      * component will be set to `any` during type-checking.
      */
    var useContextGenericType: Boolean
    
    /**
      * Whether to use inline type constructors.
      *
      * If this is `true`, create inline type constructors when required. For example, if a type
      * constructor's parameters has private types, it cannot be created normally, so we inline it in
      * the directives definition file.
      *
      * If false, do not create inline type constructors. Fall back to using `any` type for
      * constructors that normally require inlining.
      *
      * This option requires the environment to support inlining. If the environment does not support
      * inlining, this must be set to `false`.
      */
    var useInlineTypeConstructors: Boolean
  }
  object TypeCheckingConfig {
    
    inline def apply(
      alwaysCheckSchemaInTemplateBodies: Boolean,
      applyTemplateContextGuards: Boolean,
      checkTemplateBodies: Boolean,
      checkTypeOfAnimationEvents: Boolean,
      checkTypeOfAttributes: Boolean,
      checkTypeOfDomBindings: Boolean,
      checkTypeOfDomEvents: Boolean,
      checkTypeOfDomReferences: Boolean,
      checkTypeOfInputBindings: Boolean,
      checkTypeOfNonDomReferences: Boolean,
      checkTypeOfOutputEvents: Boolean,
      checkTypeOfPipes: Boolean,
      enableTemplateTypeChecker: Boolean,
      honorAccessModifiersForInputBindings: Boolean,
      strictLiteralTypes: Boolean,
      strictNullInputBindings: Boolean,
      strictSafeNavigationTypes: Boolean,
      suggestionsForSuboptimalTypeInference: Boolean,
      useContextGenericType: Boolean,
      useInlineTypeConstructors: Boolean
    ): TypeCheckingConfig = {
      val __obj = js.Dynamic.literal(alwaysCheckSchemaInTemplateBodies = alwaysCheckSchemaInTemplateBodies.asInstanceOf[js.Any], applyTemplateContextGuards = applyTemplateContextGuards.asInstanceOf[js.Any], checkQueries = false, checkTemplateBodies = checkTemplateBodies.asInstanceOf[js.Any], checkTypeOfAnimationEvents = checkTypeOfAnimationEvents.asInstanceOf[js.Any], checkTypeOfAttributes = checkTypeOfAttributes.asInstanceOf[js.Any], checkTypeOfDomBindings = checkTypeOfDomBindings.asInstanceOf[js.Any], checkTypeOfDomEvents = checkTypeOfDomEvents.asInstanceOf[js.Any], checkTypeOfDomReferences = checkTypeOfDomReferences.asInstanceOf[js.Any], checkTypeOfInputBindings = checkTypeOfInputBindings.asInstanceOf[js.Any], checkTypeOfNonDomReferences = checkTypeOfNonDomReferences.asInstanceOf[js.Any], checkTypeOfOutputEvents = checkTypeOfOutputEvents.asInstanceOf[js.Any], checkTypeOfPipes = checkTypeOfPipes.asInstanceOf[js.Any], enableTemplateTypeChecker = enableTemplateTypeChecker.asInstanceOf[js.Any], honorAccessModifiersForInputBindings = honorAccessModifiersForInputBindings.asInstanceOf[js.Any], strictLiteralTypes = strictLiteralTypes.asInstanceOf[js.Any], strictNullInputBindings = strictNullInputBindings.asInstanceOf[js.Any], strictSafeNavigationTypes = strictSafeNavigationTypes.asInstanceOf[js.Any], suggestionsForSuboptimalTypeInference = suggestionsForSuboptimalTypeInference.asInstanceOf[js.Any], useContextGenericType = useContextGenericType.asInstanceOf[js.Any], useInlineTypeConstructors = useInlineTypeConstructors.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeCheckingConfig]
    }
    
    extension [Self <: TypeCheckingConfig](x: Self) {
      
      inline def setAlwaysCheckSchemaInTemplateBodies(value: Boolean): Self = StObject.set(x, "alwaysCheckSchemaInTemplateBodies", value.asInstanceOf[js.Any])
      
      inline def setApplyTemplateContextGuards(value: Boolean): Self = StObject.set(x, "applyTemplateContextGuards", value.asInstanceOf[js.Any])
      
      inline def setCheckQueries(value: `false`): Self = StObject.set(x, "checkQueries", value.asInstanceOf[js.Any])
      
      inline def setCheckTemplateBodies(value: Boolean): Self = StObject.set(x, "checkTemplateBodies", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfAnimationEvents(value: Boolean): Self = StObject.set(x, "checkTypeOfAnimationEvents", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfAttributes(value: Boolean): Self = StObject.set(x, "checkTypeOfAttributes", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfDomBindings(value: Boolean): Self = StObject.set(x, "checkTypeOfDomBindings", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfDomEvents(value: Boolean): Self = StObject.set(x, "checkTypeOfDomEvents", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfDomReferences(value: Boolean): Self = StObject.set(x, "checkTypeOfDomReferences", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfInputBindings(value: Boolean): Self = StObject.set(x, "checkTypeOfInputBindings", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfNonDomReferences(value: Boolean): Self = StObject.set(x, "checkTypeOfNonDomReferences", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfOutputEvents(value: Boolean): Self = StObject.set(x, "checkTypeOfOutputEvents", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeOfPipes(value: Boolean): Self = StObject.set(x, "checkTypeOfPipes", value.asInstanceOf[js.Any])
      
      inline def setEnableTemplateTypeChecker(value: Boolean): Self = StObject.set(x, "enableTemplateTypeChecker", value.asInstanceOf[js.Any])
      
      inline def setHonorAccessModifiersForInputBindings(value: Boolean): Self = StObject.set(x, "honorAccessModifiersForInputBindings", value.asInstanceOf[js.Any])
      
      inline def setStrictLiteralTypes(value: Boolean): Self = StObject.set(x, "strictLiteralTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictNullInputBindings(value: Boolean): Self = StObject.set(x, "strictNullInputBindings", value.asInstanceOf[js.Any])
      
      inline def setStrictSafeNavigationTypes(value: Boolean): Self = StObject.set(x, "strictSafeNavigationTypes", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsForSuboptimalTypeInference(value: Boolean): Self = StObject.set(x, "suggestionsForSuboptimalTypeInference", value.asInstanceOf[js.Any])
      
      inline def setUseContextGenericType(value: Boolean): Self = StObject.set(x, "useContextGenericType", value.asInstanceOf[js.Any])
      
      inline def setUseInlineTypeConstructors(value: Boolean): Self = StObject.set(x, "useInlineTypeConstructors", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeCtorMetadata extends StObject {
    
    /**
      * Whether to generate a body for the function or not.
      */
    var body: Boolean
    
    /**
      * `Set` of field names which have type coercion enabled.
      */
    var coercedInputFields: Set[String]
    
    /**
      * Input, output, and query field names in the type which should be included as constructor input.
      */
    var fields: Inputs
    
    /**
      * The name of the requested type constructor function.
      */
    var fnName: String
  }
  object TypeCtorMetadata {
    
    inline def apply(body: Boolean, coercedInputFields: Set[String], fields: Inputs, fnName: String): TypeCtorMetadata = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], coercedInputFields = coercedInputFields.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], fnName = fnName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeCtorMetadata]
    }
    
    extension [Self <: TypeCtorMetadata](x: Self) {
      
      inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCoercedInputFields(value: Set[String]): Self = StObject.set(x, "coercedInputFields", value.asInstanceOf[js.Any])
      
      inline def setFields(value: Inputs): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFnName(value: String): Self = StObject.set(x, "fnName", value.asInstanceOf[js.Any])
    }
  }
}
