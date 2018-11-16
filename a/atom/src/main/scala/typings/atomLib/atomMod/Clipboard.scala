package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends js.Object {
  /** Read the text from the clipboard. */
  def read(): java.lang.String = js.native
  /**
       *  Read the text from the clipboard and return both the text and the associated
       *  metadata.
       */
  def readWithMetadata(): atomLib.Anon_TextMetadata = js.native
  /** Write the given text to the clipboard. */
  def write(text: java.lang.String): scala.Unit = js.native
  /** Write the given text to the clipboard. */
  def write(text: java.lang.String, metadata: js.Object): scala.Unit = js.native
}

