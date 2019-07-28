package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRegexPatternSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: ResourceName
}

object CreateRegexPatternSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, Name = Name)
  
    __obj.asInstanceOf[CreateRegexPatternSetRequest]
  }
}

