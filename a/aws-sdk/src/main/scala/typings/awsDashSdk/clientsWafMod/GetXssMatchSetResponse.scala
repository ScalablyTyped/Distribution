package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetXssMatchSetResponse extends js.Object {
  /**
    * Information about the XssMatchSet that you specified in the GetXssMatchSet request. For more information, see the following topics:    XssMatchSet: Contains Name, XssMatchSetId, and an array of XssMatchTuple objects    XssMatchTuple: Each XssMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var XssMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.XssMatchSet] = js.native
}

object GetXssMatchSetResponse {
  @scala.inline
  def apply(XssMatchSet: XssMatchSet = null): GetXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (XssMatchSet != null) __obj.updateDynamic("XssMatchSet")(XssMatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetXssMatchSetResponse]
  }
}

