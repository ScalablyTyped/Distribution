package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "module")
@js.native
class module protected ()
  extends nodeLib.moduleMod.namespaced {
  def this(id: java.lang.String) = this()
  def this(id: java.lang.String, parent: nodeLib.NodeJSNs.Module) = this()
}

@JSImport("adone/glosses/std", "module")
@js.native
object module extends js.Object {
  var Module: ScalablyTyped.runtime.Instantiable2[
    /* id */ java.lang.String, 
    /* parent */ js.UndefOr[/* parent */ nodeLib.NodeJSNs.Module], 
    nodeLib.NodeJSNs.Module
  ] = js.native
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequireFromPath(path: java.lang.String): js.Function1[/* path */ java.lang.String, _] = js.native
  def runMain(): scala.Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

