package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

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
  var aInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * contains the encoding of the data stream. This is used by the parser to do Unicode conversions.
    *
    * Note that in general you do not need to specify an encoding. Either it is UTF-8 or UTF-16 which is recognized by the parser or it is specified in the
    * first line of the XML-File ( e.g. **?xml encoding="EUC-JP"?** ).
    */
  var sEncoding: java.lang.String
  /** contains the public Id of the document, for example, needed in exception-message strings. */
  var sPublicId: java.lang.String
  /** contains the system ID of the document. */
  var sSystemId: java.lang.String
}

object InputSource {
  @scala.inline
  def apply(
    aInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    sEncoding: java.lang.String,
    sPublicId: java.lang.String,
    sSystemId: java.lang.String
  ): InputSource = {
    val __obj = js.Dynamic.literal(aInputStream = aInputStream, sEncoding = sEncoding, sPublicId = sPublicId, sSystemId = sSystemId)
  
    __obj.asInstanceOf[InputSource]
  }
}

