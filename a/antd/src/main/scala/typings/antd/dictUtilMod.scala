package typings.antd

import typings.antd.anon.EndKey
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dictUtilMod {
  
  @JSImport("antd/lib/tree/utils/dictUtil", "calcRangeKeys")
  @js.native
  def calcRangeKeys(hasTreeDataExpandedKeysStartKeyEndKey: EndKey): js.Array[Key] = js.native
  
  @JSImport("antd/lib/tree/utils/dictUtil", "convertDirectoryKeysToNodes")
  @js.native
  def convertDirectoryKeysToNodes(treeData: js.Array[DataNode], keys: js.Array[Key]): js.Array[DataNode] = js.native
}
