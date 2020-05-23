package typings.appBuilderLib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: String
  var lang: String
  var langName: js.Any
  var langWithRegion: String
}

object File {
  @scala.inline
  def apply(file: String, lang: String, langName: js.Any, langWithRegion: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

