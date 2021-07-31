package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXDTDHandler interface */
trait IVBSAXDTDHandler extends StObject {
  
  @JSName("MSXML2.IVBSAXDTDHandler_typekey")
  var MSXML2DotIVBSAXDTDHandler_typekey: IVBSAXDTDHandler
  
  /** Receive notification of a notation declaration event. */
  def notationDecl(strName: String, strPublicId: String, strSystemId: String): Unit
  
  /** Receive notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(strName: String, strPublicId: String, strSystemId: String, strNotationName: String): Unit
}
object IVBSAXDTDHandler {
  
  @scala.inline
  def apply(
    MSXML2DotIVBSAXDTDHandler_typekey: IVBSAXDTDHandler,
    notationDecl: (String, String, String) => Unit,
    unparsedEntityDecl: (String, String, String, String) => Unit
  ): IVBSAXDTDHandler = {
    val __obj = js.Dynamic.literal(notationDecl = js.Any.fromFunction3(notationDecl), unparsedEntityDecl = js.Any.fromFunction4(unparsedEntityDecl))
    __obj.updateDynamic("MSXML2.IVBSAXDTDHandler_typekey")(MSXML2DotIVBSAXDTDHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXDTDHandler]
  }
  
  @scala.inline
  implicit class IVBSAXDTDHandlerMutableBuilder[Self <: IVBSAXDTDHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSXML2DotIVBSAXDTDHandler_typekey(value: IVBSAXDTDHandler): Self = StObject.set(x, "MSXML2.IVBSAXDTDHandler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotationDecl(value: (String, String, String) => Unit): Self = StObject.set(x, "notationDecl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnparsedEntityDecl(value: (String, String, String, String) => Unit): Self = StObject.set(x, "unparsedEntityDecl", js.Any.fromFunction4(value))
  }
}
