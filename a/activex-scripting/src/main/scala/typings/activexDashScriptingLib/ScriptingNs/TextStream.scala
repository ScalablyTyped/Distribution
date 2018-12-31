package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TextStream object */
@JSGlobal("Scripting.TextStream")
@js.native
class TextStream protected () extends js.Object {
  /** Is the current position at the end of a line? */
  val AtEndOfLine: scala.Boolean = js.native
  /** Is the current position at the end of the stream? */
  val AtEndOfStream: scala.Boolean = js.native
  /** Current column number */
  val Column: scala.Double = js.native
  /** Current line number */
  val Line: scala.Double = js.native
  var `Scripting.TextStream_typekey`: TextStream = js.native
  /** Close a text stream */
  def Close(): scala.Unit = js.native
  /** Read a specific number of characters into a string */
  def Read(Characters: scala.Double): java.lang.String = js.native
  /** Read the entire stream into a string */
  def ReadAll(): java.lang.String = js.native
  /** Read an entire line into a string */
  def ReadLine(): java.lang.String = js.native
  /** Skip a specific number of characters */
  def Skip(Characters: scala.Double): scala.Unit = js.native
  /** Skip a line */
  def SkipLine(): scala.Unit = js.native
  /** Write a string to the stream */
  def Write(Text: java.lang.String): scala.Unit = js.native
  /** Write a number of blank lines to the stream */
  def WriteBlankLines(Lines: scala.Double): scala.Unit = js.native
  /**
    * Write a string and an end of line to the stream
    * @param string [Text='']
    */
  def WriteLine(): scala.Unit = js.native
  def WriteLine(Text: java.lang.String): scala.Unit = js.native
}

