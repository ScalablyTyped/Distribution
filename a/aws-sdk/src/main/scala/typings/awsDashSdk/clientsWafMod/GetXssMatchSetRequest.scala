package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetXssMatchSetRequest extends js.Object {
  /**
    * The XssMatchSetId of the XssMatchSet that you want to get. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}

object GetXssMatchSetRequest {
  @scala.inline
  def apply(XssMatchSetId: ResourceId): GetXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId)
  
    __obj.asInstanceOf[GetXssMatchSetRequest]
  }
}

