package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.interfaceMod.FileOperator
import typings.angularDevkitSchematics.interfaceMod.Rule
import typings.angularDevkitSchematics.interfaceMod.Source
import typings.angularDevkitSchematics.treeInterfaceMod.FilePredicate
import typings.angularDevkitSchematics.treeInterfaceMod.MergeStrategy
import typings.angularDevkitSchematics.treeInterfaceMod.Tree
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(source: Source, rules: js.Array[Rule]): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(source.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Source]
  
  inline def applyToSubtree(path: String, rules: js.Array[Rule]): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToSubtree")(path.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def asSource(rule: Rule): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("asSource")(rule.asInstanceOf[js.Any]).asInstanceOf[Source]
  
  inline def branchAndMerge(rule: Rule): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("branchAndMerge")(rule.asInstanceOf[js.Any]).asInstanceOf[Rule]
  inline def branchAndMerge(rule: Rule, strategy: MergeStrategy): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("branchAndMerge")(rule.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def chain(rules: js.Iterable[Rule]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(rules.asInstanceOf[js.Any]).asInstanceOf[Rule]
  inline def chain(rules: AsyncIterable[Rule]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(rules.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def composeFileOperators(operators: js.Array[FileOperator]): FileOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("composeFileOperators")(operators.asInstanceOf[js.Any]).asInstanceOf[FileOperator]
  
  inline def empty(): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Source]
  
  inline def filter(predicate: FilePredicate[Boolean]): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def forEach(operator: FileOperator): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(operator.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def mergeWith(source: Source): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeWith")(source.asInstanceOf[js.Any]).asInstanceOf[Rule]
  inline def mergeWith(source: Source, strategy: MergeStrategy): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeWith")(source.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def noop(): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Rule]
  
  inline def partitionApplyMerge(predicate: FilePredicate[Boolean], ruleYes: Rule): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionApplyMerge")(predicate.asInstanceOf[js.Any], ruleYes.asInstanceOf[js.Any])).asInstanceOf[Rule]
  inline def partitionApplyMerge(predicate: FilePredicate[Boolean], ruleYes: Rule, ruleNo: Rule): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionApplyMerge")(predicate.asInstanceOf[js.Any], ruleYes.asInstanceOf[js.Any], ruleNo.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def source(tree: Tree): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(tree.asInstanceOf[js.Any]).asInstanceOf[Source]
  
  inline def when(predicate: FilePredicate[Boolean], operator: FileOperator): FileOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[FileOperator]
}
