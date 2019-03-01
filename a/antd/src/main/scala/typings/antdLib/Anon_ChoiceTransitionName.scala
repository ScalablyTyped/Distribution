package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChoiceTransitionName extends js.Object {
  var choiceTransitionName: java.lang.String
  var filterOption: scala.Boolean
  var optionLabelProp: java.lang.String
  var showSearch: scala.Boolean
  var transitionName: java.lang.String
}

object Anon_ChoiceTransitionName {
  @scala.inline
  def apply(
    choiceTransitionName: java.lang.String,
    filterOption: scala.Boolean,
    optionLabelProp: java.lang.String,
    showSearch: scala.Boolean,
    transitionName: java.lang.String
  ): Anon_ChoiceTransitionName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    __obj.updateDynamic("filterOption")(filterOption)
    __obj.updateDynamic("optionLabelProp")(optionLabelProp)
    __obj.updateDynamic("showSearch")(showSearch)
    __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[Anon_ChoiceTransitionName]
  }
}

