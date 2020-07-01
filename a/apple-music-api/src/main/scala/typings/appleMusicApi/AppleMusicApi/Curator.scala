package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.Playlists
import typings.appleMusicApi.anon.Url
import typings.appleMusicApi.appleMusicApiStrings.curators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/curator
trait Curator extends Resource {
  var attributes: js.UndefOr[Url] = js.undefined
  var relationships: js.UndefOr[Playlists] = js.undefined
  @JSName("type")
  var type_Curator: curators
}

object Curator {
  @scala.inline
  def apply(
    id: String,
    `type`: curators,
    attributes: Url = null,
    href: String = null,
    relationships: Playlists = null
  ): Curator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curator]
  }
}

