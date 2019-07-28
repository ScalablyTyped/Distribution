package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSet extends js.Object {
  /**
    * The name, if any, of the XssMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about an XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
  /**
    * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  var XssMatchTuples: typings.awsDashSdk.clientsWafMod.XssMatchTuples
}

object XssMatchSet {
  @scala.inline
  def apply(XssMatchSetId: ResourceId, XssMatchTuples: XssMatchTuples, Name: ResourceName = null): XssMatchSet = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId, XssMatchTuples = XssMatchTuples)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[XssMatchSet]
  }
}

