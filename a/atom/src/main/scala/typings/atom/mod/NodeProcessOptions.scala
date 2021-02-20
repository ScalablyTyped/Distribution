package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeProcessOptions extends StObject {
  
  /** The array of arguments to pass to the command. */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /** The command to execute. */
  var command: String = js.native
  
  /** The callback which receives a single argument containing the exit status. */
  var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.native
  
  /** The options object to pass to Node's ChildProcess.spawn method. */
  var options: js.UndefOr[SpawnProcessOptions] = js.native
  
  /**
    *  The callback that receives a single argument which contains the standard
    *  error output from the command.
    */
  var stderr: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  
  /**
    *  The callback that receives a single argument which contains the standard
    *  output from the command.
    */
  var stdout: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
}
object NodeProcessOptions {
  
  @scala.inline
  def apply(command: String): NodeProcessOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProcessOptions]
  }
  
  @scala.inline
  implicit class NodeProcessOptionsMutableBuilder[Self <: NodeProcessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: /* code */ Double => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setOptions(value: SpawnProcessOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setStderr(value: /* data */ String => Unit): Self = StObject.set(x, "stderr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    @scala.inline
    def setStdout(value: /* data */ String => Unit): Self = StObject.set(x, "stdout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
  }
}
