package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: String
  var lang: String
  var langName: js.Any
  var langWithRegion: String
}

object AnonFile {
  @scala.inline
  def apply(file: String, lang: String, langName: js.Any, langWithRegion: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

