package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var channelId: String
  var context: js.UndefOr[String] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    channelId: String,
    context: String = null,
    extension: String = null,
    label: String = null,
    priority: js.UndefOr[Double] = js.undefined
  ): Context = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

