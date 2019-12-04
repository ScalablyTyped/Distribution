package typings.antd

import typings.antd.libTreeTreeMod.AntTreeNode
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tree/util", JSImport.Namespace)
@js.native
object libTreeUtilMod extends js.Object {
  def calcRangeKeys(rootChildren: js.Array[ReactNode], expandedKeys: js.Array[String]): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: js.Array[ReactNode], expandedKeys: js.Array[String], startKey: String): js.Array[String] = js.native
  def calcRangeKeys(
    rootChildren: js.Array[ReactNode],
    expandedKeys: js.Array[String],
    startKey: String,
    endKey: String
  ): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: ReactNode, expandedKeys: js.Array[String]): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: ReactNode, expandedKeys: js.Array[String], startKey: String): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: ReactNode, expandedKeys: js.Array[String], startKey: String, endKey: String): js.Array[String] = js.native
  def convertDirectoryKeysToNodes(rootChildren: js.Array[ReactNode], keys: js.Array[String]): js.Array[AntTreeNode] = js.native
  def convertDirectoryKeysToNodes(rootChildren: ReactNode, keys: js.Array[String]): js.Array[AntTreeNode] = js.native
  def getFullKeyList(children: js.Array[ReactNode]): js.Array[String] = js.native
  def getFullKeyList(children: ReactNode): js.Array[String] = js.native
  def getFullKeyListByTreeData(treeData: js.Array[_]): js.Array[_] = js.native
}

