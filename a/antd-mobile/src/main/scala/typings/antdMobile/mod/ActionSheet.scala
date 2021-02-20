package typings.antdMobile.mod

import typings.antdMobile.actionSheetMod.ActionCallBack
import typings.antdMobile.actionSheetMod.ActionSheetWithOptions
import typings.antdMobile.actionSheetMod.ShareActionSheetWithOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSheet {
  
  @JSImport("antd-mobile", "ActionSheet.close")
  @js.native
  def close(): Unit = js.native
  
  @JSImport("antd-mobile", "ActionSheet.showActionSheetWithOptions")
  @js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = js.native
  @JSImport("antd-mobile", "ActionSheet.showActionSheetWithOptions")
  @js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
  
  @JSImport("antd-mobile", "ActionSheet.showShareActionSheetWithOptions")
  @js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = js.native
  @JSImport("antd-mobile", "ActionSheet.showShareActionSheetWithOptions")
  @js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
}
