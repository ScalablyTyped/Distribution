package typings.antvUtil

import typings.antvUtil.libPathTypesMod.LengthFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilSegmentLineFactoryMod {
  
  @JSImport("@antv/util/lib/path/util/segment-line-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def segmentLineFactory(x1: Double, y1: Double, x2: Double, y2: Double, distance: Double): LengthFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("segmentLineFactory")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[LengthFactory]
}
