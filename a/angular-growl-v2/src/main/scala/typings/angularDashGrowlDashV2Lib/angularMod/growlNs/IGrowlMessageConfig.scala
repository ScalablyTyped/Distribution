package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom configuration used in single message call.
  */
trait IGrowlMessageConfig extends js.Object {
  var disableCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var disableCountDown: js.UndefOr[scala.Boolean] = js.undefined
  var disableIcons: js.UndefOr[scala.Boolean] = js.undefined
  var onclose: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  var onopen: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var referenceId: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var translateMessage: js.UndefOr[scala.Boolean] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object IGrowlMessageConfig {
  @scala.inline
  def apply(
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
  ): IGrowlMessageConfig = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[IGrowlMessageConfig]
  }
}

