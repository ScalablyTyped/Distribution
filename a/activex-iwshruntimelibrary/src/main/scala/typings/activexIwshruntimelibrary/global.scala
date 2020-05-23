package typings.activexIwshruntimelibrary

import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.ShortcutWindowStyle
import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshExecStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object IWshRuntimeLibrary extends js.Object {
    @js.native
    class TextStreamBase ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamBase {
      /**
        * The column number of the current character position in an input stream.
        */
      /* CompleteClass */
      override var Column: Double = js.native
      /**
        * The current line number in an input stream.
        */
      /* CompleteClass */
      override var Line: Double = js.native
      /**
        * Closes a text stream.
        * It is not necessary to close standard streams; they close automatically when the process ends. If
        * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
        */
      /* CompleteClass */
      override def Close(): Unit = js.native
    }
    
    @js.native
    class TextStreamReader protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader {
      /**
        * Indicates whether the stream pointer position is at the end of a line.
        */
      /* CompleteClass */
      override var AtEndOfLine: Boolean = js.native
      /**
        * Indicates whether the stream pointer position is at the end of a stream.
        */
      /* CompleteClass */
      override var AtEndOfStream: Boolean = js.native
      /**
        * The column number of the current character position in an input stream.
        */
      /* CompleteClass */
      override var Column: Double = js.native
      /* CompleteClass */
      @JSName("IWshRuntimeLibrary.TextStreamReader_typekey")
      override var IWshRuntimeLibraryDotTextStreamReader_typekey: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader = js.native
      /**
        * The current line number in an input stream.
        */
      /* CompleteClass */
      override var Line: Double = js.native
      /**
        * Closes a text stream.
        * It is not necessary to close standard streams; they close automatically when the process ends. If
        * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
        */
      /* CompleteClass */
      override def Close(): Unit = js.native
      /**
        * Returns a specified number of characters from an input stream, starting at the current pointer position.
        * Does not return until the ENTER key is pressed.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        */
      /* CompleteClass */
      override def Read(characters: Double): String = js.native
      /**
        * Returns all characters from an input stream.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        */
      /* CompleteClass */
      override def ReadAll(): String = js.native
      /**
        * Returns an entire line from an input stream.
        * Although this method extracts the newline character, it does not add it to the returned string.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        */
      /* CompleteClass */
      override def ReadLine(): String = js.native
      /**
        * Skips a specified number of characters when reading from an input text stream.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
        */
      /* CompleteClass */
      override def Skip(characters: Double): Unit = js.native
      /**
        * Skips the next line when reading from an input text stream.
        * Can only be used on a stream in reading mode, not writing or appending mode.
        */
      /* CompleteClass */
      override def SkipLine(): Unit = js.native
    }
    
    @js.native
    class TextStreamWriter protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter {
      /**
        * The column number of the current character position in an input stream.
        */
      /* CompleteClass */
      override var Column: Double = js.native
      /* CompleteClass */
      @JSName("IWshRuntimeLibrary.TextStreamWriter_typekey")
      override var IWshRuntimeLibraryDotTextStreamWriter_typekey: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter = js.native
      /**
        * The current line number in an input stream.
        */
      /* CompleteClass */
      override var Line: Double = js.native
      /**
        * Closes a text stream.
        * It is not necessary to close standard streams; they close automatically when the process ends. If
        * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
        */
      /* CompleteClass */
      override def Close(): Unit = js.native
      /**
        * Sends a string to an output stream.
        */
      /* CompleteClass */
      override def Write(s: String): Unit = js.native
      /**
        * Sends a specified number of blank lines (newline characters) to an output stream.
        */
      /* CompleteClass */
      override def WriteBlankLines(intLines: Double): Unit = js.native
      /**
        * Sends a string followed by a newline character to an output stream.
        */
      /* CompleteClass */
      override def WriteLine(s: String): Unit = js.native
    }
    
    /** WSHExec object */
    @js.native
    class WshExec protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshExec {
      /* CompleteClass */
      override val ExitCode: Double = js.native
      /* CompleteClass */
      @JSName("IWshRuntimeLibrary.WshExec_typekey")
      override var IWshRuntimeLibraryDotWshExec_typekey: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshExec = js.native
      /* CompleteClass */
      override val ProcessID: Double = js.native
      /* CompleteClass */
      override val Status: WshExecStatus = js.native
      /* CompleteClass */
      override val StdErr: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter = js.native
      /* CompleteClass */
      override val StdIn: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader = js.native
      /* CompleteClass */
      override val StdOut: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter = js.native
      /* CompleteClass */
      override def Terminate(): Unit = js.native
    }
    
    /** Network Object */
    @js.native
    class WshNetwork protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
    
    /** Shell Object */
    @js.native
    class WshShell protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShell
    
    /** Shortcut Object */
    @js.native
    class WshShortcut protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShortcut {
      /* CompleteClass */
      override var Arguments: String = js.native
      /* CompleteClass */
      override var Description: String = js.native
      /* CompleteClass */
      override val FullName: String = js.native
      /* CompleteClass */
      override var Hotkey: String = js.native
      /* CompleteClass */
      @JSName("IWshRuntimeLibrary.WshShortcut_typekey")
      override var IWshRuntimeLibraryDotWshShortcut_typekey: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShortcut = js.native
      /* CompleteClass */
      override var IconLocation: String = js.native
      /* CompleteClass */
      override val RelativePath: String = js.native
      /* CompleteClass */
      override var TargetPath: String = js.native
      /**
        * Possible values:
        *
        * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
        * when displaying the window for the first time.
        * * **3** -- Activates the window and displays it as a maximized window.
        * * **7** -- Displays the window as a minimized window. The active window remains active.
        */
      /* CompleteClass */
      override var WindowStyle: ShortcutWindowStyle = js.native
      /* CompleteClass */
      override var WorkingDirectory: String = js.native
      /* CompleteClass */
      override def Load(PathLink: String): Unit = js.native
      /* CompleteClass */
      override def Save(): Unit = js.native
    }
    
    /** URLShortcut Object */
    @js.native
    class WshURLShortcut protected ()
      extends typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshURLShortcut {
      /* CompleteClass */
      override val FullName: String = js.native
      /* CompleteClass */
      @JSName("IWshRuntimeLibrary.WshURLShortcut_typekey")
      override var IWshRuntimeLibraryDotWshURLShortcut_typekey: typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshURLShortcut = js.native
      /* CompleteClass */
      override var TargetPath: String = js.native
      /* CompleteClass */
      override def Load(PathLink: String): Unit = js.native
      /* CompleteClass */
      override def Save(): Unit = js.native
    }
    
  }
  
  @js.native
  object ScriptSigner extends js.Object {
    @js.native
    class Signer protected ()
      extends typings.activexIwshruntimelibrary.ScriptSigner.Signer
    
  }
  
  @js.native
  object WSHControllerLibrary extends js.Object {
    @js.native
    class WSHController protected ()
      extends typings.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
    
  }
  
}

