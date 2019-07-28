package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexPatternSetSummary extends js.Object {
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: ResourceName
  /**
    * The RegexPatternSetId for a RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId
}

object RegexPatternSetSummary {
  @scala.inline
  def apply(Name: ResourceName, RegexPatternSetId: ResourceId): RegexPatternSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name, RegexPatternSetId = RegexPatternSetId)
  
    __obj.asInstanceOf[RegexPatternSetSummary]
  }
}

