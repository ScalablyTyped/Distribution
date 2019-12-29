package typings.angularDashToastr.angularDashToastrMod.angularMod.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastrService extends js.Object {
  /**
    * Return the number of active toasts in screen.
    */
  def active(): Double = js.native
  /**
    * Remove toast from screen. If no toast is passed in, all toasts will be closed.
    *
    * @param {IToast} toast Optional toast object to delete
    */
  def clear(): Unit = js.native
  def clear(toast: IToast): Unit = js.native
  /**
    * Create error toast notification message.
    *
    * @param {String} message Message to show on toast
    * @param {String} title Title to show on toast
    * @param {IToastOptions} options Override default toast options
    */
  def error(message: String): IToast = js.native
  def error(message: String, title: String): IToast = js.native
  def error(message: String, title: String, options: IToastOptions): IToast = js.native
  /**
    * Create info toast notification message.
    *
    * @param {String} message Message to show on toast
    * @param {String} title Title to show on toast
    * @param {IToastOptions} options Override default toast options
    */
  def info(message: String): IToast = js.native
  def info(message: String, title: String): IToast = js.native
  def info(message: String, title: String, options: IToastOptions): IToast = js.native
  /**
    * Create success toast notification message.
    *
    * @param {String} message Message to show on toast
    * @param {String} title Title to show on toast
    * @param {IToastOptions} options Override default toast options
    */
  def success(message: String): IToast = js.native
  def success(message: String, title: String): IToast = js.native
  def success(message: String, title: String, options: IToastOptions): IToast = js.native
  /**
    * Create warning toast notification message.
    *
    * @param {String} message Message to show on toast
    * @param {String} title Title to show on toast
    * @param {IToastOptions} options Override default toast options
    */
  def warning(message: String): IToast = js.native
  def warning(message: String, title: String): IToast = js.native
  def warning(message: String, title: String, options: IToastOptions): IToast = js.native
}

