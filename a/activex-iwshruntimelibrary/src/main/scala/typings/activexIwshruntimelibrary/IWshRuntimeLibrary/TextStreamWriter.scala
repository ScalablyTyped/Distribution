package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IWshRuntimeLibrary.TextStreamWriter")
@js.native
class TextStreamWriter protected () extends TextStreamBase {
  @JSName("IWshRuntimeLibrary.TextStreamWriter_typekey")
  var IWshRuntimeLibraryDotTextStreamWriter_typekey: TextStreamWriter = js.native
  /**
    * Sends a string to an output stream.
    */
  def Write(s: String): Unit = js.native
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  def WriteBlankLines(intLines: Double): Unit = js.native
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  def WriteLine(s: String): Unit = js.native
}

