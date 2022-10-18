package typings.antvG2

import typings.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutIntervalAdjustPositionMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/interval/adjust-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def intervalAdjustPosition(items: js.Array[LabelItem], labels: js.Array[IGroup], shapes: js.Array[IGroup | IShape]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("intervalAdjustPosition")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
