package typings.angularGrowlV2.mod.growl

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.global.Function
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
    referenceId: js.UndefOr[Double] = js.undefined,
    title: String = null,
    translateMessage: js.UndefOr[Boolean] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined,
    variables: StringDictionary[js.Any] = null
  ): IGrowlMessage = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setText = js.Any.fromFunction1(setText), text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseButton)) __obj.updateDynamic("disableCloseButton")(disableCloseButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCountDown)) __obj.updateDynamic("disableCountDown")(disableCountDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIcons)) __obj.updateDynamic("disableIcons")(disableIcons.get.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (onopen != null) __obj.updateDynamic("onopen")(onopen.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(referenceId)) __obj.updateDynamic("referenceId")(referenceId.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(translateMessage)) __obj.updateDynamic("translateMessage")(translateMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrowlMessage]
  }
}

