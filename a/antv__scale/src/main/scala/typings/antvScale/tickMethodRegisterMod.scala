package typings.antvScale

import typings.antvScale.libTypesMod.TickMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/tick-method/register", JSImport.Namespace)
@js.native
object tickMethodRegisterMod extends js.Object {
  def getTickMethod(key: String): TickMethod = js.native
  def registerTickMethod(key: String, method: TickMethod): Unit = js.native
}

