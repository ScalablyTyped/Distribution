package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogService
  extends // indexer used to call preset dialog created with $mdDialogProvider
// see: https://material.angularjs.org/latest/api/service/$mdDialog#custom-presets
// tslint:disable-next-line:ban-types
/* presetName */ org.scalablytyped.runtime.StringDictionary[angularLib.angularMod.Global.Function] {
  def alert(): IAlertDialog = js.native
  def cancel(): scala.Unit = js.native
  def cancel(response: js.Any): scala.Unit = js.native
  def confirm(): IConfirmDialog = js.native
  def hide(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def hide(response: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def prompt(): IPromptDialog = js.native
  def show(dialog: IAlertDialog): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def show(dialog: IConfirmDialog): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def show(dialog: IDialogOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def show(dialog: IPromptDialog): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

