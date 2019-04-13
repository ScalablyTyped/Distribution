package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteCaSummary extends js.Object {
  /**
    * The time when the CA was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.undefined
}

object WebsiteCaSummary {
  @scala.inline
  def apply(CreatedTime: DateTime = null, DisplayName: DisplayName = null, WebsiteCaId: Id = null): WebsiteCaSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (WebsiteCaId != null) __obj.updateDynamic("WebsiteCaId")(WebsiteCaId)
    __obj.asInstanceOf[WebsiteCaSummary]
  }
}

