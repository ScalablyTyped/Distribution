package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityDkimAttributesResponse extends js.Object {
  /**
    * The DKIM attributes for an email address or a domain.
    */
  var DkimAttributes: typings.awsDashSdk.clientsSesMod.DkimAttributes
}

object GetIdentityDkimAttributesResponse {
  @scala.inline
  def apply(DkimAttributes: DkimAttributes): GetIdentityDkimAttributesResponse = {
    val __obj = js.Dynamic.literal(DkimAttributes = DkimAttributes)
  
    __obj.asInstanceOf[GetIdentityDkimAttributesResponse]
  }
}

