package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Growl service provider.
         */
@js.native
trait IGrowlProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
               * Pre-defined server error interceptor.
               */
  var serverMessagesInterceptor: js.Array[java.lang.String | angularLib.angularMod.angularNs.IHttpInterceptorFactory] = js.native
  /**
               * Set default setting for disabling close button.
               * @param disableCloseButton
               */
  def globalDisableCloseButton(disableCloseButton: scala.Boolean): IGrowlProvider = js.native
  /**
               * Set default setting for displaying message disappear countdown.
               * @param disableCountDown
               */
  def globalDisableCountDown(disableCountDown: scala.Boolean): IGrowlProvider = js.native
  /**
               * Set default setting for disabling icons.
               * @param disableIcons
               */
  def globalDisableIcons(disableIcons: scala.Boolean): IGrowlProvider = js.native
  /**
               * Set default allowance for inline messages.
               * @param inline
               */
  def globalInlineMessages(`inline`: scala.Boolean): IGrowlProvider = js.native
  /**
               * Set default message position.
               * @param position
               */
  def globalPosition(position: java.lang.String): IGrowlProvider = js.native
  /**
               * Set reversing order of displaying new messages.
               * @param reverseOrder
               */
  def globalReversedOrder(reverseOrder: scala.Boolean): IGrowlProvider = js.native
  /**
               * Set default TTL settings.
               * @param ttl configuration of TTL for different type of message
               */
  def globalTimeToLive(ttl: IGrowlTTLConfig): IGrowlProvider = js.native
  /**
               * Set default TTL settings.
               * @param ttl ttl in milliseconds
               */
  def globalTimeToLive(ttl: scala.Double): IGrowlProvider = js.native
  /**
               * Set key where severity of message is stored (for http interceptor).
               * @param messageVariableKey
               */
  def messageSeverityKey(messageSeverityKey: java.lang.String): IGrowlProvider = js.native
  /**
               * Set key where message text is stored (for http interceptor).
               * @param messageVariableKey
               */
  def messageTextKey(messageTextKey: java.lang.String): IGrowlProvider = js.native
  /**
               * Set key where title of message is stored (for http interceptor).
               * @param messageVariableKey
               */
  def messageTitleKey(messageTitleKey: java.lang.String): IGrowlProvider = js.native
  /**
               * Set key where variables for message are stored (for http interceptor).
               * @param messageVariableKey
               */
  def messageVariableKey(messageVariableKey: java.lang.String): IGrowlProvider = js.native
  /**
               * Set key where messages are stored (for http interceptor).
               * @param messageVariableKey
               */
  def messagesKey(messageKey: java.lang.String): IGrowlProvider = js.native
  /**
               * Enable/disable displaying only unique messages.
               * @param onlyUniqueMessages
               */
  def onlyUniqueMessages(onlyUniqueMessages: scala.Boolean): IGrowlProvider = js.native
}

