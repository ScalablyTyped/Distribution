package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

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
  def error(message: java.lang.String): IGrowlMessage = js.native
  /**
               * Show error message.
               * @param message text to display (or code for angular-translate)
               * @param config additional message configuration
               */
  def error(message: java.lang.String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
               * Show message (generic).
               * @param message text to display (or code for angular-translate)
               */
  def general(message: java.lang.String): IGrowlMessage = js.native
  /**
               * Show message (generic).
               * @param message text to display (or code for angular-translate)
               * @param config additional message configuration
               */
  def general(message: java.lang.String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
               * Show message (generic).
               * @param message text to display (or code for angular-translate)
               * @param config additional message configuration
               * @param severity message severity (error, warning, success, info).
               */
  def general(message: java.lang.String, config: IGrowlMessageConfig, severity: java.lang.String): IGrowlMessage = js.native
  /**
               * Show information message.
               * @param message text to display (or code for angular-translate)
               */
  def info(message: java.lang.String): IGrowlMessage = js.native
  /**
               * Show information message.
               * @param message text to display (or code for angular-translate)
               * @param config additional message configuration
               */
  def info(message: java.lang.String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
               * Get current allowance for inline messages.
               */
  def inlineMessages(): scala.Boolean = js.native
  /**
               * Get current setting for displaying only unique messages.
               */
  def onlyUnique(): scala.Boolean = js.native
  /**
               * Get current messages position.
               */
  def position(): java.lang.String = js.native
  /**
               * Get current setting for reversing messages order.
               */
  def reverseOrder(): scala.Boolean = js.native
  /**
               * Show success message.
               * @param message text to display (or code for angular-translate)
               * @param config additional message configuration
               */
  def success(message: java.lang.String): IGrowlMessage = js.native
  /**
               * Show success message.
               * @param message text to display (or code for angular-translate)
               */
  def success(message: java.lang.String, config: IGrowlMessageConfig): IGrowlMessage = js.native
  /**
               * Show warning message.
               * @param message text to display (or code for angular-translate)
               */
  def warning(message: java.lang.String): IGrowlMessage = js.native
  /**
               * Show warning message.
               * @param message text to display (or code for angular-translate)
               * @param config additional message configuration
               */
  def warning(message: java.lang.String, config: IGrowlMessageConfig): IGrowlMessage = js.native
}

