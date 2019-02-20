package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the {@link Text} of a {@link TextFrame} .
  * @see TextFrame
  */
trait XTextFrame extends XTextContent {
  /** @returns the text within this frame. The returned interface belongs to an object which implements the service {@link Text} . */
  val Text: XText
  /** @returns the text within this frame. The returned interface belongs to an object which implements the service {@link Text} . */
  def getText(): XText
}

