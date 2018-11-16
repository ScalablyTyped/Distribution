package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXErrorHandler interface */
@JSGlobal("MSXML2.IVBSAXErrorHandler")
@js.native
class IVBSAXErrorHandler protected () extends js.Object {
  var `MSXML2.IVBSAXErrorHandler_typekey`: IVBSAXErrorHandler = js.native
  /** Receive notification of a recoverable error. */
  def error(oLocator: IVBSAXLocator, strErrorMessage: java.lang.String, nErrorCode: scala.Double): scala.Unit = js.native
  /** Receive notification of a non-recoverable error. */
  def fatalError(oLocator: IVBSAXLocator, strErrorMessage: java.lang.String, nErrorCode: scala.Double): scala.Unit = js.native
  /** Receive notification of an ignorable warning. */
  def ignorableWarning(oLocator: IVBSAXLocator, strErrorMessage: java.lang.String, nErrorCode: scala.Double): scala.Unit = js.native
}

