package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyNameSuggestion extends js.Object {
  /**
    * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
    */
  var PropertyName: js.UndefOr[ResourcePropertyName] = js.undefined
}

object PropertyNameSuggestion {
  @scala.inline
  def apply(PropertyName: ResourcePropertyName = null): PropertyNameSuggestion = {
    val __obj = js.Dynamic.literal()
    if (PropertyName != null) __obj.updateDynamic("PropertyName")(PropertyName)
    __obj.asInstanceOf[PropertyNameSuggestion]
  }
}

