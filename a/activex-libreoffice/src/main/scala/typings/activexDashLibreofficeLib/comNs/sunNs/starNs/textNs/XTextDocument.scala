package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the main interface of a text document.
  * @see com.sun.star.text.TextDocument
  */
trait XTextDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel {
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  val Text: XText
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  def getText(): XText
  /** reformats the contents of the document. */
  def reformat(): scala.Unit
}

