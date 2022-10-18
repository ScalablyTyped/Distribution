package typings.antd

import typings.antd.libConfigProviderContextMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigProviderCssVariablesMod {
  
  @JSImport("antd/lib/config-provider/cssVariables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyle(globalPrefixCls: String, theme: Theme): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(globalPrefixCls.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def registerTheme(globalPrefixCls: String, theme: Theme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(globalPrefixCls.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
