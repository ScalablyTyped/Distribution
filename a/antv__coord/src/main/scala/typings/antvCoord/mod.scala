package typings.antvCoord

import typings.antvCoord.baseMod.CoordinateCtor
import typings.antvCoord.baseMod.default
import typings.antvCoord.interfaceMod.CoordinateCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/coord", "Coordinate")
  @js.native
  abstract class Coordinate protected () extends default {
    def this(cfg: CoordinateCfg) = this()
  }
  
  @JSImport("@antv/coord", "getCoordinate")
  @js.native
  def getCoordinate(`type`: String): CoordinateCtor = js.native
  
  @JSImport("@antv/coord", "registerCoordinate")
  @js.native
  def registerCoordinate(`type`: String, ctor: CoordinateCtor): Unit = js.native
}
