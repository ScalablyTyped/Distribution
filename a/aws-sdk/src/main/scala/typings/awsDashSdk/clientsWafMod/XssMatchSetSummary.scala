package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetSummary extends js.Object {
  /**
    * The name of the XssMatchSet, if any, specified by Id.
    */
  var Name: ResourceName
  /**
    * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about a XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}

object XssMatchSetSummary {
  @scala.inline
  def apply(Name: ResourceName, XssMatchSetId: ResourceId): XssMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name, XssMatchSetId = XssMatchSetId)
  
    __obj.asInstanceOf[XssMatchSetSummary]
  }
}

