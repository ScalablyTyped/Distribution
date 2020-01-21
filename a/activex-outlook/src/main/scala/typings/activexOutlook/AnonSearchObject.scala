package typings.activexOutlook

import typings.activexOutlook.Outlook.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchObject extends js.Object {
  val SearchObject: Search
}

object AnonSearchObject {
  @scala.inline
  def apply(SearchObject: Search): AnonSearchObject = {
    val __obj = js.Dynamic.literal(SearchObject = SearchObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSearchObject]
  }
}

