package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct contains a name-value pair of a document header (i.e. the "subject" field and the appropriate value of a MIME message). */
trait DocumentHeaderField extends js.Object {
  /** The name of the header field. */
  var Name: String
  /** The value of the header field. */
  var Value: String
}

object DocumentHeaderField {
  @scala.inline
  def apply(Name: String, Value: String): DocumentHeaderField = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHeaderField]
  }
}

