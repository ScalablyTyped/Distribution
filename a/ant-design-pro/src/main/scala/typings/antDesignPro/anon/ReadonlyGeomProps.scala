package typings.antDesignPro.anon

import typings.antvG2.mod.Styles.line
import typings.bizcharts.anon.DodgeBy
import typings.bizcharts.mod.GeomType
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.GeomProps> */
trait ReadonlyGeomProps extends StObject {
  
  val active: js.UndefOr[Boolean] = js.undefined
  
  val adjust: js.UndefOr[String | (js.Array[DodgeBy | String])] = js.undefined
  
  val animate: js.UndefOr[js.Any] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val color: js.UndefOr[
    String | (js.Tuple2[
      String, 
      js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String]) | String
    ])
  ] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val line: js.UndefOr[typings.antvG2.mod.Styles.line | Boolean] = js.undefined
  
  val opacity: js.UndefOr[
    String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[js.Any], Double]])
  ] = js.undefined
  
  val position: js.UndefOr[String] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val select: js.UndefOr[Boolean | (js.Tuple2[Boolean, js.Any])] = js.undefined
  
  val selected: js.UndefOr[Boolean] = js.undefined
  
  val shape: js.UndefOr[
    String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String])])
  ] = js.undefined
  
  val size: js.UndefOr[
    Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[js.Any], Double]) | (js.Tuple2[Double, Double])
    ])
  ] = js.undefined
  
  val style: js.UndefOr[js.Object | (js.Tuple2[String, js.Object])] = js.undefined
  
  val tooltip: js.UndefOr[
    Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ js.Any, typings.bizcharts.anon.Name]])
  ] = js.undefined
  
  val `type`: js.UndefOr[GeomType] = js.undefined
}
object ReadonlyGeomProps {
  
  inline def apply(): ReadonlyGeomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyGeomProps]
  }
  
  extension [Self <: ReadonlyGeomProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdjust(value: String | (js.Array[DodgeBy | String])): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
    
    inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    inline def setAdjustVarargs(value: (DodgeBy | String)*): Self = StObject.set(x, "adjust", js.Array(value :_*))
    
    inline def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(
      value: String | (js.Tuple2[
          String, 
          js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String]) | String
        ])
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLine(value: line | Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOpacity(value: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[js.Any], Double]])): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSelect(value: Boolean | (js.Tuple2[Boolean, js.Any])): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[js.Any], String])])
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(
      value: Double | String | (js.Tuple2[
          String, 
          (js.Function1[/* d */ js.UndefOr[js.Any], Double]) | (js.Tuple2[Double, Double])
        ])
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: js.Object | (js.Tuple2[String, js.Object])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTooltip(
      value: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ js.Any, typings.bizcharts.anon.Name]])
    ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: GeomType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
