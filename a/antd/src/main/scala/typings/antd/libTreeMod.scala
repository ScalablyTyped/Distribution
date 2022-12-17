package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.DirectoryTree
import typings.antd.anon.`5`
import typings.antd.libTreeTreeMod.TreeProps
import typings.rcTree.esInterfaceMod.DataNode
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type CompoundedComponent = (js.Function1[/* props */ PropsWithChildren[TreeProps[DataNode]] & `5`, ReactElement]) & DirectoryTree
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libTreeMod.foo` */
  override def _to: CompoundedComponent = default
}
