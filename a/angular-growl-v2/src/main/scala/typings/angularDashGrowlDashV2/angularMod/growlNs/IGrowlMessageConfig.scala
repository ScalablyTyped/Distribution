package typings.angularDashGrowlDashV2.angularMod.growlNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom configuration used in single message call.
  */
trait IGrowlMessageConfig extends js.Object {
  var disableCloseButton: js.UndefOr[Boolean] = js.undefined
  var disableCountDown: js.UndefOr[Boolean] = js.undefined
  var disableIcons: js.UndefOr[Boolean] = js.undefined
  var onclose: js.UndefOr[Function] = js.undefined
  var onopen: js.UndefOr[Function] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var referenceId: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translateMessage: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object IGrowlMessageConfig {
  @scala.inline
  def apply(
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

