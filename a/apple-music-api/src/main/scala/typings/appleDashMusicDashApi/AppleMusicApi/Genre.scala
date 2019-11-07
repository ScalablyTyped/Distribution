package typings.appleDashMusicDashApi.AppleMusicApi

import typings.appleDashMusicDashApi.Anon_Name
import typings.appleDashMusicDashApi.appleDashMusicDashApiStrings.genres
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/genre
trait Genre extends Resource {
  var attributes: Anon_Name
  @JSName("type")
  var type_Genre: genres
}

object Genre {
  @scala.inline
  def apply(attributes: Anon_Name, id: String, `type`: genres, href: String = null): Genre = {
    val __obj = js.Dynamic.literal(attributes = attributes, id = id)
    __obj.updateDynamic("type")(`type`)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[Genre]
  }
}

