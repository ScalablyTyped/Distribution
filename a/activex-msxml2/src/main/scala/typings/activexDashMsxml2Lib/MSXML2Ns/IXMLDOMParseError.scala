package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** structure for reporting parser errors */
@JSGlobal("MSXML2.IXMLDOMParseError")
@js.native
class IXMLDOMParseError protected () extends js.Object {
  var `MSXML2.IXMLDOMParseError_typekey`: IXMLDOMParseError = js.native
  /** the error code */
  val errorCode: scala.Double = js.native
  /** the absolute file position in the XML document containing the error */
  val filepos: scala.Double = js.native
  /** the line number in the XML document where the error occurred */
  val line: scala.Double = js.native
  /** the character position in the line containing the error */
  val linepos: scala.Double = js.native
  /** the cause of the error */
  val reason: java.lang.String = js.native
  /** the data where the error occurred */
  val srcText: java.lang.String = js.native
  /** the URL of the XML document containing the error */
  val url: java.lang.String = js.native
}

