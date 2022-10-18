package typings.antvG2

import typings.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutAdjustColorMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/adjust-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustColor(items: js.Array[LabelItem], labels: js.Array[IGroup], shapes: js.Array[IGroup | IShape]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustColor")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
