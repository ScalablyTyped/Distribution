package typings.antvScale

import typings.antvScale.typesMod.TickMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/tick-method", JSImport.Namespace)
@js.native
object tickMethodMod extends js.Object {
  
  def getTickMethod(key: String): TickMethod = js.native
  
  def registerTickMethod(key: String, method: TickMethod): Unit = js.native
}
