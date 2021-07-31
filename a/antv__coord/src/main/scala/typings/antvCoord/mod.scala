package typings.antvCoord

import typings.antvCoord.baseMod.CoordinateCtor
import typings.antvCoord.baseMod.default
import typings.antvCoord.interfaceMod.CoordinateCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/coord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/coord", "Coordinate")
  @js.native
  abstract class Coordinate protected () extends default {
    def this(cfg: CoordinateCfg) = this()
  }
  
  @scala.inline
  def getCoordinate(`type`: String): CoordinateCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinate")(`type`.asInstanceOf[js.Any]).asInstanceOf[CoordinateCtor]
  
  @scala.inline
  def registerCoordinate(`type`: String, ctor: CoordinateCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCoordinate")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
