package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXLocator interface */
@JSGlobal("MSXML2.IVBSAXLocator")
@js.native
class IVBSAXLocator protected () extends js.Object {
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

