package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStreamWriter extends TextStreamBase {
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

object TextStreamWriter {
  @scala.inline
  def apply(
    Close: () => Unit,
    Column: Double,
    IWshRuntimeLibraryDotTextStreamWriter_typekey: TextStreamWriter,
    Line: Double,
    Write: String => Unit,
    WriteBlankLines: Double => Unit,
    WriteLine: String => Unit
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Write = js.Any.fromFunction1(Write), WriteBlankLines = js.Any.fromFunction1(WriteBlankLines), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.updateDynamic("IWshRuntimeLibrary.TextStreamWriter_typekey")(IWshRuntimeLibraryDotTextStreamWriter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStreamWriter]
  }
  @scala.inline
  implicit class TextStreamWriterOps[Self <: TextStreamWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIWshRuntimeLibraryDotTextStreamWriter_typekey(value: TextStreamWriter): Self = this.set("IWshRuntimeLibrary.TextStreamWriter_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("Write", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteBlankLines(value: Double => Unit): Self = this.set("WriteBlankLines", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteLine(value: String => Unit): Self = this.set("WriteLine", js.Any.fromFunction1(value))
  }
  
}

