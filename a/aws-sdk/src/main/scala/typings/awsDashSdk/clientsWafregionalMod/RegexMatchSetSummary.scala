package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexMatchSetSummary extends js.Object {
  /**
    * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
    */
  var Name: ResourceName
  /**
    * The RegexMatchSetId for a RegexMatchSet. You use RegexMatchSetId to get information about a RegexMatchSet, update a RegexMatchSet, remove a RegexMatchSet from a Rule, and delete a RegexMatchSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId
}

object RegexMatchSetSummary {
  @scala.inline
  def apply(Name: ResourceName, RegexMatchSetId: ResourceId): RegexMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name, RegexMatchSetId = RegexMatchSetId)
  
    __obj.asInstanceOf[RegexMatchSetSummary]
  }
}

