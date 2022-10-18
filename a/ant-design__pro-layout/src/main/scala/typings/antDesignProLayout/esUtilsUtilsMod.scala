package typings.antDesignProLayout

import typings.antDesignProLayout.esTypingsMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUtilsMod {
  
  @JSImport("@ant-design/pro-layout/es/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearMenuItem(menusData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMenuItem")(menusData.asInstanceOf[js.Any]).asInstanceOf[js.Array[MenuDataItem]]
  
  inline def genStringToTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genStringToTheme")().asInstanceOf[String]
  inline def genStringToTheme(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genStringToTheme")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOpenKeysFromMenuData(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenKeysFromMenuData")().asInstanceOf[js.Array[String]]
  inline def getOpenKeysFromMenuData(menuData: js.Array[MenuDataItem]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenKeysFromMenuData")(menuData.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
