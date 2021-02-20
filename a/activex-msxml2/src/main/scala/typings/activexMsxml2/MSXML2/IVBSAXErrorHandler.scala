package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXErrorHandler interface */
@js.native
trait IVBSAXErrorHandler extends StObject {
  
  @JSName("MSXML2.IVBSAXErrorHandler_typekey")
  var MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler = js.native
  
  /** Receive notification of a recoverable error. */
  def error(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  
  /** Receive notification of a non-recoverable error. */
  def fatalError(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  
  /** Receive notification of an ignorable warning. */
  def ignorableWarning(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
}
object IVBSAXErrorHandler {
  
  @scala.inline
  def apply(
    MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler,
    error: (IVBSAXLocator, String, Double) => Unit,
    fatalError: (IVBSAXLocator, String, Double) => Unit,
    ignorableWarning: (IVBSAXLocator, String, Double) => Unit
  ): IVBSAXErrorHandler = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction3(error), fatalError = js.Any.fromFunction3(fatalError), ignorableWarning = js.Any.fromFunction3(ignorableWarning))
    __obj.updateDynamic("MSXML2.IVBSAXErrorHandler_typekey")(MSXML2DotIVBSAXErrorHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXErrorHandler]
  }
  
  @scala.inline
  implicit class IVBSAXErrorHandlerMutableBuilder[Self <: IVBSAXErrorHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: (IVBSAXLocator, String, Double) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFatalError(value: (IVBSAXLocator, String, Double) => Unit): Self = StObject.set(x, "fatalError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIgnorableWarning(value: (IVBSAXLocator, String, Double) => Unit): Self = StObject.set(x, "ignorableWarning", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMSXML2DotIVBSAXErrorHandler_typekey(value: IVBSAXErrorHandler): Self = StObject.set(x, "MSXML2.IVBSAXErrorHandler_typekey", value.asInstanceOf[js.Any])
  }
}
