package typings.antDesignProLayout

import typings.antDesignProLayout.typingsMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/pro-layout/lib/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearMenuItem(menusData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMenuItem")(menusData.asInstanceOf[js.Any]).asInstanceOf[js.Array[MenuDataItem]]
  
  @scala.inline
  def genStringToTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genStringToTheme")().asInstanceOf[String]
  @scala.inline
  def genStringToTheme(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genStringToTheme")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def genThemeToString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genThemeToString")().asInstanceOf[String]
  @scala.inline
  def genThemeToString(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genThemeToString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getOpenKeysFromMenuData(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenKeysFromMenuData")().asInstanceOf[js.Array[String]]
  @scala.inline
  def getOpenKeysFromMenuData(menuData: js.Array[MenuDataItem]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenKeysFromMenuData")(menuData.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
