package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyNameSuggestion extends js.Object {
  /**
    * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
    */
  var PropertyName: js.UndefOr[ResourcePropertyName] = js.native
}

object PropertyNameSuggestion {
  @scala.inline
  def apply(PropertyName: ResourcePropertyName = null): PropertyNameSuggestion = {
    val __obj = js.Dynamic.literal()
    if (PropertyName != null) __obj.updateDynamic("PropertyName")(PropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNameSuggestion]
  }
}

