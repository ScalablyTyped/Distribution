package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogService
  extends StObject
     with // indexer used to call preset dialog created with $mdDialogProvider
// see: https://material.angularjs.org/latest/api/service/$mdDialog#custom-presets
// tslint:disable-next-line:ban-types
/* presetName */ StringDictionary[Function] {
  
  def alert(): IAlertDialog = js.native
  
  def cancel(): Unit = js.native
  def cancel(response: js.Any): Unit = js.native
  
  def confirm(): IConfirmDialog = js.native
  
  def hide(): IPromise[js.Any] = js.native
  def hide(response: js.Any): IPromise[js.Any] = js.native
  
  def prompt(): IPromptDialog = js.native
  
  def show(dialog: IAlertDialog): IPromise[js.Any] = js.native
  def show(dialog: IConfirmDialog): IPromise[js.Any] = js.native
  def show(dialog: IDialogOptions): IPromise[js.Any] = js.native
  def show(dialog: IPromptDialog): IPromise[js.Any] = js.native
}
