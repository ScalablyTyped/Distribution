package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libThemeUtilCreateThemeMod.ThemeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemeUtilMod {
  
  @JSImport("@antv/g2/lib/theme/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(themeCfg: ThemeCfg): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(themeCfg.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
}
