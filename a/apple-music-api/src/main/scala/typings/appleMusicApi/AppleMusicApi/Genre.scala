package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.Name
import typings.appleMusicApi.appleMusicApiStrings.genres
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/genre
@js.native
trait Genre extends Resource {
  var attributes: Name = js.native
  @JSName("type")
  var type_Genre: genres = js.native
}

object Genre {
  @scala.inline
  def apply(attributes: Name, id: String, `type`: genres): Genre = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
  @scala.inline
  implicit class GenreOps[Self <: Genre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: Name): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: genres): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

