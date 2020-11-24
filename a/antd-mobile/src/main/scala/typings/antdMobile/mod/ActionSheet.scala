package typings.antdMobile.mod

import typings.antdMobile.actionSheetMod.ActionCallBack
import typings.antdMobile.actionSheetMod.ActionSheetWithOptions
import typings.antdMobile.actionSheetMod.ShareActionSheetWithOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "ActionSheet")
@js.native
object ActionSheet extends js.Object {
  
  def close(): Unit = js.native
  
  def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
  
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
}
