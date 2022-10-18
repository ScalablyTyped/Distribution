package typings.antvG2

import typings.antvG2.anon.namestringvaluestringMark
import typings.antvG2.antvG2Strings.horizontal
import typings.antvG2.antvG2Strings.vertical
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libConstantMod.DIRECTION
import typings.antvG2.libDependentsMod.Attribute
import typings.antvG2.libGeometryBaseMod.default
import typings.antvG2.libInterfaceMod.LegendItem
import typings.antvG2.libInterfaceMod.MarkerCfg
import typings.antvG2.libInterfaceMod.ShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilLegendMod {
  
  @JSImport("@antv/g2/lib/util/legend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCustomLegendItems(themeMarker: js.Object, userMarker: js.Object, customItems: js.Array[LegendItem]): js.Array[LegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCustomLegendItems")(themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any], customItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[LegendItem]]
  
  inline def getLegendItems(view: View, geometry: default[ShapePoint], attr: Attribute, themeMarker: js.Object): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
  inline def getLegendItems(
    view: View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object,
    userMarker: js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg]
  ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
  inline def getLegendItems(
    view: View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object,
    userMarker: MarkerCfg
  ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
  
  inline def getLegendLayout(direction: DIRECTION): vertical | horizontal = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegendLayout")(direction.asInstanceOf[js.Any]).asInstanceOf[vertical | horizontal]
  
  inline def getLegendThemeCfg(theme: js.Object, direction: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendThemeCfg")(theme.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /** item of @antv/component legend  */
  /* Inlined std.Omit<@antv/g2.@antv/g2/lib/interface.LegendItem, 'marker'> & {  marker :any} */
  trait ComponentLegendItem extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var marker: Any
    
    var name: String
    
    var unchecked: js.UndefOr[Boolean] = js.undefined
    
    var value: Any
  }
  object ComponentLegendItem {
    
    inline def apply(marker: Any, name: String, value: Any): ComponentLegendItem = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentLegendItem]
    }
    
    extension [Self <: ComponentLegendItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMarker(value: Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnchecked(value: Boolean): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      inline def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
