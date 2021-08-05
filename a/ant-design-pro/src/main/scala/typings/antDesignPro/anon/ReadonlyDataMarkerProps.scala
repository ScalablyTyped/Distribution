package typings.antDesignPro.anon

import typings.antDesignPro.antDesignProStrings.downward
import typings.antDesignPro.antDesignProStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.DataMarkerProps> */
trait ReadonlyDataMarkerProps extends StObject {
  
  val content: js.UndefOr[String] = js.undefined
  
  val direction: js.UndefOr[upward | downward] = js.undefined
  
  val display: js.UndefOr[js.Object] = js.undefined
  
  val lineLength: js.UndefOr[Double] = js.undefined
  
  val position: js.UndefOr[
    js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
  ] = js.undefined
  
  val style: js.UndefOr[js.Object] = js.undefined
  
  val top: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyDataMarkerProps {
  
  inline def apply(): ReadonlyDataMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyDataMarkerProps]
  }
  
  extension [Self <: ReadonlyDataMarkerProps](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    
    inline def setPosition(
      value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
