package typings.antvG2

import org.scalablytyped.runtime.Shortcut
import typings.antvG2.libInterfaceMod.ShapeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapeEdgeMod extends Shortcut {
  
  @JSImport("@antv/g2/lib/geometry/shape/edge", JSImport.Default)
  @js.native
  val default: ShapeFactory = js.native
  
  type _To = ShapeFactory
  
  /* This means you don't have to write `default`, but can instead just say `libGeometryShapeEdgeMod.foo` */
  override def _to: ShapeFactory = default
}
