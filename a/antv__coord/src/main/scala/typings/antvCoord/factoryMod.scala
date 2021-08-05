package typings.antvCoord

import typings.antvCoord.baseMod.CoordinateCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/coord/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCoordinate(`type`: String): CoordinateCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinate")(`type`.asInstanceOf[js.Any]).asInstanceOf[CoordinateCtor]
  
  inline def registerCoordinate(`type`: String, ctor: CoordinateCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCoordinate")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
