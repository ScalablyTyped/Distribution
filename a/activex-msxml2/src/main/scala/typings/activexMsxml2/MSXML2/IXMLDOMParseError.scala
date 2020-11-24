package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** structure for reporting parser errors */
@js.native
trait IXMLDOMParseError extends js.Object {
  
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
  
  @scala.inline
  implicit class IXMLDOMParseErrorOps[Self <: IXMLDOMParseError] (val x: Self) extends AnyVal {
    
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
    def setMSXML2DotIXMLDOMParseError_typekey(value: IXMLDOMParseError): Self = this.set("MSXML2.IXMLDOMParseError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepos(value: Double): Self = this.set("filepos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinepos(value: Double): Self = this.set("linepos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcText(value: String): Self = this.set("srcText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
