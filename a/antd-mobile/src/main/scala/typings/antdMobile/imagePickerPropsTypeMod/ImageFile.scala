package typings.antdMobile.imagePickerPropsTypeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFile
  extends /* key */ StringDictionary[js.Any] {
  var url: String
}

object ImageFile {
  @scala.inline
  def apply(url: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): ImageFile = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ImageFile]
  }
}

