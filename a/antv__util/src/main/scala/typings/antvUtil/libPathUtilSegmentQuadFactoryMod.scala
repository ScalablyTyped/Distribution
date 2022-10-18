package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.libPathTypesMod.LengthFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilSegmentQuadFactoryMod {
  
  @JSImport("@antv/util/lib/path/util/segment-quad-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def segmentQuadFactory(
    x1: Double,
    y1: Double,
    qx: Double,
    qy: Double,
    x2: Double,
    y2: Double,
    distance: Double,
    options: PartialPathLengthFactoryO
  ): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentQuadFactory")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], qx.asInstanceOf[js.Any], qy.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
}
