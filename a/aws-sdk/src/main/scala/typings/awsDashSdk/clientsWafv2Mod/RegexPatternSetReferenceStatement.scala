package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetReferenceStatement extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the RegexPatternSet that this statement references.
    */
  var ARN: ResourceArn = js.native
  /**
    * The part of a web request that you want AWS WAF to inspect. For more information, see FieldToMatch. 
    */
  var FieldToMatch: typings.awsDashSdk.clientsWafv2Mod.FieldToMatch = js.native
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all transformations on the content identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typings.awsDashSdk.clientsWafv2Mod.TextTransformations = js.native
}

object RegexPatternSetReferenceStatement {
  @scala.inline
  def apply(ARN: ResourceArn, FieldToMatch: FieldToMatch, TextTransformations: TextTransformations): RegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], FieldToMatch = FieldToMatch.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegexPatternSetReferenceStatement]
  }
}

