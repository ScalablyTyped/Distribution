package typings.antDesignPro.anon

import typings.antvG2.mod.Styles.background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.RegionProps> */
trait ReadonlyRegionProps extends StObject {
  
  val end: js.UndefOr[
    js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
  ] = js.undefined
  
  val start: js.UndefOr[
    js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
  ] = js.undefined
  
  val style: js.UndefOr[background] = js.undefined
  
  val top: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyRegionProps {
  
  inline def apply(): ReadonlyRegionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyRegionProps]
  }
  
  extension [Self <: ReadonlyRegionProps](x: Self) {
    
    inline def setEnd(
      value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
    ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    inline def setStart(
      value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
    ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    inline def setStyle(value: background): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
