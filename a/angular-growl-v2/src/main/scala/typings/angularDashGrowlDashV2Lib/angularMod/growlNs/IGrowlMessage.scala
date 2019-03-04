package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Growl message with configuration.
  */
trait IGrowlMessage extends IGrowlMessageConfig {
  var text: java.lang.String
  /**
    * Destroy the message.
    */
  def destroy(): scala.Unit
  /**
    * Update the message body.
    * @param newText new message body
    */
  def setText(newText: java.lang.String): scala.Unit
}

object IGrowlMessage {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit],
    text: java.lang.String,
    disableCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    disableCountDown: js.UndefOr[scala.Boolean] = js.undefined,
    disableIcons: js.UndefOr[scala.Boolean] = js.undefined,
    onclose: angularLib.angularMod.Global.Function = null,
    onopen: angularLib.angularMod.Global.Function = null,
    position: java.lang.String = null,
    referenceId: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    translateMessage: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IGrowlMessage = {
    val __obj = js.Dynamic.literal(destroy = destroy, setText = setText, text = text)
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

