package typings.angularGrowlV2.mod.growl

import typings.angular.mod.IHttpInterceptorFactory
import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Growl service provider.
  */
@js.native
trait IGrowlProvider extends IServiceProvider {
  /**
    * Pre-defined server error interceptor.
    */
  var serverMessagesInterceptor: js.Array[String | IHttpInterceptorFactory] = js.native
  /**
    * Set default setting for disabling close button.
    * @param disableCloseButton
    */
  def globalDisableCloseButton(disableCloseButton: Boolean): IGrowlProvider = js.native
  /**
    * Set default setting for displaying message disappear countdown.
    * @param disableCountDown
    */
  def globalDisableCountDown(disableCountDown: Boolean): IGrowlProvider = js.native
  /**
    * Set default setting for disabling icons.
    * @param disableIcons
    */
  def globalDisableIcons(disableIcons: Boolean): IGrowlProvider = js.native
  /**
    * Set default allowance for inline messages.
    * @param inline
    */
  def globalInlineMessages(`inline`: Boolean): IGrowlProvider = js.native
  /**
    * Set default message position.
    * @param position
    */
  def globalPosition(position: String): IGrowlProvider = js.native
  /**
    * Set reversing order of displaying new messages.
    * @param reverseOrder
    */
  def globalReversedOrder(reverseOrder: Boolean): IGrowlProvider = js.native
  /**
    * Set default TTL settings.
    * @param ttl ttl in milliseconds
    */
  def globalTimeToLive(ttl: Double): IGrowlProvider = js.native
  /**
    * Set default TTL settings.
    * @param ttl configuration of TTL for different type of message
    */
  def globalTimeToLive(ttl: IGrowlTTLConfig): IGrowlProvider = js.native
  /**
    * Set key where severity of message is stored (for http interceptor).
    * @param messageVariableKey
    */
  def messageSeverityKey(messageSeverityKey: String): IGrowlProvider = js.native
  /**
    * Set key where message text is stored (for http interceptor).
    * @param messageVariableKey
    */
  def messageTextKey(messageTextKey: String): IGrowlProvider = js.native
  /**
    * Set key where title of message is stored (for http interceptor).
    * @param messageVariableKey
    */
  def messageTitleKey(messageTitleKey: String): IGrowlProvider = js.native
  /**
    * Set key where variables for message are stored (for http interceptor).
    * @param messageVariableKey
    */
  def messageVariableKey(messageVariableKey: String): IGrowlProvider = js.native
  /**
    * Set key where messages are stored (for http interceptor).
    * @param messageVariableKey
    */
  def messagesKey(messageKey: String): IGrowlProvider = js.native
  /**
    * Enable/disable displaying only unique messages.
    * @param onlyUniqueMessages
    */
  def onlyUniqueMessages(onlyUniqueMessages: Boolean): IGrowlProvider = js.native
}

