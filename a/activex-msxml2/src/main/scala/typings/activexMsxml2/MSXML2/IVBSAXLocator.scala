package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXLocator interface */
trait IVBSAXLocator extends js.Object {
  @JSName("MSXML2.IVBSAXLocator_typekey")
  var MSXML2DotIVBSAXLocator_typekey: IVBSAXLocator
  /** Get the column number where the current document event ends. */
  val columnNumber: Double
  /** Get the line number where the current document event ends. */
  val lineNumber: Double
  /** Get the public identifier for the current document event. */
  val publicId: String
  /** Get the system identifier for the current document event. */
  val systemId: String
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
}

