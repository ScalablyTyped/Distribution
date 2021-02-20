package typings.antvScale

import typings.antvScale.typesMod.TickMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tickMethodMod {
  
  @JSImport("@antv/scale/lib/tick-method", "getTickMethod")
  @js.native
  def getTickMethod(key: String): TickMethod = js.native
  
  @JSImport("@antv/scale/lib/tick-method", "registerTickMethod")
  @js.native
  def registerTickMethod(key: String, method: TickMethod): Unit = js.native
}
