package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRegexPatternSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to delete. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId
}

object DeleteRegexPatternSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexPatternSetId: ResourceId): DeleteRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, RegexPatternSetId = RegexPatternSetId)
  
    __obj.asInstanceOf[DeleteRegexPatternSetRequest]
  }
}

