package typings.angularCompilerCli

import typings.angularCompiler.mod.ParsedHostBindings
import typings.angularCompiler.mod.R3QueryMetadata
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.anon.ClassDeclarationDeclaratiEnd
import typings.angularCompilerCli.srcNgtscAnnotationsCommonMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphSrcTypeParametersMod.SemanticTypeParameter
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsDirectiveMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", "DirectiveDecoratorHandler")
  @js.native
  open class DirectiveDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsDirectiveSrcHandlerMod.DirectiveDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      refEmitter: ReferenceEmitter,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      semanticDepGraphUpdater: Null,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      refEmitter: ReferenceEmitter,
      referencesRegistry: ReferencesRegistry,
      isCore: Boolean,
      strictCtorDeps: Boolean,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      annotateForClosureCompiler: Boolean,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", "DirectiveSymbol")
  @js.native
  open class DirectiveSymbol protected ()
    extends typings.angularCompilerCli.srcNgtscAnnotationsDirectiveSrcSymbolMod.DirectiveSymbol {
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiEnd,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
  }
  
  inline def extractDirectiveMetadata(
    clazz: ClassDeclarationDeclarati,
    decorator: Decorator | Null,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    refEmitter: ReferenceEmitter,
    referencesRegistry: ReferencesRegistry,
    isCore: Boolean,
    flags: HandlerFlags,
    annotateForClosureCompiler: Boolean
  ): js.UndefOr[typings.angularCompilerCli.anon.Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveMetadata")(clazz.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any], referencesRegistry.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.angularCompilerCli.anon.Decorator]]
  inline def extractDirectiveMetadata(
    clazz: ClassDeclarationDeclarati,
    decorator: Decorator | Null,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    refEmitter: ReferenceEmitter,
    referencesRegistry: ReferencesRegistry,
    isCore: Boolean,
    flags: HandlerFlags,
    annotateForClosureCompiler: Boolean,
    defaultSelector: String
  ): js.UndefOr[typings.angularCompilerCli.anon.Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveMetadata")(clazz.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any], referencesRegistry.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], defaultSelector.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.angularCompilerCli.anon.Decorator]]
  
  inline def extractHostBindings(members: js.Array[ClassMember], evaluator: PartialEvaluator): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  inline def extractHostBindings(members: js.Array[ClassMember], evaluator: PartialEvaluator, coreModule: String): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], coreModule.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  inline def extractHostBindings(
    members: js.Array[ClassMember],
    evaluator: PartialEvaluator,
    coreModule: String,
    metadata: Map[String, Expression]
  ): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], coreModule.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  inline def extractHostBindings(
    members: js.Array[ClassMember],
    evaluator: PartialEvaluator,
    coreModule: Unit,
    metadata: Map[String, Expression]
  ): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], coreModule.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  
  inline def extractQueryMetadata(
    exprNode: Node,
    name: String,
    args: js.Array[Expression],
    propertyName: String,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator
  ): R3QueryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("extractQueryMetadata")(exprNode.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[R3QueryMetadata]
  
  inline def parseFieldStringArrayValue(directive: Map[String, Expression], field: String, evaluator: PartialEvaluator): Null | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFieldStringArrayValue")(directive.asInstanceOf[js.Any], field.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Null | js.Array[String]]
}
