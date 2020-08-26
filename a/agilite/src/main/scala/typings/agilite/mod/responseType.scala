package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait responseType extends js.Object {
  var ARRAY_BUFFER: String = js.native
  var BLOB: String = js.native
  var DOCUMENT: String = js.native
  var JSON: String = js.native
  var STREAM: String = js.native
  var TEXT: String = js.native
}

object responseType {
  @scala.inline
  def apply(ARRAY_BUFFER: String, BLOB: String, DOCUMENT: String, JSON: String, STREAM: String, TEXT: String): responseType = {
    val __obj = js.Dynamic.literal(ARRAY_BUFFER = ARRAY_BUFFER.asInstanceOf[js.Any], BLOB = BLOB.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STREAM = STREAM.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseType]
  }
  @scala.inline
  implicit class responseTypeOps[Self <: responseType] (val x: Self) extends AnyVal {
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
    def setARRAY_BUFFER(value: String): Self = this.set("ARRAY_BUFFER", value.asInstanceOf[js.Any])
    @scala.inline
    def setBLOB(value: String): Self = this.set("BLOB", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOCUMENT(value: String): Self = this.set("DOCUMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setJSON(value: String): Self = this.set("JSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTREAM(value: String): Self = this.set("STREAM", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEXT(value: String): Self = this.set("TEXT", value.asInstanceOf[js.Any])
  }
  
}

