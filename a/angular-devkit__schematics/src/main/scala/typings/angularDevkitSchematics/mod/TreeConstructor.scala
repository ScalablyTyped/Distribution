package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.treeInterfaceMod.FilePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeConstructor extends StObject {
  
  def branch(tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree): typings.angularDevkitSchematics.treeInterfaceMod.Tree = js.native
  
  def empty(): typings.angularDevkitSchematics.treeInterfaceMod.Tree = js.native
  
  def merge(
    tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree,
    other: typings.angularDevkitSchematics.treeInterfaceMod.Tree
  ): typings.angularDevkitSchematics.treeInterfaceMod.Tree = js.native
  def merge(
    tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree,
    other: typings.angularDevkitSchematics.treeInterfaceMod.Tree,
    strategy: typings.angularDevkitSchematics.treeInterfaceMod.MergeStrategy
  ): typings.angularDevkitSchematics.treeInterfaceMod.Tree = js.native
  
  def optimize(tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree): typings.angularDevkitSchematics.treeInterfaceMod.Tree = js.native
  
  def partition(tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree, predicate: FilePredicate[Boolean]): js.Tuple2[
    typings.angularDevkitSchematics.treeInterfaceMod.Tree, 
    typings.angularDevkitSchematics.treeInterfaceMod.Tree
  ] = js.native
}
