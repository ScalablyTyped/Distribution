package typings.antd

import typings.rcTabs.interfaceMod.AnimatedConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAnimateConfigMod {
  
  @JSImport("antd/lib/tabs/hooks/useAnimateConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(prefixCls: String): AnimatedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[AnimatedConfig]
  inline def default(prefixCls: String, animated: js.UndefOr[Boolean | AnimatedConfig]): AnimatedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[AnimatedConfig]
}
