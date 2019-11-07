package typings.appleDashMusicDashApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/relationship
trait Relationship[ResourceType] extends js.Object {
  var data: js.Array[ResourceType]
  var href: String
  var meta: js.UndefOr[js.Any] = js.undefined
  var next: js.UndefOr[String] = js.undefined
}

object Relationship {
  @scala.inline
  def apply[ResourceType](data: js.Array[ResourceType], href: String, meta: js.Any = null, next: String = null): Relationship[ResourceType] = {
    val __obj = js.Dynamic.literal(data = data, href = href)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Relationship[ResourceType]]
  }
}

