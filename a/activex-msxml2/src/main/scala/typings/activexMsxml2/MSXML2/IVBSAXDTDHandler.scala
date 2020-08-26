package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXDTDHandler interface */
@js.native
trait IVBSAXDTDHandler extends js.Object {
  @JSName("MSXML2.IVBSAXDTDHandler_typekey")
  var MSXML2DotIVBSAXDTDHandler_typekey: IVBSAXDTDHandler = js.native
  /** Receive notification of a notation declaration event. */
  def notationDecl(strName: String, strPublicId: String, strSystemId: String): Unit = js.native
  /** Receive notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(strName: String, strPublicId: String, strSystemId: String, strNotationName: String): Unit = js.native
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
  implicit class IVBSAXDTDHandlerOps[Self <: IVBSAXDTDHandler] (val x: Self) extends AnyVal {
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
    def setMSXML2DotIVBSAXDTDHandler_typekey(value: IVBSAXDTDHandler): Self = this.set("MSXML2.IVBSAXDTDHandler_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotationDecl(value: (String, String, String) => Unit): Self = this.set("notationDecl", js.Any.fromFunction3(value))
    @scala.inline
    def setUnparsedEntityDecl(value: (String, String, String, String) => Unit): Self = this.set("unparsedEntityDecl", js.Any.fromFunction4(value))
  }
  
}

