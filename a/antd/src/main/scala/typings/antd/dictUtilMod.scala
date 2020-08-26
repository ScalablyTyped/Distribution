package typings.antd

import typings.antd.anon.EndKey
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tree/utils/dictUtil", JSImport.Namespace)
@js.native
object dictUtilMod extends js.Object {
  def calcRangeKeys(hasTreeDataExpandedKeysStartKeyEndKey: EndKey): js.Array[Key] = js.native
  def convertDirectoryKeysToNodes(treeData: js.Array[DataNode], keys: js.Array[Key]): js.Array[DataNode] = js.native
}

