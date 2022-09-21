package typings.antvG2

import typings.antvG2.bboxMod.BBox
import typings.antvG2.constantMod.DIRECTION
import typings.antvG2.dependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionMod {
  
  @JSImport("@antv/g2/lib/util/direction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def directionToPosition(parentBBox: BBox, bbox: BBox, direction: DIRECTION): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("directionToPosition")(parentBBox.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  inline def getTranslateDirection(direction: DIRECTION, coordinate: Coordinate): DIRECTION = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateDirection")(direction.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[DIRECTION]
}
