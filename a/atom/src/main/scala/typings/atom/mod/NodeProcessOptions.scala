package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProcessOptions extends js.Object {
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
  implicit class NodeProcessOptionsOps[Self <: NodeProcessOptions] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setExit(value: /* code */ Double => Unit): Self = this.set("exit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setOptions(value: SpawnProcessOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setStderr(value: /* data */ String => Unit): Self = this.set("stderr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdout(value: /* data */ String => Unit): Self = this.set("stdout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
  
}

