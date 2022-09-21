package typings.antvG2

import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.RangePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitPointsMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/util/split-points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitPoints(obj: RangePoint): js.Array[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitPoints")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Point]]
}
