package typings.antvG2

import typings.antvG2.libGeometryLabelInterfaceMod.PolarLabelItem
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutPieOuterMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/pie/outer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pieOuterLabelLayout(
    originalItems: js.Array[PolarLabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pieOuterLabelLayout")(originalItems.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
