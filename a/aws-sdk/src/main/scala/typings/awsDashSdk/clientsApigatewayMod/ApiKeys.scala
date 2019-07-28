package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeys extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfApiKey] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  /**
    * A list of warning messages logged during the import of API keys when the failOnWarnings option is set to true.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}

object ApiKeys {
  @scala.inline
  def apply(items: ListOfApiKey = null, position: String = null, warnings: ListOfString = null): ApiKeys = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[ApiKeys]
  }
}

