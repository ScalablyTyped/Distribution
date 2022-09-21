package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.StyleSheetCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeMod {
  
  @JSImport("@antv/g2/lib/theme/util/create-theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(themeCfg: ThemeCfg): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(themeCfg.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  
  trait ThemeCfg
    extends StObject
       with LooseObject {
    
    var styleSheet: js.UndefOr[StyleSheetCfg] = js.undefined
  }
  object ThemeCfg {
    
    inline def apply(): ThemeCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeCfg]
    }
    
    extension [Self <: ThemeCfg](x: Self) {
      
      inline def setStyleSheet(value: StyleSheetCfg): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
    }
  }
}
