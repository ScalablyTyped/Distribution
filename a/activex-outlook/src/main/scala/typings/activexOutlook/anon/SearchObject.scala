package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchObject extends js.Object {
  val SearchObject: Search
}

object SearchObject {
  @scala.inline
  def apply(SearchObject: Search): SearchObject = {
    val __obj = js.Dynamic.literal(SearchObject = SearchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchObject]
  }
}

