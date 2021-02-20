package typings.antvCoord

import typings.antvCoord.baseMod.CoordinateCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/coord/lib/factory", "getCoordinate")
  @js.native
  def getCoordinate(`type`: String): CoordinateCtor = js.native
  
  @JSImport("@antv/coord/lib/factory", "registerCoordinate")
  @js.native
  def registerCoordinate(`type`: String, ctor: CoordinateCtor): Unit = js.native
}
