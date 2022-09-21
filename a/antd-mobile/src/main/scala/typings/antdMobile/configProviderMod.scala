package typings.antdMobile

import typings.antdMobile.configProviderConfigProviderMod.Config
import typings.antdMobile.configProviderConfigProviderMod.ConfigProviderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configProviderMod {
  
  @JSImport("antd-mobile/es/components/config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile/es/components/config-provider", JSImport.Default)
  @js.native
  val default: FC[ConfigProviderProps] = js.native
  
  inline def getDefaultConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")().asInstanceOf[Config]
  
  inline def setDefaultConfig(config: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("useConfig")().asInstanceOf[Config]
}
