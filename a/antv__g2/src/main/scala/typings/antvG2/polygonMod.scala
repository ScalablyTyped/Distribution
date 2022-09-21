package typings.antvG2

import typings.antvG2.libInterfaceMod.ShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  @JSImport("@antv/g2/lib/geometry/polygon", JSImport.Default)
  @js.native
  open class default () extends Polygon
  
  @js.native
  trait Polygon
    extends typings.antvG2.geometryBaseMod.default[ShapePoint]
}
