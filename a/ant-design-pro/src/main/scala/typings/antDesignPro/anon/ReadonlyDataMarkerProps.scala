package typings.antDesignPro.anon

import typings.antDesignPro.antDesignProStrings.downward
import typings.antDesignPro.antDesignProStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.DataMarkerProps> */
@js.native
trait ReadonlyDataMarkerProps extends StObject {
  
  val content: js.UndefOr[String] = js.native
  
  val direction: js.UndefOr[upward | downward] = js.native
  
  val display: js.UndefOr[js.Object] = js.native
  
  val lineLength: js.UndefOr[Double] = js.native
  
  val position: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  val style: js.UndefOr[js.Object] = js.native
  
  val top: js.UndefOr[Boolean] = js.native
}
object ReadonlyDataMarkerProps {
  
  @scala.inline
  def apply(): ReadonlyDataMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyDataMarkerProps]
  }
  
  @scala.inline
  implicit class ReadonlyDataMarkerPropsMutableBuilder[Self <: ReadonlyDataMarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    
    @scala.inline
    def setPosition(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
