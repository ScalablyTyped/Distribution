package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("antd-mobile/es/utils/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTreeDeep(treeData: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeDeep")(treeData.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTreeDeep(treeData: js.Array[Any], childrenName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeDeep")(treeData.asInstanceOf[js.Any], childrenName.asInstanceOf[js.Any])).asInstanceOf[Double]
}
