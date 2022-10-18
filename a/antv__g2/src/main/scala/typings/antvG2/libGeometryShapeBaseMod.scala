package typings.antvG2

import typings.antvG2.libInterfaceMod.RegisterShape
import typings.antvG2.libInterfaceMod.RegisterShapeFactory
import typings.antvG2.libInterfaceMod.Shape
import typings.antvG2.libInterfaceMod.ShapeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryShapeBaseMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getShapeFactory(factoryName: String): ShapeFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getShapeFactory")(factoryName.asInstanceOf[js.Any]).asInstanceOf[ShapeFactory]
  
  inline def registerShape(factoryName: String, shapeType: String, cfg: RegisterShape): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShape")(factoryName.asInstanceOf[js.Any], shapeType.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Shape]
  
  inline def registerShapeFactory(factoryName: String, cfg: RegisterShapeFactory): ShapeFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShapeFactory")(factoryName.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[ShapeFactory]
}
