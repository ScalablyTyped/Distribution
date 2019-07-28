package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemSimpleResponse extends RichResponseItem {
  var simpleResponse: SimpleResponse
}

object ItemSimpleResponse {
  @scala.inline
  def apply(simpleResponse: SimpleResponse): ItemSimpleResponse = {
    val __obj = js.Dynamic.literal(simpleResponse = simpleResponse)
  
    __obj.asInstanceOf[ItemSimpleResponse]
  }
}

