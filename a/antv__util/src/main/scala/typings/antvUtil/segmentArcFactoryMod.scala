package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.pathTypesMod.LengthFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentArcFactoryMod {
  
  @JSImport("@antv/util/lib/path/util/segment-arc-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def segmentArcFactory(
    X1: Double,
    Y1: Double,
    RX: Double,
    RY: Double,
    angle: Double,
    LAF: Double,
    SF: Double,
    X2: Double,
    Y2: Double,
    distance: Double,
    options: PartialPathLengthFactoryO
  ): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentArcFactory")(X1.asInstanceOf[js.Any], Y1.asInstanceOf[js.Any], RX.asInstanceOf[js.Any], RY.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], LAF.asInstanceOf[js.Any], SF.asInstanceOf[js.Any], X2.asInstanceOf[js.Any], Y2.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
}
