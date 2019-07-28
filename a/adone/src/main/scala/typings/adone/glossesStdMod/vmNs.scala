package typings.adone.glossesStdMod

import typings.node.vmMod.CompileFunctionOptions
import typings.node.vmMod.Context
import typings.node.vmMod.CreateContextOptions
import typings.node.vmMod.RunningScriptOptions
import typings.node.vmMod.ScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "vm")
@js.native
object vmNs extends js.Object {
  @js.native
  class Script protected ()
    extends typings.node.vmMod.Script {
    def this(code: String) = this()
    def this(code: String, options: ScriptOptions) = this()
  }
  
  def compileFunction(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
  def createContext(): Context = js.native
  def createContext(sandbox: Context): Context = js.native
  def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
  def isContext(sandbox: Context): Boolean = js.native
  def runInContext(code: String, contextifiedSandbox: Context): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: String): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInNewContext(code: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context, options: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInThisContext(code: String): js.Any = js.native
  def runInThisContext(code: String, options: String): js.Any = js.native
  def runInThisContext(code: String, options: RunningScriptOptions): js.Any = js.native
}

