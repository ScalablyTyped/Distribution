package typings.antDesignPro.anon

import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.TextProps> */
trait ReadonlyTextProps extends StObject {
  
  val content: js.UndefOr[String] = js.undefined
  
  val offsetX: js.UndefOr[Double] = js.undefined
  
  val offsetY: js.UndefOr[Double] = js.undefined
  
  val position: js.UndefOr[
    js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
  ] = js.undefined
  
  val style: js.UndefOr[text] = js.undefined
  
  val top: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyTextProps {
  
  inline def apply(): ReadonlyTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyTextProps]
  }
  
  extension [Self <: ReadonlyTextProps](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPosition(
      value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
