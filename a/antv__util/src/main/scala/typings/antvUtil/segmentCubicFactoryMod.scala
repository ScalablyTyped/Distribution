package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.pathTypesMod.LengthFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentCubicFactoryMod {
  
  @JSImport("@antv/util/lib/path/util/segment-cubic-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def segmentCubicFactory(
    x1: Double,
    y1: Double,
    c1x: Double,
    c1y: Double,
    c2x: Double,
    c2y: Double,
    x2: Double,
    y2: Double,
    distance: Double,
    options: PartialPathLengthFactoryO
  ): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentCubicFactory")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], c1x.asInstanceOf[js.Any], c1y.asInstanceOf[js.Any], c2x.asInstanceOf[js.Any], c2y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
}
