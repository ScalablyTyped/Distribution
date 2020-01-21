package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** structure for reporting parser errors */
@JSGlobal("MSXML2.IXMLDOMParseError")
@js.native
class IXMLDOMParseError protected () extends js.Object {
  @JSName("MSXML2.IXMLDOMParseError_typekey")
  var MSXML2DotIXMLDOMParseError_typekey: IXMLDOMParseError = js.native
  /** the error code */
  val errorCode: Double = js.native
  /** the absolute file position in the XML document containing the error */
  val filepos: Double = js.native
  /** the line number in the XML document where the error occurred */
  val line: Double = js.native
  /** the character position in the line containing the error */
  val linepos: Double = js.native
  /** the cause of the error */
  val reason: String = js.native
  /** the data where the error occurred */
  val srcText: String = js.native
  /** the URL of the XML document containing the error */
  val url: String = js.native
}

