package typings.adone.glossesStdMod

import typings.node.NodeJSNs.Module
import typings.node.TypeofClassModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "module")
@js.native
class module protected ()
  extends typings.node.moduleMod.^ {
  def this(id: String) = this()
  def this(id: String, parent: Module) = this()
}

/* static members */
@JSImport("adone/glosses/std", "module")
@js.native
object module extends js.Object {
  var Module: TypeofClassModule = js.native
  var builtinModules: js.Array[String] = js.native
  def createRequireFromPath(path: String): js.Function1[/* path */ String, _] = js.native
  def runMain(): Unit = js.native
  def wrap(code: String): String = js.native
}

