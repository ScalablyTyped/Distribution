package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IWshRuntimeLibrary.TextStreamWriter")
@js.native
class TextStreamWriter protected () extends TextStreamBase {
  var `IWshRuntimeLibrary.TextStreamWriter_typekey`: TextStreamWriter = js.native
  /**
    * Sends a string to an output stream.
    */
  def Write(s: java.lang.String): scala.Unit = js.native
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  def WriteBlankLines(intLines: scala.Double): scala.Unit = js.native
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  def WriteLine(s: java.lang.String): scala.Unit = js.native
}

