package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.mod.Disposable
import typings.atom.srcOtherTypesMod.HandleableErrorEvent
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBufferedProcessMod {
  
  @JSImport("atom/src/buffered-process", "BufferedProcess")
  @js.native
  open class BufferedProcess protected () extends StObject {
    def this(options: ProcessOptions) = this()
    
    // Helper Methods
    /** Terminate the process. */
    def kill(): Unit = js.native
    
    // Event Subscription
    /**
      *  Will call your callback when an error will be raised by the process. Usually
      *  this is due to the command not being available or not on the PATH. You can
      *  call handle() on the object passed to your callback to indicate that you
      *  have handled this error.
      */
    def onWillThrowError(callback: js.Function1[/* errorObject */ HandleableErrorEvent, Unit]): Disposable = js.native
    
    val process: js.UndefOr[ChildProcess] = js.native
    
    /** Runs the process. */
    def start(): Unit = js.native
  }
  
  trait NodeProcessOptions extends StObject {
    
    /** The array of arguments to pass to the command. */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The command to execute. */
    var command: String
    
    /** The callback which receives a single argument containing the exit status. */
    var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.undefined
    
    /** The options object to pass to Node's ChildProcess.spawn method. */
    var options: js.UndefOr[SpawnProcessOptions] = js.undefined
    
    /**
      *  The callback that receives a single argument which contains the standard
      *  error output from the command.
      */
    var stderr: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
    
    /**
      *  The callback that receives a single argument which contains the standard
      *  output from the command.
      */
    var stdout: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  }
  object NodeProcessOptions {
    
    inline def apply(command: String): NodeProcessOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeProcessOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeProcessOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setExit(value: /* code */ Double => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setOptions(value: SpawnProcessOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStderr(value: /* data */ String => Unit): Self = StObject.set(x, "stderr", js.Any.fromFunction1(value))
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: /* data */ String => Unit): Self = StObject.set(x, "stdout", js.Any.fromFunction1(value))
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  trait ProcessOptions
    extends StObject
       with NodeProcessOptions {
    
    /**
      *  Whether the command will automatically start when this BufferedProcess is
      *  created.
      */
    var autoStart: js.UndefOr[Boolean] = js.undefined
  }
  object ProcessOptions {
    
    inline def apply(command: String): ProcessOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    }
  }
  
  trait SpawnProcessOptions extends StObject {
    
    /** Current working directory of the child process. */
    var cwd: js.UndefOr[String] = js.undefined
    
    /** Prepare child to run independently of its parent process. */
    var detached: js.UndefOr[Boolean] = js.undefined
    
    /** Environment key-value pairs. */
    var env: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Sets the group identity of the process. */
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      *  If true, runs command inside of a shell. Uses "/bin/sh" on UNIX, and process.env.ComSpec
      *  on Windows. A different shell can be specified as a string.
      */
    var shell: js.UndefOr[Boolean | String] = js.undefined
    
    /** The child's stdio configuration. */
    var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
    
    /** Sets the user identity of the process. */
    var uid: js.UndefOr[Double] = js.undefined
  }
  object SpawnProcessOptions {
    
    inline def apply(): SpawnProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpawnProcessOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpawnProcessOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setStdio(value: String | (js.Array[String | Double])): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (String | Double)*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
