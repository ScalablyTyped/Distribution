package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateXssMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafregionalMod.ChangeToken
  /**
    * An array of XssMatchSetUpdate objects that you want to insert into or delete from an XssMatchSet. For more information, see the applicable data types:    XssMatchSetUpdate: Contains Action and XssMatchTuple     XssMatchTuple: Contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var Updates: XssMatchSetUpdates
  /**
    * The XssMatchSetId of the XssMatchSet that you want to update. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}

object UpdateXssMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Updates: XssMatchSetUpdates, XssMatchSetId: ResourceId): UpdateXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, Updates = Updates, XssMatchSetId = XssMatchSetId)
  
    __obj.asInstanceOf[UpdateXssMatchSetRequest]
  }
}

