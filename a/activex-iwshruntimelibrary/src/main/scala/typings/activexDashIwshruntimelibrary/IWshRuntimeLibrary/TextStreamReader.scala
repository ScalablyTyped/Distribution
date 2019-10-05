package typings.activexDashIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IWshRuntimeLibrary.TextStreamReader")
@js.native
class TextStreamReader protected () extends TextStreamBase {
  /**
    * Indicates whether the stream pointer position is at the end of a line.
    */
  var AtEndOfLine: Boolean = js.native
  /**
    * Indicates whether the stream pointer position is at the end of a stream.
    */
  var AtEndOfStream: Boolean = js.native
  var `IWshRuntimeLibrary.TextStreamReader_typekey`: TextStreamReader = js.native
  /**
    * Returns a specified number of characters from an input stream, starting at the current pointer position.
    * Does not return until the ENTER key is pressed.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def Read(characters: Double): String = js.native
  /**
    * Returns all characters from an input stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def ReadAll(): String = js.native
  /**
    * Returns an entire line from an input stream.
    * Although this method extracts the newline character, it does not add it to the returned string.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def ReadLine(): String = js.native
  /**
    * Skips a specified number of characters when reading from an input text stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
    */
  def Skip(characters: Double): Unit = js.native
  /**
    * Skips the next line when reading from an input text stream.
    * Can only be used on a stream in reading mode, not writing or appending mode.
    */
  def SkipLine(): Unit = js.native
}

