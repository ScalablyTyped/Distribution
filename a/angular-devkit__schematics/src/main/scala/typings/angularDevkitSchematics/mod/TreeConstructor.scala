package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.srcTreeInterfaceMod.FilePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeConstructor extends StObject {
  
  def branch(tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree): typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def empty(): typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def merge(
    tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    other: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
  ): typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  def merge(
    tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    other: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree,
    strategy: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy
  ): typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def optimize(tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree): typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree = js.native
  
  def partition(tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree, predicate: FilePredicate[Boolean]): js.Tuple2[
    typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree, 
    typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
  ] = js.native
}
