package typings.antvScale

import typings.antvScale.typesMod.TickMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/esm/tick-method/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  def getTickMethod(key: String): TickMethod = js.native
  def registerTickMethod(key: String, method: TickMethod): Unit = js.native
}

