package typings.antvG2

import typings.antvG2.labelInterfaceMod.LabelItem
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitInCanvasMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/limit-in-canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def limitInCanvas(
    items: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("limitInCanvas")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
