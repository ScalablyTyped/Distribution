package typings.antvG2

import typings.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutPieDistributeMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/pie/distribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distribute(
    items: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("distribute")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
