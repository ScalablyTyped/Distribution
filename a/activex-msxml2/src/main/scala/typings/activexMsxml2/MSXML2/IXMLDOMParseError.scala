package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** structure for reporting parser errors */
@js.native
trait IXMLDOMParseError extends StObject {
  
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
  implicit class IXMLDOMParseErrorMutableBuilder[Self <: IXMLDOMParseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepos(value: Double): Self = StObject.set(x, "filepos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinepos(value: Double): Self = StObject.set(x, "linepos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSXML2DotIXMLDOMParseError_typekey(value: IXMLDOMParseError): Self = StObject.set(x, "MSXML2.IXMLDOMParseError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcText(value: String): Self = StObject.set(x, "srcText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
