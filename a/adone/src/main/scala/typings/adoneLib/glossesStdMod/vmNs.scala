package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "vm")
@js.native
object vmNs extends js.Object {
  @js.native
  class Script protected ()
    extends nodeLib.vmMod.Script {
    def this(code: java.lang.String) = this()
    def this(code: java.lang.String, options: nodeLib.vmMod.ScriptOptions) = this()
  }
  
  def compileFunction(
    code: java.lang.String,
    params: js.Array[java.lang.String],
    options: nodeLib.vmMod.CompileFunctionOptions
  ): js.Function = js.native
  def createContext(): nodeLib.vmMod.Context = js.native
  def createContext(sandbox: nodeLib.vmMod.Context): nodeLib.vmMod.Context = js.native
  def createContext(sandbox: nodeLib.vmMod.Context, options: nodeLib.vmMod.CreateContextOptions): nodeLib.vmMod.Context = js.native
  def isContext(sandbox: nodeLib.vmMod.Context): scala.Boolean = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: nodeLib.vmMod.Context): js.Any = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: nodeLib.vmMod.Context, options: java.lang.String): js.Any = js.native
  def runInContext(
    code: java.lang.String,
    contextifiedSandbox: nodeLib.vmMod.Context,
    options: nodeLib.vmMod.RunningScriptOptions
  ): js.Any = js.native
  def runInNewContext(code: java.lang.String): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: nodeLib.vmMod.Context): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: nodeLib.vmMod.Context, options: java.lang.String): js.Any = js.native
  def runInNewContext(
    code: java.lang.String,
    sandbox: nodeLib.vmMod.Context,
    options: nodeLib.vmMod.RunningScriptOptions
  ): js.Any = js.native
  def runInThisContext(code: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: nodeLib.vmMod.RunningScriptOptions): js.Any = js.native
}

