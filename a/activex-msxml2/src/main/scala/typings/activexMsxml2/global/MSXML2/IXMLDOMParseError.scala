package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** structure for reporting parser errors */
@JSGlobal("MSXML2.IXMLDOMParseError")
@js.native
class IXMLDOMParseError protected ()
  extends typings.activexMsxml2.MSXML2.IXMLDOMParseError {
  /* CompleteClass */
  @JSName("MSXML2.IXMLDOMParseError_typekey")
  override var MSXML2DotIXMLDOMParseError_typekey: typings.activexMsxml2.MSXML2.IXMLDOMParseError = js.native
  /** the error code */
  /* CompleteClass */
  override val errorCode: Double = js.native
  /** the absolute file position in the XML document containing the error */
  /* CompleteClass */
  override val filepos: Double = js.native
  /** the line number in the XML document where the error occurred */
  /* CompleteClass */
  override val line: Double = js.native
  /** the character position in the line containing the error */
  /* CompleteClass */
  override val linepos: Double = js.native
  /** the cause of the error */
  /* CompleteClass */
  override val reason: String = js.native
  /** the data where the error occurred */
  /* CompleteClass */
  override val srcText: String = js.native
  /** the URL of the XML document containing the error */
  /* CompleteClass */
  override val url: String = js.native
}

