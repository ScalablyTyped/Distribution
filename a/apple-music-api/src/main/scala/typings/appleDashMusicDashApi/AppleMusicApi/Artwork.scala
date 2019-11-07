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
    val __obj = js.Dynamic.literal(height = height, url = url, width = width)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (textColor1 != null) __obj.updateDynamic("textColor1")(textColor1)
    if (textColor2 != null) __obj.updateDynamic("textColor2")(textColor2)
    if (textColor3 != null) __obj.updateDynamic("textColor3")(textColor3)
    if (textColor4 != null) __obj.updateDynamic("textColor4")(textColor4)
    __obj.asInstanceOf[Artwork]
  }
}

