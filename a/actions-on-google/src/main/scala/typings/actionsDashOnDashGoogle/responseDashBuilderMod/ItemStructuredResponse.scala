package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStructuredResponse extends RichResponseItem {
  var structuredResponse: StructuredResponse
}

object ItemStructuredResponse {
  @scala.inline
  def apply(structuredResponse: StructuredResponse): ItemStructuredResponse = {
    val __obj = js.Dynamic.literal(structuredResponse = structuredResponse)
  
    __obj.asInstanceOf[ItemStructuredResponse]
  }
}

