package typings.angularGrowlV2.mod.growl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Growl service.
  */
@js.native
trait IGrowlService extends js.Object {
  /**
    * Show error message.
    * @param message text to display (or code for angular-translate)
    */
  def error(message: String): IGrowlMessage = js.native
  /**
    * Show error message.
    * @param message text to display (or code for angular-translate)
    * @param config additional message configuration
    */
  def error(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
    * Show message (generic).
    * @param message text to display (or code for angular-translate)
    */
  def general(message: String): IGrowlMessage = js.native
  /**
    * Show message (generic).
    * @param message text to display (or code for angular-translate)
    * @param config additional message configuration
    */
  def general(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
    * Show message (generic).
    * @param message text to display (or code for angular-translate)
    * @param config additional message configuration
    * @param severity message severity (error, warning, success, info).
    */
  def general(message: String, config: IGrowlMessageConfig, severity: String): IGrowlMessage = js.native
  /**
    * Show information message.
    * @param message text to display (or code for angular-translate)
    */
  def info(message: String): IGrowlMessage = js.native
  /**
    * Show information message.
    * @param message text to display (or code for angular-translate)
    * @param config additional message configuration
    */
  def info(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
    * Get current allowance for inline messages.
    */
  def inlineMessages(): Boolean = js.native
  /**
    * Get current setting for displaying only unique messages.
    */
  def onlyUnique(): Boolean = js.native
  /**
    * Get current messages position.
    */
  def position(): String = js.native
  /**
    * Get current setting for reversing messages order.
    */
  def reverseOrder(): Boolean = js.native
  /**
    * Show success message.
    * @param message text to display (or code for angular-translate)
    * @param config additional message configuration
    */
  def success(message: String): IGrowlMessage = js.native
  /**
    * Show success message.
    * @param message text to display (or code for angular-translate)
    */
  def success(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
    * Show warning message.
    * @param message text to display (or code for angular-translate)
    */
  def warning(message: String): IGrowlMessage = js.native
  /**
    * Show warning message.
    * @param message text to display (or code for angular-translate)
    * @param config additional message configuration
    */
  def warning(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
}

