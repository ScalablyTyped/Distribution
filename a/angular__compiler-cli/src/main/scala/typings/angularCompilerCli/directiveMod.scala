package typings.angularCompilerCli

import typings.angularCompiler.mod.ParsedHostBindings
import typings.angularCompiler.mod.R3QueryMetadata
import typings.angularCompilerCli.metadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.metadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.ngtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.ngtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.scopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.semanticGraphMod.SemanticDepGraphUpdater
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.ClassMember
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.Decorator
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.transformSrcApiMod.HandlerFlags
import typings.angularCompilerCli.typeParametersMod.SemanticTypeParameter
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directiveMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", "DirectiveDecoratorHandler")
  @js.native
  open class DirectiveDecoratorHandler protected ()
    extends typings.angularCompilerCli.srcHandlerMod.DirectiveDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      semanticDepGraphUpdater: Null,
      annotateForClosureCompiler: Boolean,
      compileUndecoratedClassesWithAngularFeatures: Boolean,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      annotateForClosureCompiler: Boolean,
      compileUndecoratedClassesWithAngularFeatures: Boolean,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", "DirectiveSymbol")
  @js.native
  open class DirectiveSymbol protected ()
    extends typings.angularCompilerCli.srcSymbolMod.DirectiveSymbol {
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
  }
  
  inline def extractDirectiveMetadata(
    clazz: ClassDeclaration[DeclarationNode],
    decorator: Decorator | Null,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    isCore: Boolean,
    flags: HandlerFlags,
    annotateForClosureCompiler: Boolean
  ): js.UndefOr[typings.angularCompilerCli.anon.Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveMetadata")(clazz.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.angularCompilerCli.anon.Decorator]]
  inline def extractDirectiveMetadata(
    clazz: ClassDeclaration[DeclarationNode],
    decorator: Decorator | Null,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    isCore: Boolean,
    flags: HandlerFlags,
    annotateForClosureCompiler: Boolean,
    defaultSelector: String
  ): js.UndefOr[typings.angularCompilerCli.anon.Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveMetadata")(clazz.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], defaultSelector.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.angularCompilerCli.anon.Decorator]]
  
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
  
  inline def parseFieldArrayValue(directive: Map[String, Expression], field: String, evaluator: PartialEvaluator): Null | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFieldArrayValue")(directive.asInstanceOf[js.Any], field.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Null | js.Array[String]]
}
