package typings.angularCompilerCli

import typings.angularCompiler.mod.FactoryTarget
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3CompiledExpression
import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompiler.mod.R3FactoryMetadata
import typings.angularCompiler.mod.R3Reference
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompiler.mod.Statement
import typings.angularCompilerCli.angularCompilerCliStrings.dynamic
import typings.angularCompilerCli.angularCompilerCliStrings.invalid
import typings.angularCompilerCli.angularCompilerCliStrings.target
import typings.angularCompilerCli.diMod.ConstructorDeps
import typings.angularCompilerCli.emitterMod.ImportedFile
import typings.angularCompilerCli.localMod.DeclarationData
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.ngtscDiagnosticsMod.FatalDiagnosticError
import typings.angularCompilerCli.ngtscImportsMod.ModuleResolver
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.ngtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.resultMod.ResolvedValue
import typings.angularCompilerCli.scopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.Decorator
import typings.angularCompilerCli.srcHostMod.ImportedTypeValueReference
import typings.angularCompilerCli.srcHostMod.LocalTypeValueReference
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.srcHostMod.TypeValueReference
import typings.angularCompilerCli.srcInterfaceMod.ForeignFunctionResolver
import typings.angularCompilerCli.transformSrcApiMod.CompileResult
import typings.std.Map
import typings.std.Omit
import typings.std.Set
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common", "NoopReferencesRegistry")
  @js.native
  open class NoopReferencesRegistry ()
    extends typings.angularCompilerCli.referencesRegistryMod.NoopReferencesRegistry
  
  inline def checkInheritanceOfDirective(
    node: ClassDeclaration[DeclarationNode],
    reader: MetadataReader,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator
  ): Diagnostic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkInheritanceOfDirective")(node.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Diagnostic | Null]
  
  inline def combineResolvers(resolvers: js.Array[ForeignFunctionResolver]): ForeignFunctionResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("combineResolvers")(resolvers.asInstanceOf[js.Any]).asInstanceOf[ForeignFunctionResolver]
  
  inline def compileDeclareFactory(metadata: R3FactoryMetadata): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareFactory")(metadata.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileNgFactoryDefField(metadata: R3FactoryMetadata): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileNgFactoryDefField")(metadata.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileResults(fac: CompileResult, `def`: R3CompiledExpression, metadataStmt: Null, propName: String): js.Array[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileResults")(fac.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], metadataStmt.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[CompileResult]]
  inline def compileResults(fac: CompileResult, `def`: R3CompiledExpression, metadataStmt: Statement, propName: String): js.Array[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileResults")(fac.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], metadataStmt.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[CompileResult]]
  
  inline def createSourceSpan(node: Node): ParseSourceSpan = ^.asInstanceOf[js.Dynamic].applyDynamic("createSourceSpan")(node.asInstanceOf[js.Any]).asInstanceOf[ParseSourceSpan]
  
  inline def createValueHasWrongTypeError(node: Node, value: ResolvedValue, messageText: String): FatalDiagnosticError = (^.asInstanceOf[js.Dynamic].applyDynamic("createValueHasWrongTypeError")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[FatalDiagnosticError]
  
  inline def extractClassMetadata(clazz: DeclarationNode, reflection: ReflectionHost, isCore: Boolean): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  inline def extractClassMetadata(
    clazz: DeclarationNode,
    reflection: ReflectionHost,
    isCore: Boolean,
    annotateForClosureCompiler: Boolean
  ): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  inline def extractClassMetadata(
    clazz: DeclarationNode,
    reflection: ReflectionHost,
    isCore: Boolean,
    annotateForClosureCompiler: Boolean,
    angularDecoratorTransform: js.Function1[/* dec */ Decorator, Decorator]
  ): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], angularDecoratorTransform.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  inline def extractClassMetadata(
    clazz: DeclarationNode,
    reflection: ReflectionHost,
    isCore: Boolean,
    annotateForClosureCompiler: Unit,
    angularDecoratorTransform: js.Function1[/* dec */ Decorator, Decorator]
  ): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], angularDecoratorTransform.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  
  inline def extractSchemas(rawExpr: Expression, evaluator: PartialEvaluator, context: String): js.Array[SchemaMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractSchemas")(rawExpr.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[SchemaMetadata]]
  
  inline def findAngularDecorator(decorators: js.Array[Decorator], name: String, isCore: Boolean): js.UndefOr[Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAngularDecorator")(decorators.asInstanceOf[js.Any], name.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Decorator]]
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common", "forwardRefResolver")
  @js.native
  val forwardRefResolver: ForeignFunctionResolver = js.native
  
  inline def getConstructorDependencies(clazz: ClassDeclaration[DeclarationNode], reflector: ReflectionHost, isCore: Boolean): ConstructorDeps | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorDependencies")(clazz.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[ConstructorDeps | Null]
  
  inline def getDirectiveDiagnostics(
    node: ClassDeclaration[DeclarationNode],
    reader: MetadataReader,
    evaluator: PartialEvaluator,
    reflector: ReflectionHost,
    scopeRegistry: LocalModuleScopeRegistry,
    kind: String
  ): js.Array[Diagnostic] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectiveDiagnostics")(node.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], scopeRegistry.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic] | Null]
  
  inline def getOriginNodeForDiagnostics(expr: Expression, container: Expression): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginNodeForDiagnostics")(expr.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def getProviderDiagnostics(
    providerClasses: Set[Reference[ClassDeclaration[DeclarationNode]]],
    providersDeclaration: Expression,
    registry: InjectableClassRegistry
  ): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProviderDiagnostics")(providerClasses.asInstanceOf[js.Any], providersDeclaration.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  
  inline def getUndecoratedClassWithAngularFeaturesDiagnostic(node: ClassDeclaration[DeclarationNode]): Diagnostic = ^.asInstanceOf[js.Dynamic].applyDynamic("getUndecoratedClassWithAngularFeaturesDiagnostic")(node.asInstanceOf[js.Any]).asInstanceOf[Diagnostic]
  
  inline def getValidConstructorDependencies(clazz: ClassDeclaration[DeclarationNode], reflector: ReflectionHost, isCore: Boolean): js.Array[R3DependencyMetadata] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidConstructorDependencies")(clazz.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[js.Array[R3DependencyMetadata] | Null]
  
  inline def isAngularCore(decorator: Decorator): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngularCore")(decorator.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAngularCoreReference(reference: Reference[Node], symbolName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngularCoreReference")(reference.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAngularDecorator(decorator: Decorator, name: String, isCore: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngularDecorator")(decorator.asInstanceOf[js.Any], name.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArray(value: ResolvedValue): /* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue> */ Boolean]
  
  inline def isClassReferenceArray(resolvedValue: ResolvedValue): /* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/imports.Reference<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ClassDeclaration<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DeclarationNode>>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassReferenceArray")(resolvedValue.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/imports.Reference<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ClassDeclaration<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DeclarationNode>>> */ Boolean]
  
  inline def isExpressionForwardReference(expr: typings.angularCompiler.mod.Expression, context: Node, contextSource: SourceFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionForwardReference")(expr.asInstanceOf[js.Any], context.asInstanceOf[js.Any], contextSource.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStringArray(resolvedValue: ResolvedValue): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringArray")(resolvedValue.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  
  inline def isWrappedTsNodeExpr(expr: typings.angularCompiler.mod.Expression): /* is @angular/compiler.@angular/compiler.WrappedNodeExpr<typescript.typescript.Node> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrappedTsNodeExpr")(expr.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler.@angular/compiler.WrappedNodeExpr<typescript.typescript.Node> */ Boolean]
  
  inline def makeDuplicateDeclarationError(node: ClassDeclaration[DeclarationNode], data: js.Array[DeclarationData], kind: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDuplicateDeclarationError")(node.asInstanceOf[js.Any], data.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  
  inline def readBaseClass(node: ClassDeclaration[DeclarationNode], reflector: ReflectionHost, evaluator: PartialEvaluator): Reference[ClassDeclaration[DeclarationNode]] | dynamic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readBaseClass")(node.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Reference[ClassDeclaration[DeclarationNode]] | dynamic | Null]
  
  inline def resolveEnumValue(
    evaluator: PartialEvaluator,
    metadata: Map[String, Expression],
    field: String,
    enumSymbolName: String
  ): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnumValue")(evaluator.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], field.asInstanceOf[js.Any], enumSymbolName.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def resolveImportedFile(
    moduleResolver: ModuleResolver,
    importedFile: ImportedFile,
    expr: typings.angularCompiler.mod.Expression,
    origin: SourceFile
  ): SourceFile | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveImportedFile")(moduleResolver.asInstanceOf[js.Any], importedFile.asInstanceOf[js.Any], expr.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[SourceFile | Null]
  
  inline def resolveLiteral(decorator: Decorator, literalCache: Map[Decorator, ObjectLiteralExpression]): ObjectLiteralExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLiteral")(decorator.asInstanceOf[js.Any], literalCache.asInstanceOf[js.Any])).asInstanceOf[ObjectLiteralExpression]
  
  inline def resolveProvidersRequiringFactory(rawProviders: Expression, reflector: ReflectionHost, evaluator: PartialEvaluator): Set[Reference[ClassDeclaration[DeclarationNode]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProvidersRequiringFactory")(rawProviders.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Set[Reference[ClassDeclaration[DeclarationNode]]]]
  
  inline def toFactoryMetadata_target(meta: Omit[R3FactoryMetadata, target], target: FactoryTarget): R3FactoryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("toFactoryMetadata")(meta.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[R3FactoryMetadata]
  
  inline def toR3Reference(
    origin: Node,
    valueRef: Reference[Node],
    typeRef: Reference[Node],
    valueContext: SourceFile,
    typeContext: SourceFile,
    refEmitter: ReferenceEmitter
  ): R3Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("toR3Reference")(origin.asInstanceOf[js.Any], valueRef.asInstanceOf[js.Any], typeRef.asInstanceOf[js.Any], valueContext.asInstanceOf[js.Any], typeContext.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any])).asInstanceOf[R3Reference]
  
  inline def tryUnwrapForwardRef(node: Expression, reflector: ReflectionHost): Expression | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tryUnwrapForwardRef")(node.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[Expression | Null]
  
  inline def unwrapConstructorDependencies(): js.Array[R3DependencyMetadata] | invalid | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapConstructorDependencies")().asInstanceOf[js.Array[R3DependencyMetadata] | invalid | Null]
  inline def unwrapConstructorDependencies(deps: ConstructorDeps): js.Array[R3DependencyMetadata] | invalid | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapConstructorDependencies")(deps.asInstanceOf[js.Any]).asInstanceOf[js.Array[R3DependencyMetadata] | invalid | Null]
  
  inline def unwrapExpression(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def validateConstructorDependencies(clazz: ClassDeclaration[DeclarationNode]): js.Array[R3DependencyMetadata] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConstructorDependencies")(clazz.asInstanceOf[js.Any]).asInstanceOf[js.Array[R3DependencyMetadata] | Null]
  inline def validateConstructorDependencies(clazz: ClassDeclaration[DeclarationNode], deps: ConstructorDeps): js.Array[R3DependencyMetadata] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConstructorDependencies")(clazz.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Array[R3DependencyMetadata] | Null]
  
  inline def valueReferenceToExpression(valueRef: ImportedTypeValueReference): typings.angularCompiler.mod.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueReferenceToExpression")(valueRef.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.mod.Expression]
  inline def valueReferenceToExpression(valueRef: LocalTypeValueReference): typings.angularCompiler.mod.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueReferenceToExpression")(valueRef.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.mod.Expression]
  inline def valueReferenceToExpression(valueRef: TypeValueReference): typings.angularCompiler.mod.Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("valueReferenceToExpression")(valueRef.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.mod.Expression | Null]
  
  inline def wrapFunctionExpressionsInParens(expression: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapFunctionExpressionsInParens")(expression.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def wrapTypeReference(reflector: ReflectionHost, clazz: ClassDeclaration[DeclarationNode]): R3Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTypeReference")(reflector.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[R3Reference]
}
