package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStructuredResponse extends RichResponseItem {
  var structuredResponse: StructuredResponse
}

object ItemStructuredResponse {
  @scala.inline
  def apply(structuredResponse: StructuredResponse): ItemStructuredResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("structuredResponse")(structuredResponse)
    __obj.asInstanceOf[ItemStructuredResponse]
  }
}

