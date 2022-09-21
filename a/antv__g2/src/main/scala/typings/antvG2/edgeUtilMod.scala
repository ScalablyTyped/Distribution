package typings.antvG2

import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgeUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/edge/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCPath(from: Point, to: Point): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCPath")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  inline def getQPath(to: Point, center: Point): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQPath")(to.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
