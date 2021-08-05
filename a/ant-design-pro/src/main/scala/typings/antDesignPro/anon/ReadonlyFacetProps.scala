package typings.antDesignPro.anon

import typings.bizcharts.anon.OffsetX
import typings.bizcharts.anon.OffsetY
import typings.bizcharts.mod.FacetType
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.FacetProps> */
trait ReadonlyFacetProps extends StObject {
  
  val autoSetAxis: js.UndefOr[Boolean] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val colTitle: js.UndefOr[OffsetY] = js.undefined
  
  val eachView: js.UndefOr[
    js.Function2[/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  val fields: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val margin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val rowTitle: js.UndefOr[OffsetX] = js.undefined
  
  val showTitle: js.UndefOr[Boolean] = js.undefined
  
  val `type`: js.UndefOr[FacetType] = js.undefined
}
object ReadonlyFacetProps {
  
  inline def apply(): ReadonlyFacetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyFacetProps]
  }
  
  extension [Self <: ReadonlyFacetProps](x: Self) {
    
    inline def setAutoSetAxis(value: Boolean): Self = StObject.set(x, "autoSetAxis", value.asInstanceOf[js.Any])
    
    inline def setAutoSetAxisUndefined: Self = StObject.set(x, "autoSetAxis", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColTitle(value: OffsetY): Self = StObject.set(x, "colTitle", value.asInstanceOf[js.Any])
    
    inline def setColTitleUndefined: Self = StObject.set(x, "colTitle", js.undefined)
    
    inline def setEachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachView", js.Any.fromFunction2(value))
    
    inline def setEachViewUndefined: Self = StObject.set(x, "eachView", js.undefined)
    
    inline def setFields(value: String | js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRowTitle(value: OffsetX): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    inline def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setType(value: FacetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
