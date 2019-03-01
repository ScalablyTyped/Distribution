package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportDefinition extends js.Object {
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ITransportDefinition {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    protocols: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): ITransportDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ITransportDefinition]
  }
}

