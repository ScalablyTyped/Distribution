package typings
package alertifyLib.alertifyNs

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
  def alert(message: java.lang.String): IAlertifyStatic = js.native
  /**
           * Create an alert dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param cssClass  Class(es) to append to dialog box
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def alert(message: java.lang.String, fn: js.Function): IAlertifyStatic = js.native
  /**
           * Create an alert dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param cssClass  Class(es) to append to dialog box
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def alert(message: java.lang.String, fn: js.Function, cssClass: java.lang.String): IAlertifyStatic = js.native
  /**
           * Create a confirm dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param cssClass  Class(es) to append to dialog box
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def confirm(message: java.lang.String): IAlertifyStatic = js.native
  /**
           * Create a confirm dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param cssClass  Class(es) to append to dialog box
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def confirm(message: java.lang.String, fn: js.Function): IAlertifyStatic = js.native
  /**
           * Create a confirm dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param cssClass  Class(es) to append to dialog box
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def confirm(message: java.lang.String, fn: js.Function, cssClass: java.lang.String): IAlertifyStatic = js.native
  /**
           * Attaches alertify.error to window.onerror method
           * @since 0.3.8
           */
  def debug(): scala.Unit = js.native
  /**
           * Shorthand for log messages
           * @param message The message passed from the callee
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def error(message: java.lang.String): IAlertifyStatic = js.native
  /**
           * Extend the log method to create custom methods
           * @param type  Custom method name
           * @return function for logging
           * @since 0.0.1
           */
  def extend(`type`: java.lang.String): js.Function2[/* message */ java.lang.String, /* wait */ js.UndefOr[scala.Double], this.type] = js.native
  /**
           * Initialize Alertify and create the 2 main elements.
           * Initialization will happen automatically on the first
           * use of alert, confirm, prompt or log.
           * @since 0.0.1
           */
  def init(): scala.Unit = js.native
  /**
           * Show a new log message box
           * @param message   The message passed from the callee
           * @param type      Optional type of log message
           * @param wait      Optional time (in ms) to wait before auto-hiding
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def log(message: java.lang.String): IAlertifyStatic = js.native
  /**
           * Show a new log message box
           * @param message   The message passed from the callee
           * @param type      Optional type of log message
           * @param wait      Optional time (in ms) to wait before auto-hiding
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def log(message: java.lang.String, `type`: java.lang.String): IAlertifyStatic = js.native
  /**
           * Show a new log message box
           * @param message   The message passed from the callee
           * @param type      Optional type of log message
           * @param wait      Optional time (in ms) to wait before auto-hiding
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def log(message: java.lang.String, `type`: java.lang.String, wait: scala.Double): IAlertifyStatic = js.native
  /**
           * Create a prompt dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param placeholder Default value for prompt input
           * @param cssClass  Class(es) to append to dialog
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def prompt(message: java.lang.String): IAlertifyStatic = js.native
  /**
           * Create a prompt dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param placeholder Default value for prompt input
           * @param cssClass  Class(es) to append to dialog
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def prompt(message: java.lang.String, fn: js.Function): IAlertifyStatic = js.native
  /**
           * Create a prompt dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param placeholder Default value for prompt input
           * @param cssClass  Class(es) to append to dialog
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def prompt(message: java.lang.String, fn: js.Function, placeholder: java.lang.String): IAlertifyStatic = js.native
  /**
           * Create a prompt dialog box
           * @param message   The message passed from the callee
           * @param fn        Callback function
           * @param placeholder Default value for prompt input
           * @param cssClass  Class(es) to append to dialog
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def prompt(
    message: java.lang.String,
    fn: js.Function,
    placeholder: java.lang.String,
    cssClass: java.lang.String
  ): IAlertifyStatic = js.native
  /**
           * Used to set alertify properties
           * @param Properties
           * @since 0.2.11
           */
  def set(args: IProperties): scala.Unit = js.native
  /**
           * Shorthand for log messages
           * @param message The message passed from the callee
           * @return alertify (ie this)
           * @since 0.0.1
           */
  def success(message: java.lang.String): IAlertifyStatic = js.native
}

