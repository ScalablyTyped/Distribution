package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.StyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createByStyleSheetMod {
  
  @JSImport("@antv/g2/lib/theme/util/create-by-style-sheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createThemeByStyleSheet(styleSheet: StyleSheet): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemeByStyleSheet")(styleSheet.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
}
