package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the Datasource plus some additional information for the parser.
  *
  * There are two places where the application will deliver this input source to the parser:
  *
  * as the argument of {@link XParser.parseStream()}as the return value of XEntityReslover::resolveEntity().
  */
trait InputSource extends js.Object {
  /** contains the byte input stream of the document. */
  var aInputStream: XInputStream
  /**
    * contains the encoding of the data stream. This is used by the parser to do Unicode conversions.
    *
    * Note that in general you do not need to specify an encoding. Either it is UTF-8 or UTF-16 which is recognized by the parser or it is specified in the
    * first line of the XML-File ( e.g. **?xml encoding="EUC-JP"?** ).
    */
  var sEncoding: String
  /** contains the public Id of the document, for example, needed in exception-message strings. */
  var sPublicId: String
  /** contains the system ID of the document. */
  var sSystemId: String
}

object InputSource {
  @scala.inline
  def apply(aInputStream: XInputStream, sEncoding: String, sPublicId: String, sSystemId: String): InputSource = {
    val __obj = js.Dynamic.literal(aInputStream = aInputStream.asInstanceOf[js.Any], sEncoding = sEncoding.asInstanceOf[js.Any], sPublicId = sPublicId.asInstanceOf[js.Any], sSystemId = sSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSource]
  }
}

