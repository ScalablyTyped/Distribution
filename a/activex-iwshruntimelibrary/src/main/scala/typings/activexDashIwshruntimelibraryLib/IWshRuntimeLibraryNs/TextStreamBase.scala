package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IWshRuntimeLibrary.TextStreamBase")
@js.native
class TextStreamBase () extends js.Object {
  /**
           * The column number of the current character position in an input stream.
           */
  var Column: scala.Double = js.native
  /**
           * The current line number in an input stream.
           */
  var Line: scala.Double = js.native
  /**
           * Closes a text stream.
           * It is not necessary to close standard streams; they close automatically when the process ends. If
           * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
           */
  def Close(): scala.Unit = js.native
}

