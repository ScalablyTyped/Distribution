package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var pageName: String
  var title: String
}

object AnonId {
  @scala.inline
  def apply(id: String, pageName: String, title: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

