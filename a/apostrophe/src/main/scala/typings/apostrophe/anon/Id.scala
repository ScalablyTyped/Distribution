package typings.apostrophe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var _id: String
  var _url: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Id {
  @scala.inline
  def apply(_id: String, `type`: String, _url: String = null): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

