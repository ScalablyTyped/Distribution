package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** structure for reporting parser errors */
trait IXMLDOMParseError extends js.Object {
  @JSName("MSXML2.IXMLDOMParseError_typekey")
  var MSXML2DotIXMLDOMParseError_typekey: IXMLDOMParseError
  /** the error code */
  val errorCode: Double
  /** the absolute file position in the XML document containing the error */
  val filepos: Double
  /** the line number in the XML document where the error occurred */
  val line: Double
  /** the character position in the line containing the error */
  val linepos: Double
  /** the cause of the error */
  val reason: String
  /** the data where the error occurred */
  val srcText: String
  /** the URL of the XML document containing the error */
  val url: String
}

object IXMLDOMParseError {
  @scala.inline
  def apply(
    MSXML2DotIXMLDOMParseError_typekey: IXMLDOMParseError,
    errorCode: Double,
    filepos: Double,
    line: Double,
    linepos: Double,
    reason: String,
    srcText: String,
    url: String
  ): IXMLDOMParseError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], filepos = filepos.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linepos = linepos.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], srcText = srcText.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IXMLDOMParseError_typekey")(MSXML2DotIXMLDOMParseError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLDOMParseError]
  }
}

