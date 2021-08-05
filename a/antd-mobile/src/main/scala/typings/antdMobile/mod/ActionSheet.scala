package typings.antdMobile.mod

import typings.antdMobile.actionSheetMod.ActionCallBack
import typings.antdMobile.actionSheetMod.ActionSheetWithOptions
import typings.antdMobile.actionSheetMod.ShareActionSheetWithOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSheet {
  
  @JSImport("antd-mobile", "ActionSheet")
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  inline def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheetWithOptions")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheetWithOptions")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showShareActionSheetWithOptions")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
