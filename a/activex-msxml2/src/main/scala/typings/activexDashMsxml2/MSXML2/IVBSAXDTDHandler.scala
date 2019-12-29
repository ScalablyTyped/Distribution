package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXDTDHandler interface */
@JSGlobal("MSXML2.IVBSAXDTDHandler")
@js.native
class IVBSAXDTDHandler protected () extends js.Object {
  @JSName("MSXML2.IVBSAXDTDHandler_typekey")
  var MSXML2DotIVBSAXDTDHandler_typekey: IVBSAXDTDHandler = js.native
  /** Receive notification of a notation declaration event. */
  def notationDecl(strName: String, strPublicId: String, strSystemId: String): Unit = js.native
  /** Receive notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(strName: String, strPublicId: String, strSystemId: String, strNotationName: String): Unit = js.native
}

