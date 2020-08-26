package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct contains a name-value pair of a document header (i.e. the "subject" field and the appropriate value of a MIME message). */
@js.native
trait DocumentHeaderField extends js.Object {
  /** The name of the header field. */
  var Name: String = js.native
  /** The value of the header field. */
  var Value: String = js.native
}

object DocumentHeaderField {
  @scala.inline
  def apply(Name: String, Value: String): DocumentHeaderField = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHeaderField]
  }
  @scala.inline
  implicit class DocumentHeaderFieldOps[Self <: DocumentHeaderField] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

