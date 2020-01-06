package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginDetails extends js.Object {
  var ProductId: __string = js.native
}

object OriginDetails {
  @scala.inline
  def apply(ProductId: __string): OriginDetails = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OriginDetails]
  }
}

