package typings.activexDashIwshruntimelibrary.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IWshRuntimeLibrary.TextStreamBase")
@js.native
class TextStreamBase () extends js.Object {
  /**
    * The column number of the current character position in an input stream.
    */
  var Column: Double = js.native
  /**
    * The current line number in an input stream.
    */
  var Line: Double = js.native
  /**
    * Closes a text stream.
    * It is not necessary to close standard streams; they close automatically when the process ends. If
    * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
    */
  def Close(): Unit = js.native
}

