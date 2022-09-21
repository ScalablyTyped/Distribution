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
  def cancel(response: Any): Unit = js.native
  
  def confirm(): IConfirmDialog = js.native
  
  def hide(): IPromise[Any] = js.native
  def hide(response: Any): IPromise[Any] = js.native
  
  def prompt(): IPromptDialog = js.native
  
  def show(dialog: IAlertDialog): IPromise[Any] = js.native
  def show(dialog: IConfirmDialog): IPromise[Any] = js.native
  def show(dialog: IDialogOptions): IPromise[Any] = js.native
  def show(dialog: IPromptDialog): IPromise[Any] = js.native
}
