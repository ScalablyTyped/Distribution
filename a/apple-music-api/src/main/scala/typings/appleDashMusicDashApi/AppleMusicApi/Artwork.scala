package typings.appleDashMusicDashApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artwork
trait Artwork extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var height: Double
  var textColor1: js.UndefOr[String] = js.undefined
  var textColor2: js.UndefOr[String] = js.undefined
  var textColor3: js.UndefOr[String] = js.undefined
  var textColor4: js.UndefOr[String] = js.undefined
  var url: String
  var width: Double
}

object Artwork {
  @scala.inline
  def apply(
    height: Double,
    url: String,
    width: Double,
    bgColor: String = null,
    textColor1: String = null,
    textColor2: String = null,
    textColor3: String = null,
    textColor4: String = null
  ): Artwork = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (textColor1 != null) __obj.updateDynamic("textColor1")(textColor1.asInstanceOf[js.Any])
    if (textColor2 != null) __obj.updateDynamic("textColor2")(textColor2.asInstanceOf[js.Any])
    if (textColor3 != null) __obj.updateDynamic("textColor3")(textColor3.asInstanceOf[js.Any])
    if (textColor4 != null) __obj.updateDynamic("textColor4")(textColor4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
}

