package typings.angularDashGrowlDashV2.angularMod.growlNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Growl message with configuration.
  */
trait IGrowlMessage extends IGrowlMessageConfig {
  var text: String
  /**
    * Destroy the message.
    */
  def destroy(): Unit
  /**
    * Update the message body.
    * @param newText new message body
    */
  def setText(newText: String): Unit
}

object IGrowlMessage {
  @scala.inline
  def apply(
    destroy: () => Unit,
    setText: String => Unit,
    text: String,
    disableCloseButton: js.UndefOr[Boolean] = js.undefined,
    disableCountDown: js.UndefOr[Boolean] = js.undefined,
    disableIcons: js.UndefOr[Boolean] = js.undefined,
    onclose: Function = null,
    onopen: Function = null,
    position: String = null,
    referenceId: Int | Double = null,
    title: String = null,
    translateMessage: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null,
    variables: StringDictionary[js.Any] = null
  ): IGrowlMessage = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setText = js.Any.fromFunction1(setText), text = text)
    if (!js.isUndefined(disableCloseButton)) __obj.updateDynamic("disableCloseButton")(disableCloseButton)
    if (!js.isUndefined(disableCountDown)) __obj.updateDynamic("disableCountDown")(disableCountDown)
    if (!js.isUndefined(disableIcons)) __obj.updateDynamic("disableIcons")(disableIcons)
    if (onclose != null) __obj.updateDynamic("onclose")(onclose)
    if (onopen != null) __obj.updateDynamic("onopen")(onopen)
    if (position != null) __obj.updateDynamic("position")(position)
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(translateMessage)) __obj.updateDynamic("translateMessage")(translateMessage)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[IGrowlMessage]
  }
}

