package typings.algoliasearchHelper

import typings.algoliasearchHelper.mod.SearchParameters
import typings.algoliasearchHelper.mod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: SearchResults
  var state: SearchParameters
}

object AnonContent {
  @scala.inline
  def apply(content: SearchResults, state: SearchParameters): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

