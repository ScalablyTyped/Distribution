package typings.activexDashScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TextStream object */
@JSGlobal("Scripting.TextStream")
@js.native
class TextStream protected () extends js.Object {
  /** Is the current position at the end of a line? */
  val AtEndOfLine: Boolean = js.native
  /** Is the current position at the end of the stream? */
  val AtEndOfStream: Boolean = js.native
  /** Current column number */
  val Column: Double = js.native
  /** Current line number */
  val Line: Double = js.native
  var `Scripting.TextStream_typekey`: TextStream = js.native
  /** Close a text stream */
  def Close(): Unit = js.native
  /** Read a specific number of characters into a string */
  def Read(Characters: Double): String = js.native
  /** Read the entire stream into a string */
  def ReadAll(): String = js.native
  /** Read an entire line into a string */
  def ReadLine(): String = js.native
  /** Skip a specific number of characters */
  def Skip(Characters: Double): Unit = js.native
  /** Skip a line */
  def SkipLine(): Unit = js.native
  /** Write a string to the stream */
  def Write(Text: String): Unit = js.native
  /** Write a number of blank lines to the stream */
  def WriteBlankLines(Lines: Double): Unit = js.native
  /**
    * Write a string and an end of line to the stream
    * @param string [Text='']
    */
  def WriteLine(): Unit = js.native
  def WriteLine(Text: String): Unit = js.native
}

