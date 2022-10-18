package typings.antvG2

import typings.antvG2.libChartViewMod.View
import typings.antvG2.libGeometryBaseMod.default
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvG2.libInterfaceMod.TooltipCfg
import typings.antvG2.libInterfaceMod.TooltipTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTooltipMod {
  
  @JSImport("@antv/g2/lib/util/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findDataByPoint(point: Point, data: js.Array[MappingDatum], geometry: default[ShapePoint]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findDataByPoint")(point.asInstanceOf[js.Any], data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def findItemsFromView(view: View, point: Point, tooltipCfg: TooltipCfg): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findItemsFromView")(view.asInstanceOf[js.Any], point.asInstanceOf[js.Any], tooltipCfg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def findItemsFromViewRecurisive(view: View, point: Point, tooltipCfg: TooltipCfg): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findItemsFromViewRecurisive")(view.asInstanceOf[js.Any], point.asInstanceOf[js.Any], tooltipCfg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: Unit, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
