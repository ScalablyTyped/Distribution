package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct contains a name-value pair of a document header (i.e. the "subject" field and the appropriate value of a MIME message). */
trait DocumentHeaderField extends js.Object {
  /** The name of the header field. */
  var Name: java.lang.String
  /** The value of the header field. */
  var Value: java.lang.String
}

object DocumentHeaderField {
  @scala.inline
  def apply(Name: java.lang.String, Value: java.lang.String): DocumentHeaderField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DocumentHeaderField]
  }
}

