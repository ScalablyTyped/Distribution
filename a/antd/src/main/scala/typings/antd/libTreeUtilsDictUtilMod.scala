package typings.antd

import typings.antd.anon.EndKey
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeUtilsDictUtilMod {
  
  @JSImport("antd/lib/tree/utils/dictUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcRangeKeys(hasTreeDataExpandedKeysStartKeyEndKey: EndKey): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcRangeKeys")(hasTreeDataExpandedKeysStartKeyEndKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  
  inline def convertDirectoryKeysToNodes(treeData: js.Array[DataNode], keys: js.Array[Key]): js.Array[DataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDirectoryKeysToNodes")(treeData.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataNode]]
}
