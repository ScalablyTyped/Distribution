package typings
package acceptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charsets extends js.Object {
  var charsets: js.Array[java.lang.String]
  var encodings: js.Array[java.lang.String]
  var languages: js.Array[java.lang.String]
  var mediaTypes: js.Array[java.lang.String]
}

object Anon_Charsets {
  @scala.inline
  def apply(
    charsets: js.Array[java.lang.String],
    encodings: js.Array[java.lang.String],
    languages: js.Array[java.lang.String],
    mediaTypes: js.Array[java.lang.String]
  ): Anon_Charsets = {
    val __obj = js.Dynamic.literal(charsets = charsets, encodings = encodings, languages = languages, mediaTypes = mediaTypes)
  
    __obj.asInstanceOf[Anon_Charsets]
  }
}

