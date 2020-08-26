package typings.accept.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charsets extends js.Object {
  var charsets: js.Array[String] = js.native
  var encodings: js.Array[String] = js.native
  var languages: js.Array[String] = js.native
  var mediaTypes: js.Array[String] = js.native
}

object Charsets {
  @scala.inline
  def apply(
    charsets: js.Array[String],
    encodings: js.Array[String],
    languages: js.Array[String],
    mediaTypes: js.Array[String]
  ): Charsets = {
    val __obj = js.Dynamic.literal(charsets = charsets.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], mediaTypes = mediaTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charsets]
  }
  @scala.inline
  implicit class CharsetsOps[Self <: Charsets] (val x: Self) extends AnyVal {
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
    def setCharsetsVarargs(value: String*): Self = this.set("charsets", js.Array(value :_*))
    @scala.inline
    def setCharsets(value: js.Array[String]): Self = this.set("charsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodingsVarargs(value: String*): Self = this.set("encodings", js.Array(value :_*))
    @scala.inline
    def setEncodings(value: js.Array[String]): Self = this.set("encodings", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaTypesVarargs(value: String*): Self = this.set("mediaTypes", js.Array(value :_*))
    @scala.inline
    def setMediaTypes(value: js.Array[String]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
  }
  
}

