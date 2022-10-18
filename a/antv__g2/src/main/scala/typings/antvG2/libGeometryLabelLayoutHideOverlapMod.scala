package typings.antvG2

import typings.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutHideOverlapMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/hide-overlap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hideOverlap(
    labelItems: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hideOverlap")(labelItems.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
