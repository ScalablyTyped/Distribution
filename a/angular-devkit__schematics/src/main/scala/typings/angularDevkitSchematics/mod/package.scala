package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.anon.PartialExecutionOptions
import typings.angularDevkitSchematics.mod.^
import typings.angularDevkitSchematics.srcEngineInterfaceMod.FileOperator
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.angularDevkitSchematics.srcEngineInterfaceMod.SchematicContext
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Source
import typings.angularDevkitSchematics.srcRulesRandomMod.RandomOptions
import typings.angularDevkitSchematics.srcRulesTemplateMod.PathTemplateData
import typings.angularDevkitSchematics.srcRulesTemplateMod.PathTemplateOptions
import typings.angularDevkitSchematics.srcTreeActionMod.Action
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FilePredicate
import typings.rxjs.mod.Observable_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(options: RandomOptions): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Source]

inline def FileVisitorCancelToken: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("FileVisitorCancelToken").asInstanceOf[js.Symbol]

inline def TEMPLATE_FILENAME_RE: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("TEMPLATE_FILENAME_RE").asInstanceOf[js.RegExp]

inline def Tree: TreeConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Tree").asInstanceOf[TreeConstructor]
type Tree = typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree

inline def TreeSymbol: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("TreeSymbol").asInstanceOf[js.Symbol]

inline def apply(source: Source, rules: js.Array[Rule]): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(source.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Source]

inline def applyContentTemplate[T](options: T): FileOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("applyContentTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[FileOperator]

inline def applyPathTemplate[T /* <: PathTemplateData */](data: T): FileOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPathTemplate")(data.asInstanceOf[js.Any]).asInstanceOf[FileOperator]
inline def applyPathTemplate[T /* <: PathTemplateData */](data: T, options: PathTemplateOptions): FileOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPathTemplate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileOperator]

inline def applyTemplates[T /* <: js.Object */](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTemplates")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def applyToSubtree(path: String, rules: js.Array[Rule]): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToSubtree")(path.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def asSource(rule: Rule): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("asSource")(rule.asInstanceOf[js.Any]).asInstanceOf[Source]

inline def branchAndMerge(rule: Rule): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("branchAndMerge")(rule.asInstanceOf[js.Any]).asInstanceOf[Rule]
inline def branchAndMerge(rule: Rule, strategy: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("branchAndMerge")(rule.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def callRule(
  rule: Rule,
  input: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
  context: SchematicContext
): Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree]]
inline def callRule(
  rule: Rule,
  input: Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree],
  context: SchematicContext
): Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree]]

inline def callSource(source: Source, context: SchematicContext): Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree]]

inline def chain(rules: js.Iterable[Rule]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(rules.asInstanceOf[js.Any]).asInstanceOf[Rule]
inline def chain(rules: AsyncIterable[Rule]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(rules.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def composeFileOperators(operators: js.Array[FileOperator]): FileOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("composeFileOperators")(operators.asInstanceOf[js.Any]).asInstanceOf[FileOperator]

inline def contentTemplate[T](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("contentTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def empty(): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Source]

inline def externalSchematic[OptionT /* <: js.Object */](collectionName: String, schematicName: String, options: OptionT): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("externalSchematic")(collectionName.asInstanceOf[js.Any], schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
inline def externalSchematic[OptionT /* <: js.Object */](
  collectionName: String,
  schematicName: String,
  options: OptionT,
  executionOptions: PartialExecutionOptions
): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("externalSchematic")(collectionName.asInstanceOf[js.Any], schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], executionOptions.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def filter(predicate: FilePredicate[Boolean]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def forEach(operator: FileOperator): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(operator.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def isContentAction(action: Action): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContentAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def mergeWith(source: Source): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeWith")(source.asInstanceOf[js.Any]).asInstanceOf[Rule]
inline def mergeWith(source: Source, strategy: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeWith")(source.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def move(from: String): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(from.asInstanceOf[js.Any]).asInstanceOf[Rule]
inline def move(from: String, to: String): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def noop(): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Rule]

inline def partitionApplyMerge(predicate: FilePredicate[Boolean], ruleYes: Rule): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionApplyMerge")(predicate.asInstanceOf[js.Any], ruleYes.asInstanceOf[js.Any])).asInstanceOf[Rule]
inline def partitionApplyMerge(predicate: FilePredicate[Boolean], ruleYes: Rule, ruleNo: Rule): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionApplyMerge")(predicate.asInstanceOf[js.Any], ruleYes.asInstanceOf[js.Any], ruleNo.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def pathTemplate[T /* <: PathTemplateData */](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("pathTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def renameTemplateFiles(): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTemplateFiles")().asInstanceOf[Rule]

inline def schematic[OptionT /* <: js.Object */](schematicName: String, options: OptionT): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("schematic")(schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
inline def schematic[OptionT /* <: js.Object */](schematicName: String, options: OptionT, executionOptions: PartialExecutionOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("schematic")(schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], executionOptions.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def source(tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(tree.asInstanceOf[js.Any]).asInstanceOf[Source]

inline def template[T /* <: js.Object */](options: T): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]

inline def url(urlString: String): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(urlString.asInstanceOf[js.Any]).asInstanceOf[Source]

inline def when(predicate: FilePredicate[Boolean], operator: FileOperator): FileOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[FileOperator]
