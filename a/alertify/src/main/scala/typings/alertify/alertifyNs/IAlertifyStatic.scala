package typings.alertify.alertifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlertifyStatic extends js.Object {
  /**
    * The labels used for dialog buttons
    */
  var labels: ILabels = js.native
  /**
    * Create an alert dialog box
    * @param message   The message passed from the callee
    * @param fn        Callback function
    * @param cssClass  Class(es) to append to dialog box
    * @return alertify (ie this)
    * @since 0.0.1
    */
  def alert(message: String): IAlertifyStatic = js.native
  def alert(message: String, fn: js.Function): IAlertifyStatic = js.native
  def alert(message: String, fn: js.Function, cssClass: String): IAlertifyStatic = js.native
  /**
    * Create a confirm dialog box
    * @param message   The message passed from the callee
    * @param fn        Callback function
    * @param cssClass  Class(es) to append to dialog box
    * @return alertify (ie this)
    * @since 0.0.1
    */
  def confirm(message: String): IAlertifyStatic = js.native
  def confirm(message: String, fn: js.Function): IAlertifyStatic = js.native
  def confirm(message: String, fn: js.Function, cssClass: String): IAlertifyStatic = js.native
  /**
    * Attaches alertify.error to window.onerror method
    * @since 0.3.8
    */
  def debug(): Unit = js.native
  /**
    * Shorthand for log messages
    * @param message The message passed from the callee
    * @return alertify (ie this)
    * @since 0.0.1
    */
  def error(message: String): IAlertifyStatic = js.native
  /**
    * Extend the log method to create custom methods
    * @param type  Custom method name
    * @return function for logging
    * @since 0.0.1
    */
  def extend(`type`: String): js.Function2[/* message */ String, /* wait */ js.UndefOr[Double], this.type] = js.native
  /**
    * Initialize Alertify and create the 2 main elements.
    * Initialization will happen automatically on the first
    * use of alert, confirm, prompt or log.
    * @since 0.0.1
    */
  def init(): Unit = js.native
  /**
    * Show a new log message box
    * @param message   The message passed from the callee
    * @param type      Optional type of log message
    * @param wait      Optional time (in ms) to wait before auto-hiding
    * @return alertify (ie this)
    * @since 0.0.1
    */
  def log(message: String): IAlertifyStatic = js.native
  def log(message: String, `type`: String): IAlertifyStatic = js.native
  def log(message: String, `type`: String, wait: Double): IAlertifyStatic = js.native
  /**
    * Create a prompt dialog box
    * @param message   The message passed from the callee
    * @param fn        Callback function
    * @param placeholder Default value for prompt input
    * @param cssClass  Class(es) to append to dialog
    * @return alertify (ie this)
    * @since 0.0.1
    */
  def prompt(message: String): IAlertifyStatic = js.native
  def prompt(message: String, fn: js.Function): IAlertifyStatic = js.native
  def prompt(message: String, fn: js.Function, placeholder: String): IAlertifyStatic = js.native
  def prompt(message: String, fn: js.Function, placeholder: String, cssClass: String): IAlertifyStatic = js.native
  /**
    * Used to set alertify properties
    * @param Properties
    * @since 0.2.11
    */
  def set(args: IProperties): Unit = js.native
  /**
    * Shorthand for log messages
    * @param message The message passed from the callee
    * @return alertify (ie this)
    * @since 0.0.1
    */
  def success(message: String): IAlertifyStatic = js.native
}

