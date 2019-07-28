package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionRestrictionRegex extends js.Object {
  /**
    * A unique name representing this regular expression.
    */
  var Label: js.UndefOr[RegexLabel] = js.undefined
  /**
    * The regular expression pattern that a string configuration option value with this restriction must match.
    */
  var Pattern: js.UndefOr[RegexPattern] = js.undefined
}

object OptionRestrictionRegex {
  @scala.inline
  def apply(Label: RegexLabel = null, Pattern: RegexPattern = null): OptionRestrictionRegex = {
    val __obj = js.Dynamic.literal()
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (Pattern != null) __obj.updateDynamic("Pattern")(Pattern)
    __obj.asInstanceOf[OptionRestrictionRegex]
  }
}

