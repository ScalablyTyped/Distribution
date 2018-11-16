package typings
package angularDashToastrLib.angularDashToastrMod.angularMod.toastrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastrService extends js.Object {
  /**
               * Return the number of active toasts in screen.
               */
  def active(): scala.Double = js.native
  /**
               * Remove toast from screen. If no toast is passed in, all toasts will be closed.
               *
               * @param {IToast} toast Optional toast object to delete
               */
  def clear(): scala.Unit = js.native
  /**
               * Remove toast from screen. If no toast is passed in, all toasts will be closed.
               *
               * @param {IToast} toast Optional toast object to delete
               */
  def clear(toast: IToast): scala.Unit = js.native
  /**
               * Create error toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def error(message: java.lang.String): IToast = js.native
  /**
               * Create error toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def error(message: java.lang.String, title: java.lang.String): IToast = js.native
  /**
               * Create error toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def error(message: java.lang.String, title: java.lang.String, options: IToastOptions): IToast = js.native
  /**
               * Create info toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def info(message: java.lang.String): IToast = js.native
  /**
               * Create info toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def info(message: java.lang.String, title: java.lang.String): IToast = js.native
  /**
               * Create info toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def info(message: java.lang.String, title: java.lang.String, options: IToastOptions): IToast = js.native
  /**
               * Create success toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def success(message: java.lang.String): IToast = js.native
  /**
               * Create success toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def success(message: java.lang.String, title: java.lang.String): IToast = js.native
  /**
               * Create success toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def success(message: java.lang.String, title: java.lang.String, options: IToastOptions): IToast = js.native
  /**
               * Create warning toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def warning(message: java.lang.String): IToast = js.native
  /**
               * Create warning toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def warning(message: java.lang.String, title: java.lang.String): IToast = js.native
  /**
               * Create warning toast notification message.
               *
               * @param {String} message Message to show on toast
               * @param {String} title Title to show on toast
               * @param {IToastOptions} options Override default toast options
               */
  def warning(message: java.lang.String, title: java.lang.String, options: IToastOptions): IToast = js.native
}

