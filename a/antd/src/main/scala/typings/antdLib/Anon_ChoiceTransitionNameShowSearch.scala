package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChoiceTransitionNameShowSearch extends js.Object {
  var choiceTransitionName: java.lang.String
  var showSearch: scala.Boolean
  var transitionName: java.lang.String
}

object Anon_ChoiceTransitionNameShowSearch {
  @scala.inline
  def apply(
    choiceTransitionName: java.lang.String,
    showSearch: scala.Boolean,
    transitionName: java.lang.String
  ): Anon_ChoiceTransitionNameShowSearch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("choiceTransitionName")(choiceTransitionName)
    __obj.updateDynamic("showSearch")(showSearch)
    __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[Anon_ChoiceTransitionNameShowSearch]
  }
}

