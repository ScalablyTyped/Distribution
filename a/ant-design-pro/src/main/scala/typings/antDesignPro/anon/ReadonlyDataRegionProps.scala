package typings.antDesignPro.anon

import typings.antDesignPro.antDesignProStrings.downward
import typings.antDesignPro.antDesignProStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.DataRegionProps> */
trait ReadonlyDataRegionProps extends StObject {
  
  val content: js.UndefOr[String] = js.undefined
  
  val direction: js.UndefOr[upward | downward] = js.undefined
  
  val display: js.UndefOr[js.Object] = js.undefined
  
  val end: js.UndefOr[
    js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
  ] = js.undefined
  
  val lineLength: js.UndefOr[Double] = js.undefined
  
  val regionStyle: js.UndefOr[js.Object] = js.undefined
  
  val start: js.UndefOr[
    js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
  ] = js.undefined
  
  val style: js.UndefOr[js.Object] = js.undefined
  
  val top: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyDataRegionProps {
  
  inline def apply(): ReadonlyDataRegionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyDataRegionProps]
  }
  
  extension [Self <: ReadonlyDataRegionProps](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setEnd(
      value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
    ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    
    inline def setRegionStyle(value: js.Object): Self = StObject.set(x, "regionStyle", value.asInstanceOf[js.Any])
    
    inline def setRegionStyleUndefined: Self = StObject.set(x, "regionStyle", js.undefined)
    
    inline def setStart(
      value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
    ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
