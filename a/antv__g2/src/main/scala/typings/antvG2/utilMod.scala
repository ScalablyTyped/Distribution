package typings.antvG2

import typings.antvG2.dependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.GAnimateCfg
import typings.antvG2.libInterfaceMod.Point
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/g2/lib/animate/animation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doScaleAnimate(element: IGroup, animateCfg: GAnimateCfg, coordinate: Coordinate, yMinPoint: Point, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doScaleAnimate")(element.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], yMinPoint.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doScaleAnimate(element: IShape, animateCfg: GAnimateCfg, coordinate: Coordinate, yMinPoint: Point, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doScaleAnimate")(element.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], yMinPoint.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformShape(shape: IGroup, vector: js.Tuple2[Double, Double], direct: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformShape")(shape.asInstanceOf[js.Any], vector.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def transformShape(shape: IShape, vector: js.Tuple2[Double, Double], direct: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformShape")(shape.asInstanceOf[js.Any], vector.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
