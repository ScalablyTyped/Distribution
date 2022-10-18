package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcTreeHostTreeMod.HostTree
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FilePredicate
import typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeStaticMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def branch(tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("branch")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  
  inline def empty(): HostTree = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[HostTree]
  
  inline def merge(tree: Tree, other: Tree): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(tree.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Tree]
  inline def merge(tree: Tree, other: Tree, strategy: MergeStrategy): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(tree.asInstanceOf[js.Any], other.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  inline def partition(tree: Tree, predicate: FilePredicate[Boolean]): js.Tuple2[Tree, Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(tree.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Tree, Tree]]
}
