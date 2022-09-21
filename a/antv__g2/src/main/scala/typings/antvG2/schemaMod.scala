package typings.antvG2

import typings.antvG2.libInterfaceMod.ShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("@antv/g2/lib/geometry/schema", JSImport.Default)
  @js.native
  open class default () extends Schema
  
  @js.native
  trait Schema
    extends typings.antvG2.geometryBaseMod.default[ShapePoint]
}
