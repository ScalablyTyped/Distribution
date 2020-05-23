package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXDTDHandler interface */
@JSGlobal("MSXML2.IVBSAXDTDHandler")
@js.native
class IVBSAXDTDHandler protected ()
  extends typings.activexMsxml2.MSXML2.IVBSAXDTDHandler {
  /* CompleteClass */
  @JSName("MSXML2.IVBSAXDTDHandler_typekey")
  override var MSXML2DotIVBSAXDTDHandler_typekey: typings.activexMsxml2.MSXML2.IVBSAXDTDHandler = js.native
  /** Receive notification of a notation declaration event. */
  /* CompleteClass */
  override def notationDecl(strName: String, strPublicId: String, strSystemId: String): Unit = js.native
  /** Receive notification of an unparsed entity declaration event. */
  /* CompleteClass */
  override def unparsedEntityDecl(strName: String, strPublicId: String, strSystemId: String, strNotationName: String): Unit = js.native
}

