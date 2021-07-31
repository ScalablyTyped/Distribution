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
  
  @scala.inline
  def apply(): ReadonlyFacetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyFacetProps]
  }
  
  @scala.inline
  implicit class ReadonlyFacetPropsMutableBuilder[Self <: ReadonlyFacetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSetAxis(value: Boolean): Self = StObject.set(x, "autoSetAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSetAxisUndefined: Self = StObject.set(x, "autoSetAxis", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColTitle(value: OffsetY): Self = StObject.set(x, "colTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColTitleUndefined: Self = StObject.set(x, "colTitle", js.undefined)
    
    @scala.inline
    def setEachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachView", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachViewUndefined: Self = StObject.set(x, "eachView", js.undefined)
    
    @scala.inline
    def setFields(value: String | js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRowTitle(value: OffsetX): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setType(value: FacetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
