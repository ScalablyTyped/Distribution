package typings.algoliasearchDashHelper

import typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchParameters
import typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: SearchResults
  var state: SearchParameters
}

object Anon_Content {
  @scala.inline
  def apply(content: SearchResults, state: SearchParameters): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, state = state)
  
    __obj.asInstanceOf[Anon_Content]
  }
}

