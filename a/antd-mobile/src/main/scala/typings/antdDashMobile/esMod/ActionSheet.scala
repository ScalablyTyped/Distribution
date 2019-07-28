package typings.antdDashMobile.esMod

import typings.antdDashMobile.esActionDashSheetMod.ActionCallBack
import typings.antdDashMobile.esActionDashSheetMod.ActionSheetWithOptions
import typings.antdDashMobile.esActionDashSheetMod.ShareActionSheetWithOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/es", "ActionSheet")
@js.native
object ActionSheet extends js.Object {
  def close(): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
}

