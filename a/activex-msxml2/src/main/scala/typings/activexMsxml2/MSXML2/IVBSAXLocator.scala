package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXLocator interface */
@js.native
trait IVBSAXLocator extends js.Object {
  @JSName("MSXML2.IVBSAXLocator_typekey")
  var MSXML2DotIVBSAXLocator_typekey: IVBSAXLocator = js.native
  /** Get the column number where the current document event ends. */
  val columnNumber: Double = js.native
  /** Get the line number where the current document event ends. */
  val lineNumber: Double = js.native
  /** Get the public identifier for the current document event. */
  val publicId: String = js.native
  /** Get the system identifier for the current document event. */
  val systemId: String = js.native
}

object IVBSAXLocator {
  @scala.inline
  def apply(
    MSXML2DotIVBSAXLocator_typekey: IVBSAXLocator,
    columnNumber: Double,
    lineNumber: Double,
    publicId: String,
    systemId: String
  ): IVBSAXLocator = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IVBSAXLocator_typekey")(MSXML2DotIVBSAXLocator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXLocator]
  }
  @scala.inline
  implicit class IVBSAXLocatorOps[Self <: IVBSAXLocator] (val x: Self) extends AnyVal {
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
    def setMSXML2DotIVBSAXLocator_typekey(value: IVBSAXLocator): Self = this.set("MSXML2.IVBSAXLocator_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemId(value: String): Self = this.set("systemId", value.asInstanceOf[js.Any])
  }
  
}

