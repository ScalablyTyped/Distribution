package typings.angularCompilerCli

import typings.angularCompiler.mod.ParsedHostBindings
import typings.angularCompiler.mod.R3QueryMetadata
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsDirectiveSrcSharedMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive/src/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
