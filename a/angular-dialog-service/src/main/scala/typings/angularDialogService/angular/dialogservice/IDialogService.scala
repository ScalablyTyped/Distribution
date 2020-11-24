package typings.angularDialogService.angular.dialogservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogService extends js.Object {
  
  /**
    * Opens a new confirm modal instance.
    */
  def confirm(header: String, msg: String): js.Any = js.native
  def confirm(header: String, msg: String, opts: IDialogOptions): js.Any = js.native
  
  /**
    * Opens a new custom modal instance.
    */
  def create(url: String, ctrlr: String, data: js.Any): js.Any = js.native
  def create(url: String, ctrlr: String, data: js.Any, opts: IDialogOptions): js.Any = js.native
  
  /**
    * Opens a new error modal instance.
    */
  def error(header: String, msg: String): js.Any = js.native
  def error(header: String, msg: String, opts: IDialogOptions): js.Any = js.native
  
  /**
    * Opens a new notify modal instance.
    */
  def notify(header: String, msg: String): js.Any = js.native
  def notify(header: String, msg: String, opts: IDialogOptions): js.Any = js.native
  
  /**
    * Opens a new wait modal instance.
    */
  def wait(header: String, msg: String, progress: Double): js.Any = js.native
  def wait(header: String, msg: String, progress: Double, opts: IDialogOptions): js.Any = js.native
}
