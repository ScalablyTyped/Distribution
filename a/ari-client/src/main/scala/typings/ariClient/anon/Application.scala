package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var application: String
  var eventName: String
  var source: js.UndefOr[String | js.Array[String]] = js.undefined
  var variables: js.UndefOr[Containers] = js.undefined
}

object Application {
  @scala.inline
  def apply(
    application: String,
    eventName: String,
    source: String | js.Array[String] = null,
    variables: Containers = null
  ): Application = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

