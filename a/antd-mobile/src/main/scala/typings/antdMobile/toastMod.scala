package typings.antdMobile

import typings.antdMobile.anon.PickToastPropsdurationpos
import typings.antdMobile.toastMethodsMod.ToastHandler
import typings.antdMobile.toastMethodsMod.ToastShowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  object default {
    
    @JSImport("antd-mobile/es/components/toast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/toast", "default.clear")
    @js.native
    def clear: js.Function0[Unit] = js.native
    inline def clear_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/toast", "default.config")
    @js.native
    def config: js.Function1[/* val */ PickToastPropsdurationpos, Unit] = js.native
    inline def config_=(x: js.Function1[/* val */ PickToastPropsdurationpos, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/toast", "default.show")
    @js.native
    def show: js.Function1[/* p */ ToastShowProps | String, ToastHandler] = js.native
    inline def show_=(x: js.Function1[/* p */ ToastShowProps | String, ToastHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
  }
}
