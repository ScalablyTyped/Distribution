package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexMatchSet extends js.Object {
  /**
    * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The RegexMatchSetId for a RegexMatchSet. You use RegexMatchSetId to get information about a RegexMatchSet (see GetRegexMatchSet), update a RegexMatchSet (see UpdateRegexMatchSet), insert a RegexMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a RegexMatchSet from AWS WAF (see DeleteRegexMatchSet).  RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: js.UndefOr[ResourceId] = js.native
  /**
    * Contains an array of RegexMatchTuple objects. Each RegexMatchTuple object contains:    The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.  
    */
  var RegexMatchTuples: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.RegexMatchTuples] = js.native
}

object RegexMatchSet {
  @scala.inline
  def apply(
    Name: ResourceName = null,
    RegexMatchSetId: ResourceId = null,
    RegexMatchTuples: RegexMatchTuples = null
  ): RegexMatchSet = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RegexMatchSetId != null) __obj.updateDynamic("RegexMatchSetId")(RegexMatchSetId.asInstanceOf[js.Any])
    if (RegexMatchTuples != null) __obj.updateDynamic("RegexMatchTuples")(RegexMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSet]
  }
}

