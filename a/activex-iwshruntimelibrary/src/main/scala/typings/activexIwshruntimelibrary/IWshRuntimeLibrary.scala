package typings.activexIwshruntimelibrary

import typings.activexIwshruntimelibrary.activexIwshruntimelibraryBooleans.`true`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`-1`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1048576`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`10`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`11`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`16`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`256`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`32`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4096`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`48`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`512`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`524288`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`64`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7`
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Process
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.REG_BINARY
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.REG_DWORD
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.REG_EXPAND_SZ
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.REG_SZ
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.System
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.User
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Volatile
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IWshRuntimeLibrary {
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6`
  */
  trait ButtonType extends StObject
  object ButtonType {
    
    inline def AbortRetryIgnore: `2` = 2.asInstanceOf[`2`]
    
    inline def CancelTryagainContinue: `6` = 6.asInstanceOf[`6`]
    
    inline def OK: `0` = 0.asInstanceOf[`0`]
    
    inline def OKCancel: `1` = 1.asInstanceOf[`1`]
    
    inline def RetryCancel: `5` = 5.asInstanceOf[`5`]
    
    inline def YesNo: `4` = 4.asInstanceOf[`4`]
    
    inline def YesNoCancel: `3` = 3.asInstanceOf[`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
  */
  trait EventType extends StObject
  object EventType {
    
    inline def AuditFailure: `5` = 5.asInstanceOf[`5`]
    
    inline def AuditSuccess: `4` = 4.asInstanceOf[`4`]
    
    inline def Error: `1` = 1.asInstanceOf[`1`]
    
    inline def Information: `3` = 3.asInstanceOf[`3`]
    
    inline def Success: `0` = 0.asInstanceOf[`0`]
    
    inline def Warning: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`16`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`32`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`48`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`64`
  */
  trait IconType extends StObject
  object IconType {
    
    inline def ExclamationMark: `48` = 48.asInstanceOf[`48`]
    
    inline def InformationMark: `64` = 64.asInstanceOf[`64`]
    
    inline def QuestionMark: `32` = 32.asInstanceOf[`32`]
    
    inline def Stop: `16` = 16.asInstanceOf[`16`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`-1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`10`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`11`
  */
  trait PopupSelection extends StObject
  object PopupSelection {
    
    inline def Abort: `3` = 3.asInstanceOf[`3`]
    
    inline def Cancel: `2` = 2.asInstanceOf[`2`]
    
    inline def Continue: `11` = 11.asInstanceOf[`11`]
    
    inline def Ignore: `5` = 5.asInstanceOf[`5`]
    
    inline def No: `7` = 7.asInstanceOf[`7`]
    
    inline def NoButton: `-1` = -1.asInstanceOf[`-1`]
    
    inline def OK: `1` = 1.asInstanceOf[`1`]
    
    inline def Retry: `4` = 4.asInstanceOf[`4`]
    
    inline def TryAgain: `10` = 10.asInstanceOf[`10`]
    
    inline def Yes: `6` = 6.asInstanceOf[`6`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`256`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`512`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4096`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`524288`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1048576`
  */
  trait PopupType extends StObject
  object PopupType {
    
    inline def Modal: `4096` = 4096.asInstanceOf[`4096`]
    
    inline def RTL: `1048576` = 1048576.asInstanceOf[`1048576`]
    
    inline def RightJustified: `524288` = 524288.asInstanceOf[`524288`]
    
    inline def SecondButtonDefault: `256` = 256.asInstanceOf[`256`]
    
    inline def ThirdButtonDefault: `512` = 512.asInstanceOf[`512`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7`
  */
  trait ShortcutWindowStyle extends StObject
  object ShortcutWindowStyle {
    
    inline def `1`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1` = 1.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`]
    
    inline def `3`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3` = 3.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`]
    
    inline def `7`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7` = 7.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7`]
  }
  
  trait TextStreamBase extends StObject {
    
    /**
      * Closes a text stream.
      * It is not necessary to close standard streams; they close automatically when the process ends. If
      * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
      */
    def Close(): Unit
    
    /**
      * The column number of the current character position in an input stream.
      */
    var Column: Double
    
    /**
      * The current line number in an input stream.
      */
    var Line: Double
  }
  object TextStreamBase {
    
    inline def apply(Close: () => Unit, Column: Double, Line: Double): TextStreamBase = {
      val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextStreamBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextStreamBase] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
      
      inline def setColumn(value: Double): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextStreamReader
    extends StObject
       with TextStreamBase {
    
    /**
      * Indicates whether the stream pointer position is at the end of a line.
      */
    var AtEndOfLine: Boolean
    
    /**
      * Indicates whether the stream pointer position is at the end of a stream.
      */
    var AtEndOfStream: Boolean
    
    /* private */ @JSName("IWshRuntimeLibrary.TextStreamReader_typekey")
    var IWshRuntimeLibraryDotTextStreamReader_typekey: TextStreamReader
    
    /**
      * Returns a specified number of characters from an input stream, starting at the current pointer position.
      * Does not return until the ENTER key is pressed.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
      */
    def Read(characters: Double): String
    
    /**
      * Returns all characters from an input stream.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
      */
    def ReadAll(): String
    
    /**
      * Returns an entire line from an input stream.
      * Although this method extracts the newline character, it does not add it to the returned string.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
      */
    def ReadLine(): String
    
    /**
      * Skips a specified number of characters when reading from an input text stream.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
      * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
      */
    def Skip(characters: Double): Unit
    
    /**
      * Skips the next line when reading from an input text stream.
      * Can only be used on a stream in reading mode, not writing or appending mode.
      */
    def SkipLine(): Unit
  }
  object TextStreamReader {
    
    inline def apply(
      AtEndOfLine: Boolean,
      AtEndOfStream: Boolean,
      Close: () => Unit,
      Column: Double,
      IWshRuntimeLibraryDotTextStreamReader_typekey: TextStreamReader,
      Line: Double,
      Read: Double => String,
      ReadAll: () => String,
      ReadLine: () => String,
      Skip: Double => Unit,
      SkipLine: () => Unit
    ): TextStreamReader = {
      val __obj = js.Dynamic.literal(AtEndOfLine = AtEndOfLine.asInstanceOf[js.Any], AtEndOfStream = AtEndOfStream.asInstanceOf[js.Any], Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Read = js.Any.fromFunction1(Read), ReadAll = js.Any.fromFunction0(ReadAll), ReadLine = js.Any.fromFunction0(ReadLine), Skip = js.Any.fromFunction1(Skip), SkipLine = js.Any.fromFunction0(SkipLine))
      __obj.updateDynamic("IWshRuntimeLibrary.TextStreamReader_typekey")(IWshRuntimeLibraryDotTextStreamReader_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextStreamReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextStreamReader] (val x: Self) extends AnyVal {
      
      inline def setAtEndOfLine(value: Boolean): Self = StObject.set(x, "AtEndOfLine", value.asInstanceOf[js.Any])
      
      inline def setAtEndOfStream(value: Boolean): Self = StObject.set(x, "AtEndOfStream", value.asInstanceOf[js.Any])
      
      inline def setIWshRuntimeLibraryDotTextStreamReader_typekey(value: TextStreamReader): Self = StObject.set(x, "IWshRuntimeLibrary.TextStreamReader_typekey", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Double => String): Self = StObject.set(x, "Read", js.Any.fromFunction1(value))
      
      inline def setReadAll(value: () => String): Self = StObject.set(x, "ReadAll", js.Any.fromFunction0(value))
      
      inline def setReadLine(value: () => String): Self = StObject.set(x, "ReadLine", js.Any.fromFunction0(value))
      
      inline def setSkip(value: Double => Unit): Self = StObject.set(x, "Skip", js.Any.fromFunction1(value))
      
      inline def setSkipLine(value: () => Unit): Self = StObject.set(x, "SkipLine", js.Any.fromFunction0(value))
    }
  }
  
  trait TextStreamWriter
    extends StObject
       with TextStreamBase {
    
    /* private */ @JSName("IWshRuntimeLibrary.TextStreamWriter_typekey")
    var IWshRuntimeLibraryDotTextStreamWriter_typekey: TextStreamWriter
    
    /**
      * Sends a string to an output stream.
      */
    def Write(s: String): Unit
    
    /**
      * Sends a specified number of blank lines (newline characters) to an output stream.
      */
    def WriteBlankLines(intLines: Double): Unit
    
    /**
      * Sends a string followed by a newline character to an output stream.
      */
    def WriteLine(s: String): Unit
  }
  object TextStreamWriter {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: TextStreamWriter] (val x: Self) extends AnyVal {
      
      inline def setIWshRuntimeLibraryDotTextStreamWriter_typekey(value: TextStreamWriter): Self = StObject.set(x, "IWshRuntimeLibrary.TextStreamWriter_typekey", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "Write", js.Any.fromFunction1(value))
      
      inline def setWriteBlankLines(value: Double => Unit): Self = StObject.set(x, "WriteBlankLines", js.Any.fromFunction1(value))
      
      inline def setWriteLine(value: String => Unit): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`8`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`9`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`10`
  */
  trait WindowStyle extends StObject
  object WindowStyle {
    
    inline def `0`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0` = 0.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`]
    
    inline def `1`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1` = 1.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`]
    
    inline def `10`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`10` = 10.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`10`]
    
    inline def `2`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2` = 2.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`]
    
    inline def `3`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3` = 3.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`]
    
    inline def `4`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4` = 4.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`]
    
    inline def `5`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5` = 5.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`5`]
    
    inline def `6`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6` = 6.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6`]
    
    inline def `7`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7` = 7.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`7`]
    
    inline def `8`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`8` = 8.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`8`]
    
    inline def `9`: typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`9` = 9.asInstanceOf[typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`9`]
  }
  
  /** Generic Collection Object */
  @js.native
  trait WshCollection extends StObject {
    
    def apply(Index: Any): Any = js.native
    
    def Count(): Double = js.native
    
    def Item(Index: Any): Any = js.native
    
    val length: Double = js.native
  }
  
  /** Environment Variables Collection Object */
  @js.native
  trait WshEnvironment extends StObject {
    
    def apply(Name: String): String = js.native
    
    def Count(): Double = js.native
    
    def Item(Name: String): String = js.native
    
    val Length: Double = js.native
    
    def Remove(Name: String): Unit = js.native
  }
  
  /** WSHExec object */
  trait WshExec extends StObject {
    
    val ExitCode: Double
    
    /* private */ @JSName("IWshRuntimeLibrary.WshExec_typekey")
    var IWshRuntimeLibraryDotWshExec_typekey: WshExec
    
    val ProcessID: Double
    
    val Status: WshExecStatus
    
    val StdErr: TextStreamWriter
    
    val StdIn: TextStreamReader
    
    val StdOut: TextStreamWriter
    
    def Terminate(): Unit
  }
  object WshExec {
    
    inline def apply(
      ExitCode: Double,
      IWshRuntimeLibraryDotWshExec_typekey: WshExec,
      ProcessID: Double,
      Status: WshExecStatus,
      StdErr: TextStreamWriter,
      StdIn: TextStreamReader,
      StdOut: TextStreamWriter,
      Terminate: () => Unit
    ): WshExec = {
      val __obj = js.Dynamic.literal(ExitCode = ExitCode.asInstanceOf[js.Any], ProcessID = ProcessID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StdErr = StdErr.asInstanceOf[js.Any], StdIn = StdIn.asInstanceOf[js.Any], StdOut = StdOut.asInstanceOf[js.Any], Terminate = js.Any.fromFunction0(Terminate))
      __obj.updateDynamic("IWshRuntimeLibrary.WshExec_typekey")(IWshRuntimeLibraryDotWshExec_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WshExec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WshExec] (val x: Self) extends AnyVal {
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
      
      inline def setIWshRuntimeLibraryDotWshExec_typekey(value: WshExec): Self = StObject.set(x, "IWshRuntimeLibrary.WshExec_typekey", value.asInstanceOf[js.Any])
      
      inline def setProcessID(value: Double): Self = StObject.set(x, "ProcessID", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: WshExecStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStdErr(value: TextStreamWriter): Self = StObject.set(x, "StdErr", value.asInstanceOf[js.Any])
      
      inline def setStdIn(value: TextStreamReader): Self = StObject.set(x, "StdIn", value.asInstanceOf[js.Any])
      
      inline def setStdOut(value: TextStreamWriter): Self = StObject.set(x, "StdOut", value.asInstanceOf[js.Any])
      
      inline def setTerminate(value: () => Unit): Self = StObject.set(x, "Terminate", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`
  */
  trait WshExecStatus extends StObject
  object WshExecStatus {
    
    inline def WshFailed: `2` = 2.asInstanceOf[`2`]
    
    inline def WshFinished: `1` = 1.asInstanceOf[`1`]
    
    inline def WshRunning: `0` = 0.asInstanceOf[`0`]
  }
  
  /** Network Object */
  @js.native
  trait WshNetwork extends StObject {
    
    /**
      * Adds a remote MS-DOS-based printer connection to your computer system.
      * @param LocalName Local name to assign to the connected printer.
      * @param RemoteName Name of the remote printer.
      * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
      *
      * If you are mapping a remote printer using the profile of someone other than current user, you can specify _UserName_ and _Password_.
      */
    def AddPrinterConnection(LocalName: String, RemoteName: String): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String, Password: String): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: Unit, Password: String): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Unit, UserName: String): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Unit, UserName: String, Password: String): Unit = js.native
    def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Unit, UserName: Unit, Password: String): Unit = js.native
    
    /**
      * @param string Path to printer connection
      * @param string [DriverName='']
      * @param string [Port='LPT1']
      *
      * Unlike the **AddPrinterConnection** method, this method allows you to create a printer connection without directing it to a specific port, such as LPT1.
      */
    def AddWindowsPrinterConnection(PrinterName: String): Unit = js.native
    def AddWindowsPrinterConnection(PrinterName: String, DriverName: String): Unit = js.native
    def AddWindowsPrinterConnection(PrinterName: String, DriverName: String, Port: String): Unit = js.native
    def AddWindowsPrinterConnection(PrinterName: String, DriverName: Unit, Port: String): Unit = js.native
    
    val ComputerName: String = js.native
    
    def EnumNetworkDrives(): WshCollection = js.native
    
    def EnumPrinterConnections(): WshCollection = js.native
    
    /* private */ @JSName("IWshRuntimeLibrary.WshNetwork_typekey")
    var IWshRuntimeLibraryDotWshNetwork_typekey: WshNetwork = js.native
    
    /**
      * Adds a remote MS-DOS-based printer connection to your computer system.
      * @param LocalName Name by which the mapped drive will be known locally
      * @param RemoteName Share's UNC name (\\xxx\yyy)
      * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
      *
      * If you are mapping a network drive using the profile of someone other than current user, you can specify _UserName_ and _Password_.
      */
    def MapNetworkDrive(LocalName: String, RemoteName: String): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String, Password: String): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: Unit, Password: String): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Unit, UserName: String): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Unit, UserName: String, Password: String): Unit = js.native
    def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Unit, UserName: Unit, Password: String): Unit = js.native
    
    val Organization: String = js.native
    
    /**
      * Removes a shared network drive from your computer system
      * @param Name Name of the mapped drive you want to remove. This will be the drive letter if the drive has a mapping between a local name (drive letter) and a remote name (UNC name);
      * it will be the UNC path if there is no such mapping
      * @param Force [false] Remove the connections even if the resource is in use
      * @param UpdateProfile [false] Remove the mapping from the user's profile
      */
    def RemoveNetworkDrive(Name: String): Unit = js.native
    def RemoveNetworkDrive(Name: String, Force: Boolean): Unit = js.native
    def RemoveNetworkDrive(Name: String, Force: Boolean, UpdateProfile: Boolean): Unit = js.native
    def RemoveNetworkDrive(Name: String, Force: Unit, UpdateProfile: Boolean): Unit = js.native
    
    /**
      * Removes a shared network printer connection from your computer system
      * @param Name Name that identifies the printer. Can be a UNC name (in the form `\\xxx\yyy`) or a local name (such as `LPT1`)
      * @param Force [false] Remove printer connection even if a user is still connected
      * @param UpdateProfile [false] Remove the printer connection from the user's profile
      *
      * The **RemovePrinterConnection** method removes both Windows and MS-DOS based printer connections. If the printer was connected using the method **AddPrinterConnection**,
      * _Name_ must be the printer's local name. If the printer was connected using the **AddWindowsPrinterConnection** method or was added manually (using the Add Printer wizard),
      * then _Name_ must be the printer's UNC name.
      */
    def RemovePrinterConnection(Name: String): Unit = js.native
    @JSName("RemovePrinterConnection")
    def RemovePrinterConnection_true(Name: String, Force: Unit, UpdateProfile: `true`): Unit = js.native
    @JSName("RemovePrinterConnection")
    def RemovePrinterConnection_true(Name: String, Force: `true`): Unit = js.native
    @JSName("RemovePrinterConnection")
    def RemovePrinterConnection_true(Name: String, Force: `true`, UpdateProfile: `true`): Unit = js.native
    
    def SetDefaultPrinter(Name: String): Unit = js.native
    
    val Site: String = js.native
    
    val UserDomain: String = js.native
    
    val UserName: String = js.native
    
    val UserProfile: String = js.native
  }
  
  /** Shell Object */
  @js.native
  trait WshShell extends StObject {
    
    /**
      * Activates an application window
      * @param App Title of application as it appears in the title bar, or the process ID
      * @param Wait
      *
      * This method changes the focus to the named application or window. The window must be attached to the calling thread's message queue. It does not affect whether it is maximized or
      * minimized. Focus moves from the activated application window when the user takes action to change the focus (or closes the window).
      *
      * In determining which application to activate, the specified title is compared to the title string of each running application. If no exact match exists, any application whose title
      * string begins with title is activated. If an application still cannot be found, any application whose title string ends with title is activated. If more than one instance of the
      * application named by title exists, one instance is arbitrarily activated.
      *
      * The method might return `false` under the following conditions:
      *
      * * The window is not brought to the foreground.
      * * The window is brought to the foreground but is not given keyboard focus.
      * * A Command Prompt window (`cmd.exe`) is brought to the foreground and is given keyboard focus.
      */
    def AppActivate(App: String): Boolean = js.native
    def AppActivate(App: String, Wait: Any): Boolean = js.native
    def AppActivate(App: Double): Boolean = js.native
    def AppActivate(App: Double, Wait: Any): Boolean = js.native
    
    /**
      * Creates a shortcut
      * @param PathLink Path where the shortcut should be created
      *
      * The shortcut object exists in memory until you save it to disk with the **Save** method.
      */
    def CreateShortcut(PathLink: String): WshShortcut | WshURLShortcut = js.native
    
    var CurrentDirectory: String = js.native
    
    /**
      * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
      *
      *     let env = new ActiveXObject('WScript.Shell').Environment;
      *     WScript.Echo(env('System'));
      *
      * will return an empty string, unless there is an environment variable named `System`
      */
    def Environment(Name: String): String = js.native
    /**
      * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
      *
      *     let env = new ActiveXObject('WScript.Shell').Environment;
      *     WScript.Echo(env('System'));
      *
      * will return an empty string, unless there is an environment variable named `System`
      */
    def Environment(Type: System | User | Process | Volatile): WshEnvironment = js.native
    /**
      * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
      *
      *     let env = new ActiveXObject('WScript.Shell').Environment;
      *     WScript.Echo(env('System'));
      *
      * will return an empty string, unless there is an environment variable named `System`
      */
    @JSName("Environment")
    var Environment_Original: WshEnvironment & (js.Function1[/* Type */ System | User | Process | Volatile, WshEnvironment]) = js.native
    
    def Exec(Command: String): WshExec = js.native
    
    def ExpandEnvironmentStrings(Src: String): String = js.native
    
    /* private */ @JSName("IWshRuntimeLibrary.WshShell_typekey")
    var IWshRuntimeLibraryDotWshShell_typekey: WshShell = js.native
    
    /** @param string [Target=''] Name of the computer system where the event should be logged; default is the local computer system */
    def LogEvent(Type: EventType, Message: String): Boolean = js.native
    def LogEvent(Type: EventType, Message: String, Target: String): Boolean = js.native
    
    def Popup(Text: String): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: String): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: String, Type: ButtonType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: String, Type: IconType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: String, Type: PopupType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: Unit, Type: ButtonType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: Unit, Type: IconType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Double, Title: Unit, Type: PopupType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: String): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: String, Type: ButtonType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: String, Type: IconType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: String, Type: PopupType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: Unit, Type: ButtonType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: Unit, Type: IconType): PopupSelection = js.native
    def Popup(Text: String, SecondsToWait: Unit, Title: Unit, Type: PopupType): PopupSelection = js.native
    
    def RegDelete(Name: String): Unit = js.native
    
    /**
      * Returns the value of a key or value-name from the registry
      * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
      *
      * Returns one of the following, based on the registry value type:
      *
      * * **REG_SZ** -- a string
      * * **REG_DWORD** -- a number
      * * **REG_SBINARY** -- a binary value, as a COM SafeArray containing integers
      * * **REG_EXPAND_SZ** -- an expandable string
      * * **REG_MULTI_SZ** -- an array of srings, as a COM SafeArray
      */
    def RegRead(Name: String): String | Double | (SafeArray[Double | String]) = js.native
    
    /**
      * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
      * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
      * @param Value Will be coerced to `string` or `integer` based on the value-name type:
      * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
      * `REG_DWORD | REG_BINARY` will be converted to `integer`
      * @param Type
      */
    def RegWrite(Name: String, Value: Any): Unit = js.native
    def RegWrite(Name: String, Value: Any, Type: REG_SZ | REG_DWORD | REG_BINARY | REG_EXPAND_SZ): Unit = js.native
    
    /**
      * Runs a program in a new process.
      * @param Command Command-line, including any parameters you want to pass to the executable file.
      * @param WindowStyle Appearance of the program window. Not all programs make use of this information.
      * @param WaitOnReturn Block script until program finishes executing.
      *
      * If `false` is passed into **WaitOnReturn**, the **Run** method will return 0 immediately. If `true` is passed in, **Run** will return the program's error code, if any.
      *
      * Environment variables will be expanded within the command line.
      *
      * Passing a registered file type will automatically open the program registered to the file type.
      *
      * Possible values for **WindowStyle**:
      *
      * * **0** -- Hides the window and activates another window.
      * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
      * when displaying the window for the first time.
      * * **2** -- Activates the window and displays it as a minimized window.
      * * **3** -- Activates the window and displays it as a maximized window.
      * * **4** -- Displays a window in its most recent size and position. The active window remains active.
      * * **5** -- Activates the window and displays it in its current size and position.
      * * **6** -- Minimizes the specified window and activates the next top-level window in the Z order.
      * * **7** -- Displays the window as a minimized window. The active window remains active.
      * * **8** -- Displays the window in its current state. The active window remains active.
      * * **9** -- Activates and displays the window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
      * when restoring a minimized window.
      * * **10** -- Sets the show-state based on the state of the program that started the application.
      */
    def Run(Command: String): Double = js.native
    def Run(Command: String, WindowStyle: Unit, WaitOnReturn: Boolean): Double = js.native
    def Run(Command: String, WindowStyle: WindowStyle): Double = js.native
    def Run(Command: String, WindowStyle: WindowStyle, WaitOnReturn: Boolean): Double = js.native
    
    def SendKeys(Keys: String): Unit = js.native
    def SendKeys(Keys: String, Wait: Boolean): Unit = js.native
    
    def SpecialFolders(Index: Any): Any = js.native
    @JSName("SpecialFolders")
    val SpecialFolders_Original: WshCollection = js.native
  }
  
  /** Shortcut Object */
  trait WshShortcut extends StObject {
    
    var Arguments: String
    
    var Description: String
    
    val FullName: String
    
    var Hotkey: String
    
    /* private */ @JSName("IWshRuntimeLibrary.WshShortcut_typekey")
    var IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut
    
    var IconLocation: String
    
    def Load(PathLink: String): Unit
    
    val RelativePath: String
    
    def Save(): Unit
    
    var TargetPath: String
    
    /**
      * Possible values:
      *
      * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
      * when displaying the window for the first time.
      * * **3** -- Activates the window and displays it as a maximized window.
      * * **7** -- Displays the window as a minimized window. The active window remains active.
      */
    var WindowStyle: ShortcutWindowStyle
    
    var WorkingDirectory: String
  }
  object WshShortcut {
    
    inline def apply(
      Arguments: String,
      Description: String,
      FullName: String,
      Hotkey: String,
      IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut,
      IconLocation: String,
      Load: String => Unit,
      RelativePath: String,
      Save: () => Unit,
      TargetPath: String,
      WindowStyle: ShortcutWindowStyle,
      WorkingDirectory: String
    ): WshShortcut = {
      val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Hotkey = Hotkey.asInstanceOf[js.Any], IconLocation = IconLocation.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), RelativePath = RelativePath.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), TargetPath = TargetPath.asInstanceOf[js.Any], WindowStyle = WindowStyle.asInstanceOf[js.Any], WorkingDirectory = WorkingDirectory.asInstanceOf[js.Any])
      __obj.updateDynamic("IWshRuntimeLibrary.WshShortcut_typekey")(IWshRuntimeLibraryDotWshShortcut_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WshShortcut]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WshShortcut] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: String): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
      
      inline def setHotkey(value: String): Self = StObject.set(x, "Hotkey", value.asInstanceOf[js.Any])
      
      inline def setIWshRuntimeLibraryDotWshShortcut_typekey(value: WshShortcut): Self = StObject.set(x, "IWshRuntimeLibrary.WshShortcut_typekey", value.asInstanceOf[js.Any])
      
      inline def setIconLocation(value: String): Self = StObject.set(x, "IconLocation", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: String => Unit): Self = StObject.set(x, "Load", js.Any.fromFunction1(value))
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "RelativePath", value.asInstanceOf[js.Any])
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "TargetPath", value.asInstanceOf[js.Any])
      
      inline def setWindowStyle(value: ShortcutWindowStyle): Self = StObject.set(x, "WindowStyle", value.asInstanceOf[js.Any])
      
      inline def setWorkingDirectory(value: String): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  /** URLShortcut Object */
  trait WshURLShortcut extends StObject {
    
    val FullName: String
    
    /* private */ @JSName("IWshRuntimeLibrary.WshURLShortcut_typekey")
    var IWshRuntimeLibraryDotWshURLShortcut_typekey: WshURLShortcut
    
    def Load(PathLink: String): Unit
    
    def Save(): Unit
    
    var TargetPath: String
  }
  object WshURLShortcut {
    
    inline def apply(
      FullName: String,
      IWshRuntimeLibraryDotWshURLShortcut_typekey: WshURLShortcut,
      Load: String => Unit,
      Save: () => Unit,
      TargetPath: String
    ): WshURLShortcut = {
      val __obj = js.Dynamic.literal(FullName = FullName.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), Save = js.Any.fromFunction0(Save), TargetPath = TargetPath.asInstanceOf[js.Any])
      __obj.updateDynamic("IWshRuntimeLibrary.WshURLShortcut_typekey")(IWshRuntimeLibraryDotWshURLShortcut_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WshURLShortcut]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WshURLShortcut] (val x: Self) extends AnyVal {
      
      inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
      
      inline def setIWshRuntimeLibraryDotWshURLShortcut_typekey(value: WshURLShortcut): Self = StObject.set(x, "IWshRuntimeLibrary.WshURLShortcut_typekey", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: String => Unit): Self = StObject.set(x, "Load", js.Any.fromFunction1(value))
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "TargetPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`0`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`3`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`2`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`6`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`1`
    - typings.activexIwshruntimelibrary.activexIwshruntimelibraryInts.`4`
  */
  trait WshWindowStyle extends StObject
  object WshWindowStyle {
    
    inline def WshHide: `0` = 0.asInstanceOf[`0`]
    
    inline def WshMaximizedFocus: `3` = 3.asInstanceOf[`3`]
    
    inline def WshMinimizedFocus: `2` = 2.asInstanceOf[`2`]
    
    inline def WshMinimizedNoFocus: `6` = 6.asInstanceOf[`6`]
    
    inline def WshNormalFocus: `1` = 1.asInstanceOf[`1`]
    
    inline def WshNormalNoFocus: `4` = 4.asInstanceOf[`4`]
  }
}
