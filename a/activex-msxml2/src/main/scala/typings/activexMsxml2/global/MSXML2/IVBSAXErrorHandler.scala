package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXErrorHandler interface */
@JSGlobal("MSXML2.IVBSAXErrorHandler")
@js.native
class IVBSAXErrorHandler protected ()
  extends typings.activexMsxml2.MSXML2.IVBSAXErrorHandler {
  /* CompleteClass */
  @JSName("MSXML2.IVBSAXErrorHandler_typekey")
  override var MSXML2DotIVBSAXErrorHandler_typekey: typings.activexMsxml2.MSXML2.IVBSAXErrorHandler = js.native
  /** Receive notification of a recoverable error. */
  /* CompleteClass */
  override def error(oLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  /** Receive notification of a non-recoverable error. */
  /* CompleteClass */
  override def fatalError(oLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  /** Receive notification of an ignorable warning. */
  /* CompleteClass */
  override def ignorableWarning(oLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
}

