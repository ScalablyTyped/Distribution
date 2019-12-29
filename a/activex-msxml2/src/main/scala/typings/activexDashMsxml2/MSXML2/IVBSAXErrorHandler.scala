package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXErrorHandler interface */
@JSGlobal("MSXML2.IVBSAXErrorHandler")
@js.native
class IVBSAXErrorHandler protected () extends js.Object {
  @JSName("MSXML2.IVBSAXErrorHandler_typekey")
  var MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler = js.native
  /** Receive notification of a recoverable error. */
  def error(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  /** Receive notification of a non-recoverable error. */
  def fatalError(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  /** Receive notification of an ignorable warning. */
  def ignorableWarning(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
}

