package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProtectionsResponse extends js.Object {
  /**
    * If you specify a value for MaxResults and you have more Protections than the value of MaxResults, AWS Shield Advanced returns a NextToken value in the response that allows you to list another group of Protections. For the second and subsequent ListProtections requests, specify the value of NextToken from the previous response to get information about another batch of Protections. AWS WAF might return the list of Protection objects in batches smaller than the number specified by MaxResults. If there are more Protection objects to return, AWS WAF will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The array of enabled Protection objects.
    */
  var Protections: js.UndefOr[typings.awsDashSdk.clientsShieldMod.Protections] = js.undefined
}

object ListProtectionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, Protections: Protections = null): ListProtectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Protections != null) __obj.updateDynamic("Protections")(Protections)
    __obj.asInstanceOf[ListProtectionsResponse]
  }
}

