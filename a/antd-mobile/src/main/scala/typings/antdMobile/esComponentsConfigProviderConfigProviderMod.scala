package typings.antdMobile

import typings.antdMobile.esLocalesBaseMod.Locale
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsConfigProviderConfigProviderMod {
  
  @JSImport("antd-mobile/es/components/config-provider/config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile/es/components/config-provider/config-provider", "ConfigProvider")
  @js.native
  val ConfigProvider: FC[ConfigProviderProps] = js.native
  
  object defaultConfigRef {
    
    @JSImport("antd-mobile/es/components/config-provider/config-provider", "defaultConfigRef")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/config-provider/config-provider", "defaultConfigRef.current")
    @js.native
    def current: Config = js.native
    inline def current_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")().asInstanceOf[Config]
  
  inline def setDefaultConfig(config: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("useConfig")().asInstanceOf[Config]
  
  trait Config extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var locale: Locale
  }
  object Config {
    
    inline def apply(locale: Locale): Config = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigProviderProps = Config
}
