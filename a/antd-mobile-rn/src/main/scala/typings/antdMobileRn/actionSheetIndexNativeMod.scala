package typings.antdMobileRn

import typings.reactNative.mod.ActionSheetIOSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionSheetIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/action-sheet/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    
    inline def showActionSheetWithOptions(config: ActionSheetIOSOptions, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheetWithOptions")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def showShareActionSheetWithOptions(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def showShareActionSheetWithOptions(config: js.Any, failureCallback: js.Function1[/* arg0 */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def showShareActionSheetWithOptions(
      config: js.Any,
      failureCallback: js.Function1[/* arg0 */ js.Any, Unit],
      successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def showShareActionSheetWithOptions(
      config: js.Any,
      failureCallback: Unit,
      successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
