package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRegexMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
  /**
    * The RegexMatchSetId of the RegexMatchSet that you want to delete. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId
}

object DeleteRegexMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexMatchSetId: ResourceId): DeleteRegexMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, RegexMatchSetId = RegexMatchSetId)
  
    __obj.asInstanceOf[DeleteRegexMatchSetRequest]
  }
}

