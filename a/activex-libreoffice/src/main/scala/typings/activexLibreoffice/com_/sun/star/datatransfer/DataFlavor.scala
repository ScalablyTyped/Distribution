package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Each instance represents the concept of a data format as it would appear on a clipboard, or during drag and drop. */
trait DataFlavor extends js.Object {
  /** The type of the object to transfer, for example, XOutputStream. */
  var DataType: `type`
  /** A human presentable name for the data format. */
  var HumanPresentableName: String
  /**
    * The MIME content-type (type/subtype) string describing the data format of the object to transfer. MimeType must conform to [Rfc2045]{@link
    * url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} )
    */
  var MimeType: String
}

object DataFlavor {
  @scala.inline
  def apply(DataType: `type`, HumanPresentableName: String, MimeType: String): DataFlavor = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], HumanPresentableName = HumanPresentableName.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFlavor]
  }
}

