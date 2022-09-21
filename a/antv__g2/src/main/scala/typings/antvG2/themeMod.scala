package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("@antv/g2/lib/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTheme(): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[LooseObject]
  inline def getTheme(theme: String): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  
  inline def registerTheme(theme: String, value: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
