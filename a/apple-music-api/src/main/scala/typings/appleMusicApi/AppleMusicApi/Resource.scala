package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/resource
trait Resource extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var id: String
  var `type`: String
}

object Resource {
  @scala.inline
  def apply(id: String, `type`: String, href: String = null): Resource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

