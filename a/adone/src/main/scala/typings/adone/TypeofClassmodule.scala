package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.glossesStdMod.module
import typings.node.TypeofClassModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassmodule extends Instantiable1[/* id */ String, module] {
  var Module: TypeofClassModule = js.native
  var builtinModules: js.Array[String] = js.native
  def createRequireFromPath(path: String): js.Function1[/* path */ String, _] = js.native
  def runMain(): Unit = js.native
  def wrap(code: String): String = js.native
}

