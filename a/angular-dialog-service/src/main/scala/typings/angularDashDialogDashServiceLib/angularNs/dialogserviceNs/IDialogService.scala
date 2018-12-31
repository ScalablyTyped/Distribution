package typings
package angularDashDialogDashServiceLib.angularNs.dialogserviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogService extends js.Object {
  /**
    * Opens a new confirm modal instance.
    */
  def confirm(header: java.lang.String, msg: java.lang.String): js.Any = js.native
  def confirm(header: java.lang.String, msg: java.lang.String, opts: IDialogOptions): js.Any = js.native
  /**
    * Opens a new custom modal instance.
    */
  def create(url: java.lang.String, ctrlr: java.lang.String, data: js.Any): js.Any = js.native
  def create(url: java.lang.String, ctrlr: java.lang.String, data: js.Any, opts: IDialogOptions): js.Any = js.native
  /**
    * Opens a new error modal instance.
    */
  def error(header: java.lang.String, msg: java.lang.String): js.Any = js.native
  def error(header: java.lang.String, msg: java.lang.String, opts: IDialogOptions): js.Any = js.native
  /**
    * Opens a new notify modal instance.
    */
  def notify(header: java.lang.String, msg: java.lang.String): js.Any = js.native
  def notify(header: java.lang.String, msg: java.lang.String, opts: IDialogOptions): js.Any = js.native
  /**
    * Opens a new wait modal instance.
    */
  def wait(header: java.lang.String, msg: java.lang.String, progress: scala.Double): js.Any = js.native
  def wait(header: java.lang.String, msg: java.lang.String, progress: scala.Double, opts: IDialogOptions): js.Any = js.native
}

