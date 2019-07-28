package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRegexMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafMod.ChangeToken
  /**
    * The RegexMatchSetId of the RegexMatchSet that you want to update. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId
  /**
    * An array of RegexMatchSetUpdate objects that you want to insert into or delete from a RegexMatchSet. For more information, see RegexMatchTuple.
    */
  var Updates: RegexMatchSetUpdates
}

object UpdateRegexMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexMatchSetId: ResourceId, Updates: RegexMatchSetUpdates): UpdateRegexMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, RegexMatchSetId = RegexMatchSetId, Updates = Updates)
  
    __obj.asInstanceOf[UpdateRegexMatchSetRequest]
  }
}

