package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXErrorHandler interface */
trait IVBSAXErrorHandler extends js.Object {
  @JSName("MSXML2.IVBSAXErrorHandler_typekey")
  var MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler
  /** Receive notification of a recoverable error. */
  def error(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit
  /** Receive notification of a non-recoverable error. */
  def fatalError(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit
  /** Receive notification of an ignorable warning. */
  def ignorableWarning(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit
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
}

