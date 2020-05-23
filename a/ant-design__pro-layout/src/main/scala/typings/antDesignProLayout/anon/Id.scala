package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var pageName: String
  var title: String
}

object Id {
  @scala.inline
  def apply(id: String, pageName: String, title: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

